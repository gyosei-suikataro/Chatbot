package jp.co.gyosei.botlog;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jp.co.gyosei.botlog.MyUserDetailsService;

@Configuration 
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter { 

	@Autowired
	private MyUserDetailsService myUserDetailsService;

	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private static final String USER_QUERY = "SELECT custid, password, effect FROM custinfo WHERE custid = ?";
	private static final String ROLE_QUERY = "SELECT custid, role FROM custinfo WHERE custid = ?";

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(USER_QUERY)
		.authoritiesByUsernameQuery(ROLE_QUERY);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/**").hasAnyAuthority("ADMIN","USER")
		.and()
		.formLogin()
		.loginProcessingUrl("/loading")
		.loginPage("/")
		//.failureUrl("?error")
		.defaultSuccessUrl("/Customer", true)
		.usernameParameter("custid")
		.passwordParameter("password");

		http
		.rememberMe()
		.tokenValiditySeconds(86400); 

		http
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/")
		.deleteCookies("JSESSIONID")
		.invalidateHttpSession(true)
		.permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.authenticationProvider(createAuthProvider()); 
	}

	private AuthenticationProvider createAuthProvider() { 

		DaoAuthenticationProvider authProvider = 
				new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(myUserDetailsService);
		authProvider.setPasswordEncoder(new BCryptPasswordEncoder());

		return authProvider; 
	}
}

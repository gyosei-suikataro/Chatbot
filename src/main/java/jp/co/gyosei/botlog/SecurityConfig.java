package jp.co.gyosei.botlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration 
@EnableWebSecurity
@SpringBootApplication
public class SecurityConfig extends WebSecurityConfigurerAdapter { 

	@Autowired
	private MyUserDetailsService myUserDetailsService;

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
	/*
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(myUserDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
	 */
	
	@Autowired
 	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
 		auth
 		.inMemoryAuthentication()
 		.withUser("user").password("password").roles("USER");
 	}
	
}

package com.example.sample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Controller
@SpringBootApplication
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(
				"/images/**",
				"/css/**",
				"/javascript/**",
				"/webjars/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").permitAll()

		.antMatchers("/**").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Home").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/signup").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/userlist").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Account").hasAuthority("ADMIN")
		.antMatchers("/logout").hasAnyAuthority("ADMIN","USER")
		//.antMatchers("/User/**").hasAuthority("ADMIN")

		.anyRequest().authenticated(); 

		http.csrf().disable().formLogin()
		.loginProcessingUrl("/processing")
		.loginPage("/login")
		//.failureHandler(new SampleAuthenticationFailureHandler())
		.defaultSuccessUrl("/signup")
		.usernameParameter("custid").passwordParameter("password")
		.and();

		http.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))
		.logoutSuccessUrl("/login").deleteCookies("JSESSIONID")
		.invalidateHttpSession(true).permitAll()
		.and()
		.csrf()
		.disable();
	}

	/*
	@Bean
	PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	 */

	@Configuration
	public class SecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
			.withUser("user").password("user").roles("USER")
			.and()
			.withUser("admin").password("admin").roles("ADMIN");
		}
	}

}


package com.example.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
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
		web.ignoring().antMatchers("/webjars/**", "/css/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/**").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Home").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/signup").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/userlist").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/Account").hasAuthority("ADMIN")
		.antMatchers("/logout").hasAnyAuthority("ADMIN","USER")
		//.antMatchers("/User/**").hasAuthority("ADMIN")
		.and()
		.formLogin()
		.defaultSuccessUrl("/signup", true)
		.and()
		.logout()
		.logouturl("/logout")
		.logoutSuccessUrl("/")
		.deleteCookies("JSESSIONID")
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
}

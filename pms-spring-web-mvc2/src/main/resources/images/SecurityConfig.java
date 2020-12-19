package com.wellsfargo.batch5.pms.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder builder = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(builder.username("user").password("user").roles("USER"))
				.withUser(builder.username("admin").password("admin").roles("ADMIN"))
				.withUser(builder.username("bouser").password("bouser").roles("BOUSER"));

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests() 
		
				.antMatchers("/user/**").hasRole("USER")
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/bouser/**").hasRole("BOUSER")
				.antMatchers("/images/**").permitAll()
				.antMatchers("/css/**").permitAll()
				.antMatchers("/Register").permitAll()
				.anyRequest()				
				.authenticated().and().formLogin().defaultSuccessUrl("/index").loginPage("/login-form").loginProcessingUrl("/validate").permitAll()
				//.formLogin().failureUrl("/error").defaultSuccessUrl("/user/userHome").loginPage("/index").permitAll();
				.and().logout().permitAll()
				.and().exceptionHandling().accessDeniedPage("/pages/access-denied-page.jsp");

	}
	

}

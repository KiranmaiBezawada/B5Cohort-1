package com.wellsfargo.batch5.pms.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfigration extends WebSecurityConfigurerAdapter{
	
	
	/*private UserDetailsImplementation userDetailsImplementation;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsImplementation).passwordEncoder(passwordEncoder());

	}*/
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder(){ return new
	 * BCryptPasswordEncoder();
	 * 
	 * }
	 */
		
	/*
	 * @Override public void configure(WebSecurity web) throws Exception{
	 * super.configure(web);
	 * 
	 * }
	 */

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			UserBuilder builder = User.withDefaultPasswordEncoder();
			auth.inMemoryAuthentication().withUser(builder.username("user").password("user").roles("USER"))
					.withUser(builder.username("admin").password("admin").roles("ADMIN"));

		}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests() 
		
				.antMatchers("/user/**").hasRole("USER")
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/css/**").permitAll()
				.anyRequest()				
				.authenticated().and().formLogin().failureUrl("/login?error=true").defaultSuccessUrl("/adminHomePage").loginPage("/adminLogin").loginProcessingUrl("/validate").permitAll()
				//.formLogin().failureUrl("/error").defaultSuccessUrl("/user/userHome").loginPage("/index").permitAll();
				.and().logout().permitAll().and().exceptionHandling().accessDeniedPage("/access-denied");

	}
		
	/*@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/admin/**","/user/**").hasAnyAuthority("user","admin")
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/user/**").hasRole("USER")
		.antMatchers("/bouser/**").hasRole("BOUSER")
		.antMatchers("/images/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/static/**").permitAll()
		.antMatchers("/resources/**").permitAll()
		
		//System.out.println(http.formLogin().loginPage("/login").usernameParameter("unm"));
		
		.anyRequest().authenticated()
		//.formLogin().defaultSuccessUrl("/index").loginPage("/login-form").loginProcessingUrl("/validate").permitAll()
		
		.and().formLogin().loginPage("/login").failureUrl("/login?error=true").loginProcessingUrl("/validate").defaultSuccessUrl("/home").permitAll();
				//.usernameParameter("unm").passwordParameter("pwd");

		http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
		
		http.exceptionHandling().accessDeniedPage("/pages/access-denied-page.jsp");
		
	}*/

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.authorizeRequests()
	 * 
	 * .antMatchers("/user/**").hasRole("USER")
	 * .antMatchers("/admin/**").hasRole("ADMIN")
	 * .antMatchers("/css/**").permitAll() .antMatchers("/Register").permitAll()
	 * .anyRequest()
	 * .authenticated().and().formLogin().defaultSuccessUrl("/index").loginPage(
	 * "/login-form").loginProcessingUrl("/validate").permitAll()
	 * //.formLogin().failureUrl("/error").defaultSuccessUrl("/user/userHome").
	 * loginPage("/index").permitAll();
	 * .and().logout().permitAll().and().exceptionHandling().accessDeniedPage(
	 * "/access-denied");
	 * 
	 * }
	 */


}

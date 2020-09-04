package com.security.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource springSecutiryDataSource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	auth.jdbcAuthentication().dataSource(springSecutiryDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/home")
				.access("hasRole('EMPLOYEE') or hasRole('MANAGER')or hasRole('ADMIN')").antMatchers("/employees/**")
				.hasRole("EMPLOYEE").antMatchers("/leaders/**").hasRole("MANAGER").antMatchers("/systems/**")
				.hasRole("ADMIN").and().formLogin().loginPage("/showloginpage")
				.loginProcessingUrl("/authenticatetheuser").permitAll().and().logout().logoutSuccessUrl("/") // after
																												// logout
																												// redirect
																												// to
																												// landing
																												// page
																												// (root)
				.permitAll().and().exceptionHandling().accessDeniedPage("/access-denied");
	}

}

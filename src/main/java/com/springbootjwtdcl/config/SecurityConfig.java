package com.springbootjwtdcl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.springbootjwtdcl.filter.JwtRequestFilter;


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	@Autowired
    private JwtRequestFilter jwtRequestFilter;
	
	 public void configure(HttpSecurity http) throws Exception {
	        http.csrf()
	                .disable()
	                .authorizeRequests()
	                .antMatchers("/register")
	                .permitAll();
	        http.addFilterBefore(jwtRequestFilter,
	                UsernamePasswordAuthenticationFilter.class)
	                .csrf().disable();
	    }
}

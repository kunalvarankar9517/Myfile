package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MySecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Autowired
	private CustomUserDetailService customeUserServiceDetails;
	
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf()
		.disable()
		.cors()
		.disable()
		.authorizeRequests();
		.antMatchers(.antPatterns "/token");
		.anyRequest.authenticated()
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	
	// over 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.userServiceDetail(customeDetailService){
			
		}
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		
		@Bean
		public AuthenticationManager authenticationManagerBean() throws Exception {
			
			return super.authenticationManagerBean();
			
		}
	}
	
	
}

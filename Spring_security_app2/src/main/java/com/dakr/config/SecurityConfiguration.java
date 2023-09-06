package com.dakr.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain methodsSecurity(HttpSecurity http) throws Exception {
		 http.authorizeHttpRequests((request) -> request.antMatchers("/home","/About","/contact")
				 .permitAll().anyRequest().authenticated()).formLogin();
		 return http.build();
	}
}

package com.dakr.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private DataSource dataSource;
	@SuppressWarnings("deprecation")
	@Autowired
	public void authManager(AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(NoOpPasswordEncoder.getInstance())
	.usersByUsernameQuery("Select username,password, enabled from users_tbl where username=?")
	.authoritiesByUsernameQuery("select username, authority from authorities where username = ?");
	}
	
	public SecurityFilterChain methodFilter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req)-> req
				.antMatchers("/admin").hasRole("ADMIN")
				.antMatchers("/user").hasAnyRole("ADMIN","USER")
				.antMatchers("/home").permitAll()
				.anyRequest().authenticated()).formLogin();
		return http.build();
	}
}

package com.shoot.mimi.portal.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/","/index").permitAll()
				.anyRequest().authenticated()//表示其他的请求都必须要有权限认证
				.and().formLogin().permitAll();
		super.configure(http);
	}

	
	
	@Bean
	public CustomUserDetailsService customUserDetailsService() {
		System.out.println("2222222222222222222222222");
		return new CustomUserDetailsService();
	}



	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("11111111111111111111111111111111111");
		super.configure(auth);
	}



	@Override
	public void init(WebSecurity web) throws Exception {
		System.out.println("0000000000000000000000000000");
		super.init(web);
	}



	@Override
	public void configure(WebSecurity web) throws Exception {
		System.out.println("555555555555555555555555555555");
		super.configure(web);
	}
	
	
	
	
}

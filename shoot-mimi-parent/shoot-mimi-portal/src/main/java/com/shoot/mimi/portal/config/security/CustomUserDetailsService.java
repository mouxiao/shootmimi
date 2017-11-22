package com.shoot.mimi.portal.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import com.shoot.mimi.portal.entity.PlaUser;
import com.shoot.mimi.portal.service.PlaUserService;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private PlaUserService plaUserService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		PlaUser user = plaUserService.getUserByUserNameAndPassword(userName);
		Assert.isNull(user, "该用户名不存在!");
		
		System.out.println("-----------------------------------------------------------");
		return user;
	}

}

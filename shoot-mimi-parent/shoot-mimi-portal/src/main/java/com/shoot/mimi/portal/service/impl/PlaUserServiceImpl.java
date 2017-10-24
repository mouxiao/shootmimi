package com.shoot.mimi.portal.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoot.mimi.portal.entity.PlaUser;
import com.shoot.mimi.portal.mapper.PlaUserMapper;
import com.shoot.mimi.portal.service.PlaUserService;

@Service("plaUserService")
public class PlaUserServiceImpl implements PlaUserService{

	@Autowired
	private PlaUserMapper userMapper;
	
	@Override
	public PlaUser getUserByUserNameAndPassword(String userName) {
		return userMapper.getUserOne(userName);
	}

}

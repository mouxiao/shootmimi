package com.shoot.mimi.portal.service;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.shoot.mimi.portal.entity.PlaUser;

public interface PlaUserService {
	
	public PlaUser getUserByUserNameAndPassword(Map<String, Object> map);
	
	
}

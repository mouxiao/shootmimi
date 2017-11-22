package com.shoot.mimi.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoot.mimi.portal.entity.PlaUser;
import com.shoot.mimi.portal.service.PlaUserService;

@RestController
public class TestController {

	@Autowired
	private PlaUserService userService; 
	
	@GetMapping("/api/get")
	public PlaUser get() {
		return	userService.getUserByUserNameAndPassword("mouxiao");
	}
}

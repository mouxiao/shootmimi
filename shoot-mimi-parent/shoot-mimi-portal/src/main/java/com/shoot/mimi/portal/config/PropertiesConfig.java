package com.shoot.mimi.portal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "spring.datasource")
@Data
@Component
public class PropertiesConfig {
	@Value("url")
	public static  String url;
	@Value("username")
	public  String username;
	@Value("password")
	public  String password;
	@Value("driverName")
	public  String driverName;
	@Value("maxIdle")
	public  String maxIdle;
	@Value("maxWait")
	public  String maxWait;
	@Value("minIdle")
	public  String minIdle;
	@Value("initialSize")
	public  String initialSize;
}

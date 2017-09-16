package com.shoot.mimi.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 * @author mouxiao(272175223@qq.com)
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ShootMimiEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShootMimiEurekaServerApplication.class, args);
	}
}

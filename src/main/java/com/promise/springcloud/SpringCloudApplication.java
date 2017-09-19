package com.promise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright © 2017 noseparte(Libra) © Like the wind, like rain
 * @author Noseparte
 * @Compile 2017年9月17日--下午7:00:43
 * @Version V1.0
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}

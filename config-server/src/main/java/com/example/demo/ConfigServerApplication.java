package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer//开启配置服务器功能
@EnableEurekaClient
//@EnableDiscoveryClient  //也可以使用该注解 指定其他注册中心
public class ConfigServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}

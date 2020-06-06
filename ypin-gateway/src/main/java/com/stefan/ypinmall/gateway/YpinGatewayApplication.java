package com.stefan.ypinmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启服务注册与发现（配置nacos注册中心的地址）
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class YpinGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinGatewayApplication.class, args);
	}

}

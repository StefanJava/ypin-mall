package com.stefan.ypinmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.stefan.ypinmall.order.dao")
@EnableDiscoveryClient
public class YpinOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinOrderApplication.class, args);
	}

}

package com.stefan.ypinmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.远程调用别的服务
 * 1）、引入openFeign
 * 2）、编写一个接口，告诉springcloud这个接口需要调用远程服务
 *  1.声明接口的每一个方法都是调用哪个远程服务的哪个请求
 * 3）、开启远程调用功能
 */
@SpringBootApplication
@MapperScan("com.stefan.ypinmall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.stefan.ypinmall.member.feign")
public class YpinMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinMemberApplication.class, args);
	}

}

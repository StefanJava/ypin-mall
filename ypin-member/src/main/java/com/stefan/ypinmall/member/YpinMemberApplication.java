package com.stefan.ypinmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stefan.ypinmall.member.dao")
public class YpinMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinMemberApplication.class, args);
	}

}

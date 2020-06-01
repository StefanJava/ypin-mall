package com.stefan.ypinmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stefan.ypinmall.ware.dao")
public class YpinWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinWareApplication.class, args);
	}

}

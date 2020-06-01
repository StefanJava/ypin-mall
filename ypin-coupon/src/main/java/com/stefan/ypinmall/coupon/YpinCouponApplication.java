package com.stefan.ypinmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stefan.ypinmall.coupon.dao")
public class YpinCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinCouponApplication.class, args);
	}

}

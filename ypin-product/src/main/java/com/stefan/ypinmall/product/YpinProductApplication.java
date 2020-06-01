package com.stefan.ypinmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合mybatisplus
 * 2.配置
 *      1.配置数据源
 *          1）导入mysql驱动
 *          2) 配置application.yml
 *      2.配置mybatisplus
 *          1）使用MapperScan注解
 *          2）映射文件配置  mybatis-plus
 */
@SpringBootApplication
@MapperScan("com.stefan.ypinmall.product.dao")
public class YpinProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinProductApplication.class, args);
	}

}

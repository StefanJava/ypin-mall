package com.stefan.ypinmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.使用nacos作为配置中心进行统一配置
 *  1）导入依赖
 * 2、创建一个bootstrap.properties文件
 *  1）配置中心地址
 * 3、在nacos配置中心中创建模块名.properties文件
 * 4、@RefreshScope实时shuaxin
 * 5、优先使用nacos配置中心的配置
 *
 * 6、细节
 *  1）命名空间（public）：默认新增的所有配置都在public空间
 *      开发、测试、生产环境配置隔离
 *      在bootstrap.properties中指定使用哪个配置
 *  2）配置集：所有配置的集合
 *  3）配置集id：类似于配置文件名
 *  4）配置分组：默认所有的配置集都属于：DEFAULT_GROUP
 *
 * 每个微服务创建自己的命名空间，使用配置分组区分环境：开发、测试、生产
 */
@SpringBootApplication
@MapperScan("com.stefan.ypinmall.coupon.dao")
@EnableDiscoveryClient
public class YpinCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpinCouponApplication.class, args);
	}

}

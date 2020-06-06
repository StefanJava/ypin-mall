package com.stefan.ypinmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author StefanYang
 * @description
 * @date 2020-06-02 14:39
 */
@Configuration
public class YpinCorsConfiguration {

	/**
	 * 跨域配置
	 * @return
	 */
	@Bean
	public CorsWebFilter corsWebFilter() {
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		// 配置跨域
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.setAllowCredentials(true);

		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsWebFilter(urlBasedCorsConfigurationSource);
	}
}

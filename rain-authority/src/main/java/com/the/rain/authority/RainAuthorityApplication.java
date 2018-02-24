package com.the.rain.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zengfeiyue
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.the.rain.authority.mapper")
@EnableCaching
public class RainAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RainAuthorityApplication.class, args);
	}
}

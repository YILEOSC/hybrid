package com.yile.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.yile.services")
@MapperScan("com.yile.db.dao")
@SpringBootApplication
public class YileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YileServiceApplication.class, args);
	}
}

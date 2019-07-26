package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@ImportResource(value= {"classpath:spring-web.xml"})//读取配置文件
@SpringBootApplication
public class SpringBootAssignmentApplication extends SpringBootServletInitializer {

	
	//jar
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

	
	//war
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootAssignmentApplication.class);
	}
}

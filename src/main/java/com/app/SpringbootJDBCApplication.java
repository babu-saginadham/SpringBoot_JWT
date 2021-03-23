package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan({"com.app","com.exception"})
public class SpringbootJDBCApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootJDBCApplication.class, args);
	}
}

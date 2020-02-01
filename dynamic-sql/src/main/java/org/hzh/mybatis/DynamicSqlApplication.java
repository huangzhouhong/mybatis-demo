package org.hzh.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:mybatis-config/config.xml")
public class DynamicSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicSqlApplication.class, args);
	}

}

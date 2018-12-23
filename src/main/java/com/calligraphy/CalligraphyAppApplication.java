package com.calligraphy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={HibernateJpaAutoConfiguration.class})
@MapperScan("com.calligraphy.dao")
public class CalligraphyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalligraphyAppApplication.class, args);
	}
}

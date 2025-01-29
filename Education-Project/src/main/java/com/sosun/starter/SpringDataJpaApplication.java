package com.sosun.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sosun.Confugiration.GlobalProperties;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sosun")
@EntityScan(basePackages = "com.sosun")
@ComponentScan(basePackages = "com.sosun")
@EnableConfigurationProperties(value = GlobalProperties.class)
//@PropertySource(value = "classpath:app.properties")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}

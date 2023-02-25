package com.luoxiaohei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个类可以起到配置的作用，会将其所在的包及其子包扫描一遍
@SpringBootApplication
public class Springboot07TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot07TestApplication.class, args);
	}

}

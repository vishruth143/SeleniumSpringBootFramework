package com.pta.SeleniumSpringBootFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SeleniumSpringBootFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SeleniumSpringBootFrameworkApplication.class, args);
		var car = applicationContext.getBean(Car.class);
		car.getCar();		
	}
}

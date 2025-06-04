package com.pta.SeleniumSpringBootFramework;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car(){
		System.out.println("Car instantiation");
	}
	
	public void getCar() {
		System.out.println("Toyota car");
	}

}

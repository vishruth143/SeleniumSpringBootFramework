package com.pta.SeleniumSpringBootFramework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pta.SeleniumSpringBootFramework.pages.MainPage;

@SpringBootTest
class SeleniumSpringBootFrameworkApplicationTests {
	
	@Autowired
	private MainPage mainPage;
	
	@Test
	void performLoginTest() {		
		mainPage.PerformLogin();
	}
}

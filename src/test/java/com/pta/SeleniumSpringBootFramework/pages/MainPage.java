package com.pta.SeleniumSpringBootFramework.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
	
	@Autowired
	private WebDriver webDriver;	
	
	@Value("${app.url}")
	private String appUrl;
	
	@Autowired
	private HomePage homePage;
	
	@Autowired
	private PracticePage practicePage;
	
	@Autowired
	private LoginPage loginPage;
	
	@Autowired
	private TestExceptionsPage testExceptionsPage;
	
	@Autowired
	private CoursesPage coursesPage;
	
	@Autowired
	private BlogPage blogPage;
	
	@Autowired
	private ContactPage contactPage;

	public void PerformLogin() {
		
		webDriver.navigate().to(appUrl);
		webDriver.manage().window().maximize();
		
		homePage.ClickPRACTICE();
		practicePage.ClickTestLoginPage();
		loginPage.Login("student", "Password123");
	}
}

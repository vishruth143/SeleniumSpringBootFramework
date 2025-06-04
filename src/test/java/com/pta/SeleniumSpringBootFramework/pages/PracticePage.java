package com.pta.SeleniumSpringBootFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class PracticePage {
	
	@Autowired
	private WebDriver driver;

	@PostConstruct
	public void init() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Test Login Page']" )
	public WebElement lnkTestLoginPage;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Test Exceptions']" )
	public WebElement lnkTestExceptions;
	
	public LoginPage ClickTestLoginPage() {
		lnkTestLoginPage.click();
		return new LoginPage();
	}
	
	public TestExceptionsPage ClickTestExceptions() {
		lnkTestExceptions.click();
		return new TestExceptionsPage();
	}
}

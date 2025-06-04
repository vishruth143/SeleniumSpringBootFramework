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
public class LoginPage {
	@Autowired
	private WebDriver driver;

	@PostConstruct
	public void init() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']" )
	public WebElement txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']" )
	public WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@id='submit']" )
	public WebElement btnSubmit;

	public void Login(String userName, String password) {
		txtUsername.sendKeys(userName);
		txtPassword.sendKeys(password);
		btnSubmit.click();
	}
}

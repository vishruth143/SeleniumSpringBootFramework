package com.pta.SeleniumSpringBootFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ContactPage {
	@Autowired
	private WebDriver driver;

	@PostConstruct
	public void init() {
		PageFactory.initElements(driver, this);
	}

}

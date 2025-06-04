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
public class HomePage {
	@Autowired
	private WebDriver driver;

	@PostConstruct
	public void init() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']" )
	public WebElement lnkHOME;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Practice']" )
	public WebElement lnkPRACTICE;
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Courses']" )
	public WebElement lnkCOURSES;
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Blog']" )
	public WebElement lnkBLOG;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact']" )
	public WebElement lnkCONTACT;
	
	public void ClickHOME() {
		lnkHOME.click();
	}
	
	public PracticePage ClickPRACTICE() {
		lnkPRACTICE.click();
		return new PracticePage();
	}
	
	public CoursesPage ClickCOURSES() {
		lnkCOURSES.click();
		return new CoursesPage();
	}
	
	public BlogPage ClickBLOG() {
		lnkBLOG.click();
		return new BlogPage();
	}
	
	public ContactPage ClickCONTACT() {
		lnkCONTACT.click();
		return new ContactPage();
	}
}
package com.pta.SeleniumSpringBootFramework.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import jakarta.annotation.PreDestroy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Configuration
public class WebDriverLibrary {
	
	@Value("${browser.type:chrome}") // Default browser is Chrome
    private String browserType;

    private WebDriver driver;

	@Bean
	public WebDriver getDriver() {
		switch (browserType.toLowerCase()) {
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;

        case "edge":
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--disable-extensions");
            edgeOptions.addArguments("--start-maximized");
            driver = new EdgeDriver(edgeOptions);
            break;

        case "chrome":
        default:
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
    }
		return driver;
	}

    @PreDestroy
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

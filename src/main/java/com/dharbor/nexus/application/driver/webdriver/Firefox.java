package com.dharbor.nexus.application.driver.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements CustomWebDriver {
    @Override
    public WebDriver generateWebDriver() {
        return new FirefoxDriver();
    }
}

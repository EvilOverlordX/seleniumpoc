package com.roosterpark.rptime.seleniumpoc.page;

import org.openqa.selenium.WebDriver;

/**
 * User: John
 * Date: 10/15/13
 * Time: 1:47 PM
 */
public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}

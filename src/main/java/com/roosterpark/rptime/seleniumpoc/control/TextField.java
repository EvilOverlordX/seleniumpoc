package com.roosterpark.rptime.seleniumpoc.control;

import org.openqa.selenium.WebElement;

/**
 * User: John
 * Date: 10/15/13
 * Time: 3:16 PM
 */
public abstract class TextField {

    private WebElement element;

    public TextField(WebElement element) {
        this.element = element;
    }

    public void writeText(String text) {
        element.sendKeys(text);
    }

    public void clearText() {
        element.clear();
    }

}

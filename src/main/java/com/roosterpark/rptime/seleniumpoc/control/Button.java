package com.roosterpark.rptime.seleniumpoc.control;

import org.openqa.selenium.WebElement;

/**
 * User: John
 * Date: 10/15/13
 * Time: 1:52 PM
 */
public abstract class Button {

    private WebElement element;

    public Button(WebElement element) {
        this.element = element;
    }

    public void clickButton() {
        element.click();
    }

}

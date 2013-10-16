package com.roosterpark.rptime.seleniumpoc.page;

import org.openqa.selenium.WebDriver;

/**
 * User: John
 * Date: 10/16/13
 * Time: 11:39 AM
 */
public class GoogleDrivePage extends BasePage {

    private static final String ADDRESS = "https://drive.google.com/a/roosterpark.com/?tab=wo#my-drive";

    public GoogleDrivePage(WebDriver driver) {
        super(driver);
    }

    public static String getAddress() {
        return ADDRESS;
    }

}

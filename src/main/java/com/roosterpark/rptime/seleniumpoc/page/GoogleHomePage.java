package com.roosterpark.rptime.seleniumpoc.page;

import com.roosterpark.rptime.seleniumpoc.control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: John
 * Date: 10/15/13
 * Time: 1:50 PM
 */
public class GoogleHomePage extends BasePage {

    private static final String SIGN_IN_BUTTON_ID = "gb_70";
    private static final String ADDRESS = "https://www.google.com";

    private SignInButton signInButton;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
        signInButton = new SignInButton(driver.findElement(By.id(SIGN_IN_BUTTON_ID)), driver);
    }

    public GoogleSignInPage clickSignInButton() {
        return signInButton.click();
    }

    public static String getAddress() {
        return ADDRESS;
    }

    private class SignInButton extends Button {

        private WebDriver driver;

        public SignInButton(WebElement element, WebDriver driver) {
            super(element);
            this.driver = driver;
        }

        public GoogleSignInPage click() {
            super.clickButton();
            (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return d.getTitle().equalsIgnoreCase("Google Accounts");
                }
            });
            return new GoogleSignInPage(driver);
        }

    }

}

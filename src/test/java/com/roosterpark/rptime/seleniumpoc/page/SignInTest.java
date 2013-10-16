package com.roosterpark.rptime.seleniumpoc.page;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * User: John
 * Date: 10/15/13
 * Time: 2:26 PM
 */
public class SignInTest {

    private GoogleHomePage homePage;
    private GoogleSignInPage signInPage;
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
    }

    @Test
    public void signInTest() throws InterruptedException {
        driver.get(GoogleHomePage.getAddress());
        homePage = new GoogleHomePage(driver);
        signInPage = homePage.clickSignInButton();
        signInPage.signIn("testuser@roosterpark.com", "testuser");
        driver.get(GoogleDrivePage.getAddress());
        driver.quit();
    }

}

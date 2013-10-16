package com.roosterpark.rptime.seleniumpoc;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: John
 * Date: 10/15/13
 * Time: 10:45 AM
 */
public class QuickTest {

    private PocGooglePage pocGooglePage;
    private WebDriver driver;
    private WebElement textAreaElement;
    private WebElement submitButtonElement;

    @Before
    public void setup() {
        pocGooglePage = new PocGooglePage();
        driver = new FirefoxDriver();
    }

    @Test
    public void quickTest() {
        driver.get(pocGooglePage.getAddress());
        textAreaElement = driver.findElement(By.id(pocGooglePage.getTextAreaElement()));
        textAreaElement.sendKeys("Cheese!");
        submitButtonElement = driver.findElement(By.id(pocGooglePage.getSubmitButtonElement()));
        submitButtonElement.click();
        System.out.println("Page title is: " + driver.getTitle());
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

}

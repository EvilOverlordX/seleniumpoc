package com.roosterpark.rptime.seleniumpoc.page.form;

import com.roosterpark.rptime.seleniumpoc.control.Button;
import com.roosterpark.rptime.seleniumpoc.control.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * User: John
 * Date: 10/15/13
 * Time: 3:20 PM
 */
public class SignInForm {

    private static final String EMAIL_ID = "Email";
    private static final String PASSWORD_ID = "Passwd";
    private static final String SIGN_IN_ID = "signIn";

    private WebDriver driver;
    private EmailTextField emailTextField;
    private PasswordTextField passwordTextField;
    private SignInButton signInButton;

    public SignInForm(WebDriver driver) {
        this.driver = driver;
        emailTextField = new EmailTextField(driver.findElement(By.id(EMAIL_ID)));
        passwordTextField = new PasswordTextField(driver.findElement(By.id(PASSWORD_ID)));
        signInButton = new SignInButton(driver.findElement(By.id(SIGN_IN_ID)));
    }

    public void signIn(String email, String password) {
        emailTextField.write(email);
        passwordTextField.write(password);
        signInButton.click();
    }

    private class EmailTextField extends TextField {

        public EmailTextField(WebElement element) {
            super(element);
        }

        public void write(String text) {
            super.writeText(text);
        }

        public void clear() {
            super.clearText();
        }

    }

    private class PasswordTextField extends TextField {

        public PasswordTextField(WebElement element) {
            super(element);
        }

        public void write(String text) {
            super.writeText(text);
        }

        public void clear() {
            super.clearText();
        }

    }

    private class SignInButton extends Button {

        public SignInButton(WebElement element) {
            super(element);
        }

        public void click() {
            super.clickButton();
        }

    }

}

package com.roosterpark.rptime.seleniumpoc.page;

import com.roosterpark.rptime.seleniumpoc.page.form.SignInForm;
import org.openqa.selenium.WebDriver;

/**
 * User: John
 * Date: 10/15/13
 * Time: 2:14 PM
 */
public class GoogleSignInPage extends BasePage {

    private SignInForm signInForm;

    public GoogleSignInPage(WebDriver driver) {
        super(driver);
        signInForm = new SignInForm(driver);
    }

    public void signIn(String email, String password) {
        signInForm.signIn(email, password);
    }

}

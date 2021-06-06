package com.Git.Tests;

import com.Git.Pages.LoginPage;
import com.Git.Utilities.BrowserUtilities;
import com.Git.Utilities.ConfigurationReader;
import com.Git.Utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class Forgot {
    @Test
    public void forgot() {
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.SignInButton.click();
        String title = "Sign in to GitHub · GitHub";

        Assert.assertEquals(title, Driver.getDriver().getTitle());

        BrowserUtilities.waitForVisibility(loginPage.SignIn, 3);

        Assert.assertTrue(loginPage.SignIn.isDisplayed());

        loginPage.Forgot.click();

        BrowserUtilities.waitForVisibility(loginPage.Email,3);

        loginPage.Email.sendKeys("yunusemre4634@gmail.com");

        //burada dogru resmi secmek icin iframe kullanilacak ama kolay degil gibi ugrasmak gerekiyor

    }
}
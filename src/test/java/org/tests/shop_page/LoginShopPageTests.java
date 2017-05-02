package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:37 in IntelliJ IDEA.
 */

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.tests.enums.UserPageElementsEnums;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;


public class LoginShopPageTests extends LoginShopPageTest {

    LoginShopPageTest loginShopPageTest = new LoginShopPageTest();

    @Ignore
    @Test
    public void goToPage() {

        takeScreenshot();
    }

    @Test
    public void checkPageTitle() {
        String pageTitle = driver.getTitle();
        assertEquals(pageTitle, UserPageElementsEnums.PAGE_TITLE.toString());
        takeScreenshot();
    }


    //region Login Tests
    @Test
    public void correctUserLogin() {
        emailTextBox.clear();
        emailTextBox.sendKeys("mariusz.cislak@gmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("test10");
        takeScreenshot();
        signInButton.click();
        //waitForElementIsNotVisibleByName(getSignInButtonName());
        Assert.assertTrue(driver.findElement(By.cssSelector(UserPageElementsEnums.LOGIN_ALERT_SUCCESS.toString())).isDisplayed());
        takeScreenshot();
    }

    @Test
    public void incorrectUserMailLogin() {

    }

    @Test
    public void incorrectUserPasswordLogin() {

    }

    @Test
    public void emptyNameLogin() {

    }

    @Test
    public void emptyMailLogin() {
        emailTextBox.clear();
        passwordTextBox.clear();
        passwordTextBox.findElement(By.name("password"));
        passwordTextBox.click();
        passwordTextBox.sendKeys("Test10");
        takeScreenshot();
        signInButton.click();
        Assert.assertTrue(signInButton.isDisplayed());
        takeScreenshot();
    }

    @Test
    public void emptyFieldsLogin() {
        emailTextBox.clear();
        passwordTextBox.clear();
        signInButton.click();
        Assert.assertTrue(signInButton.isDisplayed());
    }

    @Test
    public void incorrectMailFormatLogin() {

    }
    //endregion



    @Test
    public void goToCreateAccountPageFromLeftPanel() {

    }
}

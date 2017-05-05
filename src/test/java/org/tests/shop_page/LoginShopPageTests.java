package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:37 in IntelliJ IDEA.
 */

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.tests.enums.SpecialCharactersEnums;
import org.tests.enums.UrlEnums;
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
        Reporter.log("Alert displayed: " + driver.findElement(By.cssSelector(UserPageElementsEnums.LOGIN_ALERT_SUCCESS.toString())).getText(), true);
        takeScreenshot();
    }

    @Test
    public void incorrectUserMailLogin() {
        emailTextBox.clear();
        emailTextBox.sendKeys("mmmmariusz.cislak@gmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("test10");
        takeScreenshot();
        signInButton.click();
        Assert.assertTrue(signInButton.isDisplayed());
        takeScreenshot();
    }

    @Test
    public void incorrectUserPasswordLogin() {
        emailTextBox.clear();
        emailTextBox.sendKeys("mariusz.cislak@gmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("wrong_password_10");
        takeScreenshot();
        signInButton.click();
        Assert.assertTrue(signInButton.isDisplayed());
        takeScreenshot();
//      TODO: add assert for error alert
    }

    @Test
    public void emptyPasswordLogin() {
        emailTextBox.clear();
        emailTextBox.sendKeys("mariusz.cislak@gmail.com");
        passwordTextBox.clear();
        takeScreenshot();
        signInButton.click();
        Assert.assertTrue(signInButton.isDisplayed());
        takeScreenshot();
    }

    @Test
    public void emptyMailLogin() {
        emailTextBox.clear();
        passwordTextBox.clear();
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
    public void emojiMailLogin() {
        emailTextBox.clear();
        emailTextBox.sendKeys(SpecialCharactersEnums.EMOJI.toString() + "@gmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("test10");
        takeScreenshot();
        signInButton.click();
        takeScreenshot();
        Assert.assertTrue(signInButton.isDisplayed());


        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement field = driver.findElement(By.name("email"));
        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
        String message = (String)js.executeScript("return arguments[0].validationMessage;", field);

        Reporter.log(is_valid.toString(), 0, true);
        Reporter.log(message, 0, true);
    }

    @Test
    public void incorrectMailFormatLogin() {

    }
    //endregion



    @Test
    public void goToCreateAccountPageFromLeftPanel() {

    }
}

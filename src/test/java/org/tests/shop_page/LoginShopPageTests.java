package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:37 in IntelliJ IDEA.
 */

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.tests.enums.PageElementsEnums;
import org.tests.shop_page.LoginShopPageTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;


public class LoginShopPageTests extends LoginShopPageTest {

    @Ignore
    @Test
    public void goToPage() {

        takeScreenshot();
    }

    @Test
    public void checkpageTitle() {
        String pageTitle = driver.getTitle();
        assertEquals(pageTitle, PageElementsEnums.PAGE_TITLE.toString());
        takeScreenshot();
    }

    @Test
    public void goToCreateAccountPage() {

    }

    @Test
    public void correctUserLogin() {

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

    }

    @Test
    public void emptyFieldsLogin() {
        signInButtonClick();
        String signInButtonName = getSignInButtonName();
        Assert.assertNotNull(driver.findElement(By.name(signInButtonName)), "Login button name found:" + signInButtonName);
        takeScreenshot();
    }

    @Test
    public void incorrectMailFormatLogin() {

    }
}

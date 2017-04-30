package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:37 in IntelliJ IDEA.
 */

import org.junit.Ignore;
import org.junit.Test;
import org.tests.enums.PageElementsEnums;

import static org.testng.Assert.assertEquals;


public class LoginShopPageTests extends BaseClass {

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

    }

    @Test
    public void incorrectMailFormatLogin() {

    }
}

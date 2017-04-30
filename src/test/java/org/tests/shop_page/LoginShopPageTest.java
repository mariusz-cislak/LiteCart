package org.tests.shop_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:36 in IntelliJ IDEA.
 */

public class LoginShopPageTest extends BaseClass{

    private static String signInButtonName = "login";
    WebElement signInButton;

    public String getSignInButtonName() {
        return signInButtonName;
    }

    public void signInButtonClick() {
        signInButton = driver.findElement(By.name(signInButtonName));
        signInButton.click();
    }

}

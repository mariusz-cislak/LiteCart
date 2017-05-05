package org.tests.shop_page;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Mariusz Ciślak on 30.04.2017 16:36 in IntelliJ IDEA.
 */

public class LoginShopPageTest extends BaseUserClass {

    // region Sign In Button
    private static final String signInButtonName = "login";
    @FindBy(name = signInButtonName)
//    WebElement ssignInButton = driver.findElement(By.name(signInButtonName));
    WebElement signInButton = new WebElement() {
        //region signInButton methods
        public void click() {
            driver.findElement(By.name(signInButtonName)).click();
        }

        public void submit() {
            driver.findElement(By.name(signInButtonName)).submit();
        }

        public void sendKeys(CharSequence... keysToSend) {
            driver.findElement(By.name(signInButtonName)).sendKeys(keysToSend);
        }

        public void clear() {
            driver.findElement(By.name(signInButtonName)).clear();
        }

        public String getTagName() {
            return driver.findElement(By.name(signInButtonName)).getTagName();
        }

        public String getAttribute(String name) {
            return driver.findElement(By.name(signInButtonName)).getAttribute(name);
        }

        public boolean isSelected() {
            return driver.findElement(By.name(signInButtonName)).isSelected();
        }

        public boolean isEnabled() {
            return driver.findElement(By.name(signInButtonName)).isEnabled();
        }

        public String getText() {
            return driver.findElement(By.name(signInButtonName)).getText();
        }

        public List<WebElement> findElements(By by) {
            return driver.findElements(By.name(signInButtonName));
        }

        public WebElement findElement(By by) {
            return driver.findElement(By.name(signInButtonName)).findElement(by);
        }

        public boolean isDisplayed() {
            return driver.findElement(By.name(signInButtonName)).isDisplayed();
        }

        public Point getLocation() {
            return driver.findElement(By.name(signInButtonName)).getLocation();
        }

        public Dimension getSize() {
            return driver.findElement(By.name(signInButtonName)).getSize();
        }

        public Rectangle getRect() {
            return driver.findElement(By.name(signInButtonName)).getRect();
        }

        public String getCssValue(String propertyName) {
            return driver.findElement(By.name(signInButtonName)).getCssValue(propertyName);
        }

        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            return driver.findElement(By.name(signInButtonName)).getScreenshotAs(target);
        }
//        endregion
    };

    public String getSignInButtonName() {
        return signInButtonName;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
//endregion

    // region Email Address Textbox
    private static final String emailTextBoxName = "email";
    @FindBy(name = emailTextBoxName)
    WebElement emailTextBox = new WebElement() {
        public void click() {
            driver.findElement(By.name(emailTextBoxName)).click();
        }

        public void submit() {
            driver.findElement(By.name(emailTextBoxName)).submit();
        }

        public void sendKeys(CharSequence... keysToSend) {
            driver.findElement(By.name(emailTextBoxName)).sendKeys(keysToSend);
        }

        public void clear() {
            driver.findElement(By.name(emailTextBoxName)).clear();
        }

        public String getTagName() {
            return driver.findElement(By.name(emailTextBoxName)).getTagName();
        }

        public String getAttribute(String name) {
            return driver.findElement(By.name(emailTextBoxName)).getAttribute(name);
        }

        public boolean isSelected() {
            return driver.findElement(By.name(emailTextBoxName)).isSelected();
        }

        public boolean isEnabled() {
            return driver.findElement(By.name(emailTextBoxName)).isEnabled();
        }

        public String getText() {
            return driver.findElement(By.name(emailTextBoxName)).getText();
        }

        public List<WebElement> findElements(By by) {
            return driver.findElements(By.name(emailTextBoxName));
        }

        public WebElement findElement(By by) {
            return driver.findElement(By.name(emailTextBoxName)).findElement(by);
        }

        public boolean isDisplayed() {
            return driver.findElement(By.name(emailTextBoxName)).isDisplayed();
        }

        public Point getLocation() {
            return driver.findElement(By.name(emailTextBoxName)).getLocation();
        }

        public Dimension getSize() {
            return driver.findElement(By.name(emailTextBoxName)).getSize();
        }

        public Rectangle getRect() {
            return driver.findElement(By.name(emailTextBoxName)).getRect();
        }

        public String getCssValue(String propertyName) {
            return driver.findElement(By.name(emailTextBoxName)).getCssValue(propertyName);
        }

        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            return driver.findElement(By.name(emailTextBoxName)).getScreenshotAs(target);
        }
    };
//    endregion

    // region Pasword Textbox
private static final String passwordTextBoxName = "password";
    @FindBy(name = passwordTextBoxName)
    WebElement passwordTextBox = new WebElement() {
        public void click() {
            driver.findElement(By.name(passwordTextBoxName)).click();
        }

        public void submit() {
            driver.findElement(By.name(passwordTextBoxName)).submit();
        }

        public void sendKeys(CharSequence... keysToSend) {
            driver.findElement(By.name(passwordTextBoxName)).sendKeys(keysToSend);
        }

        public void clear() {
            driver.findElement(By.name(passwordTextBoxName)).clear();
        }

        public String getTagName() {
            return driver.findElement(By.name(passwordTextBoxName)).getTagName();
        }

        public String getAttribute(String name) {
            return driver.findElement(By.name(passwordTextBoxName)).getAttribute(name);
        }

        public boolean isSelected() {
            return driver.findElement(By.name(passwordTextBoxName)).isSelected();
        }

        public boolean isEnabled() {
            return driver.findElement(By.name(passwordTextBoxName)).isEnabled();
        }

        public String getText() {
            return driver.findElement(By.name(passwordTextBoxName)).getText();
        }

        public List<WebElement> findElements(By by) {
            return driver.findElements(By.name(passwordTextBoxName));
        }

        public WebElement findElement(By by) {
            return driver.findElement(By.name(passwordTextBoxName));
        }

        public boolean isDisplayed() {
            return driver.findElement(By.name(passwordTextBoxName)).isDisplayed();
        }

        public Point getLocation() {
            return driver.findElement(By.name(passwordTextBoxName)).getLocation();
        }

        public Dimension getSize() {
            return driver.findElement(By.name(passwordTextBoxName)).getSize();
        }

        public Rectangle getRect() {
            return driver.findElement(By.name(passwordTextBoxName)).getRect();
        }

        public String getCssValue(String propertyName) {
            return driver.findElement(By.name(passwordTextBoxName)).getCssValue(propertyName);
        }

        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            return driver.findElement(By.name(passwordTextBoxName)).getScreenshotAs(target);
        }
    };
// endregion






/*
TODO check methods
*/

}

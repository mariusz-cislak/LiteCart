package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 30.04.2017 17:49 in IntelliJ IDEA.
 */

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.tests.enums.UrlEnums;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseUserClass {
    @Rule
    public TestName name = new TestName();

//    private static String loginUserPageUrl = "http://127.0.0.1:8080/litecart/en/";
//    private static String adminUserPageUrl = "http://127.0.0.1:8080/litecart/admin/login.php";

    public WebDriver driver;

    @Before
    public void applicationStart() {
        driver = new ChromeDriver();
        Reporter.log("Browser session start", 1, true);
        driver.manage().window().maximize();
        driver.get(UrlEnums.USER_LOGIN_PAGE_URL.toString());

        Reporter.log("Application start", 1, true);
    }

    @After
    public void applicationStop() {

        driver.quit();
        Reporter.log("Browser session stop", 1, true);
    }


    public void takeScreenshot() {
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        try {
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\"
                    + name.getMethodName() + "_"
                    + dateFormat.format(date)
                    + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void waitForElementById(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void waitForElementByCssSelector(String elementCssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementCssSelector)));
    }

    public void waitForElementByXpathSelector(String elementXpathSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpathSelector)));
    }

    public void findElementByName(String elementName) {
        driver.findElements(By.id(elementName));
    }

    public void findEletetermentByName(String elementName) {
        Assert.assertNotNull(driver.findElement(By.id(elementName)));
    }

}

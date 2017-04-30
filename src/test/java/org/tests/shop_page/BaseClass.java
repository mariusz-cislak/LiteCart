package org.tests.shop_page;

/**
 * ${NAME} created by Mariusz Ciślak on 30.04.2017 16:30 in IntelliJ IDEA 16:34 in IntelliJ IDEA.
 */
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseClass {

    public WebDriver driver;

    @Before
    public void applicationStart() {
        driver = new ChromeDriver();
        Reporter.log("Browser session start", 1, true);
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1/litecart/en/");
        Reporter.log("Application start", 1, true);
    }

    @After
    public void applicationStop() {

        driver.quit();
        Reporter.log("Browser session stop", 1, true);
    }


    public void takeScreenshot() {
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date() ;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        try {
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\" + dateFormat.format(date) + ".png"));
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

}

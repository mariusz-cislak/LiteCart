package org.tests.shop_page;

/**
 * Created by Mariusz Ciślak on 26.04.2017 16:37 in IntelliJ IDEA.
 */

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.Description;
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


public class Tests {

    private WebDriver driver;

    @Before
    public void Start() {

        driver = new ChromeDriver();
        Reporter.log(" BROWSER SESSION START ");
    }

    @Test
    public void test1() {
        driver.get("http://127.0.0.1/litecart/en/");
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date() ;

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        try {
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\" + dateFormat.format(date) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }

    }
//    @Ignore
    @Test
    public void test2() {
        Reporter.log("Start test2", true);
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("litecart");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hdtb-msb-vis")));

        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Date date = new Date() ;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\" + dateFormat.format(date) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }

    @After
    public void End() {
        driver.quit();
        Reporter.log(" BROWSER SESSION END ", true);
    }

}
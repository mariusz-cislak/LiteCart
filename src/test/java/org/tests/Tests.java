package org.tests;

import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;
import org.apache.commons.io.FileUtils;
import org.apache.xerces.impl.dv.xs.DateTimeDV;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by Mariusz on 26.04.2017.
 */
public class Tests {

    private WebDriver driver;

    @Before
    public void Start() {
        driver = new ChromeDriver();
    }

    @Ignore
    @Test
    public void test1() {
        driver.get("http://www.google.com");
        driver.close();
    }

    @Test
    public void test2() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("litecart");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hdtb-msb-vis")));
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Date dt = new Date();
            String currDateTime = String.valueOf(dt.getSeconds())+"-"
                    + String.valueOf(dt.getMinutes())+"-"
                    + String.valueOf(dt.getHours())+"-"
                    + String.valueOf(dt.getDate())+"-"
                    + String.valueOf(dt.getMonth())+"-";
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\" + currDateTime + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }

    @After
    public void End() {
        driver.quit();
    }
}

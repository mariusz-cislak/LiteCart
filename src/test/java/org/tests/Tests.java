package org.tests;

import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;
import com.sun.deploy.uitoolkit.ui.LoggerConsole;
import com.sun.media.jfxmedia.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.xerces.impl.dv.xs.DateTimeDV;
import org.eclipse.jetty.util.log.LoggerLog;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

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
    }
}
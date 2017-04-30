package org.tests.shop_page;

/**
 * Created by Mariusz on 30.04.2017.
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
//    public WebDriver driver = new ChromeDriver();
    public WebDriver driver;

    @Before
    public void applicationStart() {
        driver = new ChromeDriver();
        Reporter.log("Browser session start", 1, true);
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1/litecart/en/");
        Reporter.log("Application start", 3, true);
    }

    @After
    public void applicationStop() {

        driver.quit();
        Reporter.log("Application start", 7, true);
    }
}

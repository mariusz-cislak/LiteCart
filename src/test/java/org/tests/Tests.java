package org.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by mariu on 26.04.2017.
 */
public class Tests {

    private WebDriver driver;

    @Before
    public void Start() {
        driver = new ChromeDriver();
    }


    @Test
    public void test1() {
        driver.get("http://www.google.com");
        driver.quit();
    }
}

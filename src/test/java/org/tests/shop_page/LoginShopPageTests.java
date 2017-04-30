package org.tests.shop_page;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.tests.shop_page.BaseClass;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mariusz on 30.04.2017.
 */
public class LoginShopPageTests extends BaseClass {


    @Test
    public void goToPage() {

        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date() ;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        try {
            FileUtils.copyFile(screenShotFile, new File("D:\\SeleniumScreens\\" + dateFormat.format(date) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

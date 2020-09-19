package com.Guru99;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @Before
    public void openBrowser(){
        BrowserSelector browserSelector=new BrowserSelector();
        browserSelector.selectBrowser();
        driver.get("http://www.demo.guru99.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
   // @After
    //public void closeBrowser(){
     //   driver.quit();
    //}
}

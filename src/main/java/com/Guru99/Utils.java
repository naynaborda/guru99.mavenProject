package com.Guru99;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    //reusable method for click on  web element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //reusable method for sendkeys
    public static void typeText(By by,String textValue){
         driver.findElement(by).sendKeys(textValue);
    }
    //reusable method for clearfield
    public static void clearField(By by){
        driver.findElement(by).clear();
    }
    //reusable method for getText
    public  static String getText(By by){
        return driver.findElement(by).getText();
    }
    //reusable method for timestamp
    public static String timeStamp(){
        SimpleDateFormat dataFormat=new SimpleDateFormat("HH.mm.ss");
        Date date=new Date();
        return dataFormat.format(date);

    }
}

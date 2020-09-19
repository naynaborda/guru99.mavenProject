package com.Guru99;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _emailId=By.name("emailid");
    By _submitBtn=By.xpath("//input[@name='btnLogin']");
    By _guru99Bank=By.className("barone");


    public void enterEmailId(){
        String email="sitaram" + timeStamp() + "@gmail.com";
        //enter email
        typeText(_emailId,email);
    }
    public void clickOnSubmitButton(){
        //click on submit button
        clickOnElement(_submitBtn);


    }
    public String verifyingHomePage(){
        return getText(_guru99Bank);

    }



}

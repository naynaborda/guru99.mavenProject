package com.Guru99;

import org.openqa.selenium.By;

public class V1Page extends Utils{
    By _userId=By.name("uid");
    By _passWord=By.name("password");
    By _loginBtn=By.name("btnLogin");
    By _gtplBank=By.className("barone");

    public void fillingLogInDetails(){
        String  userId="mngr285399 ";
        String password="gYvezyq ";
        //enter user id
        typeText(_userId,userId);
        //enter password
        typeText(_passWord,password);

    }
    public void clickOnLoginButton(){
        //click on login button
        clickOnElement(_loginBtn);

    }
    public String verifyingLogin(){
        //get text as gtpl bank
        return getText(_gtplBank);
    }
}

package com.Guru99;

import org.openqa.selenium.By;

public class AccessPage extends Utils {
    By _bankProjectBtn=By.linkText("Bank Project");
    public void clickOnBankProject(){
        //click on bank project
        clickOnElement(_bankProjectBtn);

    }
}

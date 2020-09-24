package com.Guru99;

import org.junit.Assert;
import org.junit.Test;

public class TestSuit extends BaseTest{
    HomePage homePage=new HomePage();
    AccessPage accessPage=new AccessPage();
    V1Page v1Page=new V1Page();
    @Test
    public void verifyLoginSuccessful(){
        //verifying Guru99 Bank on homepage
       // String expectedText="Guru99 Bank";
        //String actualText=homePage.verifyingHomePage();
        //Assert.assertEquals(expectedText,actualText);
        //enter emailId
        homePage.enterEmailId();
        //click on submit button
        homePage.clickOnSubmitButton();
        //click on bank project
        accessPage.clickOnBankProject();
        //filling login details
        v1Page.fillingLogInDetails();
        //click on login button
        v1Page.clickOnLoginButton();
        //Asserting Gtpl Bank on after login successfully
        String expectedMessage="Gtpl Bank";
        String actualMessage=v1Page.verifyingLogin();
        Assert.assertEquals("Login unsuccessful",expectedMessage,actualMessage);

    }

}

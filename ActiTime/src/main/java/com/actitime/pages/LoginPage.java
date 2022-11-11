package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actitime.base.BaseClass;

public class LoginPage extends BaseClass{

    By actiTimeUserName = By.name("username");
    By actiTimePassword = By.name("pwd");
    By actiTimeLogin = By.id("loginButton");


    public LoginPage(WebDriver driver){
        BaseClass.driver = driver;
    }


    public void setUserName(String strUserName){
        driver.findElement(actiTimeUserName).sendKeys(strUserName);
    }


    public void setPassword(String strPassword){
        driver.findElement(actiTimePassword).sendKeys(strPassword);
    }


    public void clickLogin(){
        driver.findElement(actiTimeLogin).click();
    }


    public void loginToActiTime(String strUserName,String strPassword){
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }
	

}

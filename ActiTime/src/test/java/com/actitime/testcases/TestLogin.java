package com.actitime.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.base.BaseClass;
import com.actitime.pages.LoginPage ;

public class TestLogin extends BaseClass{

    @BeforeTest
    public void setup(){
    	System.setProperty("webdriver.chrome.driver","C://Users//hdilu//eclipse-workspace//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
    }

    @Test
    public void loginToApp(){
        LoginPage objLogin;
        objLogin = new LoginPage(driver);
        objLogin.loginToActiTime("admin","manager");
    }
    
    @AfterTest
    public void tearDown(){
    	driver.quit();
    }
    	   
}

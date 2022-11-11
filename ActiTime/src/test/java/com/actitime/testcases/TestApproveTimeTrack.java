package com.actitime.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.base.BaseClass;
import com.actitime.pages.ApproveTimeTrackPage;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class TestApproveTimeTrack extends BaseClass{
	
	@BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C://Users//hdilu//eclipse-workspace//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
    }

    @Test(priority=1)
    public void loginToApp(){
        LoginPage objLogin;
        objLogin = new LoginPage(driver);
        objLogin.loginToActiTime("admin","manager");
    }

    @Test(priority=2)
    public void goApproveTimeTrack(){
        EnterTimeTrackPage objEnterTimeTrack;
        objEnterTimeTrack = new EnterTimeTrackPage(driver);
        objEnterTimeTrack.clickApproveTimeTrack();
    }

    @Test(priority=3)
    public void clickCheckBox(){
        ApproveTimeTrackPage objApproveTimeTrack;
        objApproveTimeTrack = new ApproveTimeTrackPage(driver);
        objApproveTimeTrack.clickCheckBox();
    }
    
    @Test(priority=4)
    public void clickApproveBtn(){
        ApproveTimeTrackPage objApproveTimeTrack;
        objApproveTimeTrack = new ApproveTimeTrackPage(driver);
        objApproveTimeTrack.clickApprove();
    }
    
    @AfterTest
    public void tearDown(){
    	driver.quit();
    }

}

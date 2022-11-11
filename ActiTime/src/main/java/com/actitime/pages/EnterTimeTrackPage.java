package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actitime.base.BaseClass;

public class EnterTimeTrackPage extends BaseClass{

    By approveTimeTrackLink = By.linkText("Approve Time-Track");

    public EnterTimeTrackPage(WebDriver driver){
        BaseClass.driver=driver;
    }

    public void clickApproveTimeTrack(){
        driver.findElement(approveTimeTrackLink).click();
    }

}
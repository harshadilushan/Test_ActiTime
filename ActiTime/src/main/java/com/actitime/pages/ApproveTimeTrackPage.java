package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.base.BaseClass;

public class ApproveTimeTrackPage extends BaseClass{
	
	 By checkBox = By.xpath("//*[@id=\"approveTTTable\"]/tbody[2]/tr[3]/td[7]/input");
	 By selectApprove = By.xpath("//*[@id='approveButton']");
	 By selectReject = By.xpath("//*[@id='rejectButton']");
	 By rejectReason = By.xpath("//*[@id=\"rejectWeekCommentTextArea\"]");
	 By selectReasonReject = By.xpath("html/body/div[13]/div[3]/div/button[1]");

	 public ApproveTimeTrackPage(WebDriver driver){
		 BaseClass.driver=driver;
	 }
	 
	 @Test
	 public void clickCheckBox(){
		 driver.findElement(checkBox).click();
	 }

	 public void clickApprove(){
		 driver.findElement(selectApprove).click();
	 }

	 public void clickReject(){
		 driver.findElement(selectReject).click();
	 }
	 
	 public void setRejectReason(String strRejectReason){
	        driver.findElement(rejectReason).sendKeys(strRejectReason);
	 }
	 
	 public void clickReasonReject(){
		 driver.findElement(selectReasonReject).click();
	 }

}

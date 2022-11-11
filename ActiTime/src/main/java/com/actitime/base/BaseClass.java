package com.actitime.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass{
	
	public static WebDriver driver;
	public static Properties properties;
	
	public void loadConfig(){
		
		try {
			properties = new Properties();
			FileInputStream iprop = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/"+"actitime/config/config.properties");
			properties.load(iprop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		public static void initialization(){ 
		
		String browserName = properties.getProperty("browser"); 
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C://Users//hdilu//eclipse-workspace//drivers//chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C://Users//hdilu//eclipse-workspace//drivers//geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		
	}
		
		
}

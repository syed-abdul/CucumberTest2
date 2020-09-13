package org.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static String name;
	public static WebDriver getDriver() {
		if(driver == null) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\divm\\\\geckodriver.exe");
		 driver=new FirefoxDriver();
		
		 driver.manage().window().maximize();
	}
		return driver;
		
	}
	public void launchApp(String s) {
		 driver.get(s);
	}
	public void fill(WebElement web,String s) {
		web.sendKeys(s);
	}
	
	public void click(WebElement web) {
		web.click();
	}
	
	public static void dropDown(WebElement web,String s) {
		Select sc=new Select(web);
       sc.selectByVisibleText(s);
	}

	public static void getId(WebElement web) {
		 name = web.getAttribute("value");
         System.out.println("  MY ORDER ID IS:"+name);
         
	}
	public void handleAlert() {
Alert al = driver.switchTo().alert();
al.accept();
	}
	public static void quit() {
	driver.quit();

}

}

package com.orangeHRM.AutomationTesting.Functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Dashboard {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		LoginPage login=new LoginPage();
		login.validCredential(driver,"Dashboard");
		
		SideBar s=new SideBar(driver);
		s.sideBar();
		
//		DropDownMenu d=new DropDownMenu();
//		d.dropDownMenu(driver);
//		
//		AdminMenu a=new AdminMenu();
//		a.adminMenu(driver);
//		a.adminUserOption(driver);
		
	}
	
	
	
}

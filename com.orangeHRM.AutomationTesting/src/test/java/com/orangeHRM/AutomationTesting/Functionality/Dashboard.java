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
	
		
		
		Dashboard dashboard=new Dashboard();
		//dashboard.dropDownMenu();
		//Thread.sleep(2000);
		
		dashboard.sideBar(driver);
		
	}
	
	public void dropDownMenu() throws InterruptedException {
		
		//System.out.println(" drop button is clicked");
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		List <WebElement> dropdown_list=driver.findElements(By.className("oxd-userdropdown-link"));
		
		for(WebElement i:dropdown_list) {
//			driver.findElement(By.className("oxd-userdropdown-name")).click();
//			Thread.sleep(3000);
			if(i.getText().equals("About")) {
				System.out.println(i.getText()+" button is clicked");
				
				i.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/button")).click();
				Thread.sleep(1000);
					
				break;
				
			}	
			
		}
		
	}
	
	//Menu Bar
	public void menuPage(WebDriver driver,String Menu) throws InterruptedException {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = Menu;
		System.out.println("Smenu method");
		
		menuUrlValidate(actualUrl,expectedUrl,driver,Menu);
		
		
		
	}
	
	
	
	public void sideBar(WebDriver driver) throws InterruptedException {
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	
		//code for seach textbox
		WebElement search=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input"));
		search.sendKeys("d");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).clear();
		search.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		
		//driver.navigate().refresh();
		List <WebElement> menuItem=driver.findElements(By.className("oxd-main-menu-item"));
		int count=0;
		for(WebElement i:menuItem) {
			System.out.println(i.getText()+" button is clicked");
			
				if(i.getText().contains("Dashboard")) {
					driver.navigate().refresh();
					break;
				}
				else {
				i.click();
				Thread.sleep(2000);
			
				}
			
				
				driver.navigate().back();
			
		}
		
	}
	
	
	
	public void menuUrlValidate(String actualUrl,String expectedUrl,WebDriver driver,String Menu) throws InterruptedException {
		System.out.println("menuurl method");
		if (actualUrl.contains(expectedUrl)) {
			System.out.println(Menu+" page is  opened  or displayed ");
			Thread.sleep(2000);
		
		}
		else
		{
		System.err.println(Menu+" page is  not displayed |Failed ");
		}

	}
}

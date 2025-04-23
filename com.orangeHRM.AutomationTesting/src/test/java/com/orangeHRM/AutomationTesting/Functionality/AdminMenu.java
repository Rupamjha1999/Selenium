package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminMenu {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		LoginPage login=new LoginPage();
		login.validCredential(driver,"Dashboard");
	
		Dashboard dashboard=new Dashboard();
		List <WebElement> menuItem=driver.findElements(By.className("oxd-main-menu-item"));
		for(WebElement i:menuItem) {
			System.out.println(i.getText()+" button is clicked");
			if(i.getText().contains("Admin")) {
				i.click();
				dashboard.menuUrlValidate(driver.getCurrentUrl(),"admin",driver,"Admin");
				break;
			}
		}
		//for selecting user management dropdown
		driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-topbar-body-nav-tab-link")).click();
		Thread.sleep(5000);
		
		//for selecting job dropdown
		
		Thread.sleep(3000);
//		driver.findElement(By.className("oxd-dropdown-menu")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(3000);
		List <WebElement> JobOption=driver.findElements(By.className("oxd-dropdown-menu"));
		for(WebElement i:JobOption) {
			System.out.println(i.getText()+" button is clicked");
			
				i.click();
				Thread.sleep(3000);
			
		}
		
	}

}

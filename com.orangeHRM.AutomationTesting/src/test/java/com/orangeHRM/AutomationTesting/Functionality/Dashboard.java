package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		dashboard.dropDownMenu();
		

	}
	
	public void dropDownMenu() throws InterruptedException {
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		List <WebElement> dropdown_list=driver.findElements(By.className("oxd-userdropdown-link"));
		
		for(WebElement i:dropdown_list) {
			driver.findElement(By.className("oxd-userdropdown-name")).click();
			Thread.sleep(3000);
			if(i.getText().equals("About")) {
				System.out.println(i.getText()+" button is clicked");
				
				i.click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/button")).click();
				Thread.sleep(1000);
					
				
			}	
			
		}
		
		System.out.println(dropdown_list.get(1));
	}
	
	
	


}

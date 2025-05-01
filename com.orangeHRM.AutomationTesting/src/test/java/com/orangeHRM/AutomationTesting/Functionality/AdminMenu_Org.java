package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminMenu_Org {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	//for selecting organization dropdown
	
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
			Thread.sleep(3000);
			List <WebElement> organizationOption=driver.findElements(By.className("oxd-dropdown-menu'"));
			for(WebElement i:organizationOption) {
				System.out.println(i.getText()+" button is clicked");
				
					i.click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
					Thread.sleep(3000);
					//Thread.sleep(3000);
				
			}
}
}
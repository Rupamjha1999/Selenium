package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminMenu_Org {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
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

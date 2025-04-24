package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//method for Dropdown operation on dashboard 
	public void dropDownMenu(WebDriver driver) throws InterruptedException {
		
		//System.out.println(" drop button is clicked");
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		List <WebElement> dropdown_list=driver.findElements(By.className("oxd-userdropdown-link"));
		
		for(WebElement i:dropdown_list) {
			driver.findElement(By.className("oxd-userdropdown-name")).click();
			Thread.sleep(3000);
			System.out.println(i.getText()+" button is clicked");
			i.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/button")).click();
			Thread.sleep(1000);
			driver.navigate().back();
					
				//break;
				
			
			
		}
		
	}
	
}

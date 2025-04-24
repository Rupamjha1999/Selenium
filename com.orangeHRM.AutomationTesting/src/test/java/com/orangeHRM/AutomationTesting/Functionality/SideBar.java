package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
	
	
}

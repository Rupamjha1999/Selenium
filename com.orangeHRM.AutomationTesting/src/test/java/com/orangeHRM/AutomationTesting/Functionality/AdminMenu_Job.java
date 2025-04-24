package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminMenu_Job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	//for selecting job dropdown
		public void jobDropdown(WebDriver driver,String option) throws InterruptedException {
			
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
			Thread.sleep(3000);
			List <WebElement> JobOption=driver.findElements(By.className("oxd-dropdown-menu"));
			for(WebElement i:JobOption) {
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
				Thread.sleep(3000);
				
				
			}
			
			
//			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
//			Thread.sleep(3000);
//			List <WebElement> Job=driver.findElements(By.className("oxd-dropdown-menu"));
//			for(WebElement i:Job) {
//				if(i.getText().equals(option)) {
//					//System.out.println(i.getText()+" button is clicked");
//					
//					i.click();
//					System.out.println(i.getText()+" button is clicked");
//					Thread.sleep(3000);
//					return false;
//					//break;
//					
//				}
//				else {
//					System.out.println("button is not clicked");
//				}
//				
//					
//				
//			}
//			return false;
//			
		}

		}
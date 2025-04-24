package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
		
		AdminMenu admin=new AdminMenu();
		Dashboard dashboard=new Dashboard();
		
	}

	
	
	

	
	//for selecting user management dropdown
	public void adminMenu(WebDriver driver) throws InterruptedException {
		List <WebElement> menuItem=driver.findElements(By.className("oxd-main-menu-item"));
		for(WebElement i:menuItem) {
			System.out.println(i.getText()+" button is clicked");
			if(i.getText().contains("Admin")) {
				i.click();
				menuUrlValidate(driver,"Admin");
				break;
			}
		}
		
		
		driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-topbar-body-nav-tab-link")).click();
		Thread.sleep(5000);
	}
	
	
	//Admin page validation code using getCurrentUrl
	public void menuUrlValidate(WebDriver driver,String Menu) throws InterruptedException {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		System.out.println("menu method");
				
				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println(Menu+" page is  opened  or displayed ");
					Thread.sleep(2000);
				
				}
				else
				{
				System.err.println(Menu+" page is  not displayed |Failed ");
				}

			}
	

	
	public void adminUserOption(WebDriver driver) throws InterruptedException {
		
		//enter text in username textfield
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("josepth.Evans");
		Thread.sleep(2000);
		
		driver.findElement(By.className("oxd-select-wrapper")).click();
		Thread.sleep(2000);
		
		
			List <WebElement> roleOption=driver.findElements(By.className("oxd-select-text--after"));
			for(WebElement i:roleOption) {
				i.click();
				System.out.println(i.getText()+" button is clicked");
				Thread.sleep(4000);
		
			//System.err.println(" list not displayed");
		
			}
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input\r\n"
				+ "		")).sendKeys("your role is this");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div\r\n"
				+ "		")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		
		
	}
}
	

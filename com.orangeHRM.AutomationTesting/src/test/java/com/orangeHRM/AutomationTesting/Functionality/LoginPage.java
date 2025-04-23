package com.orangeHRM.AutomationTesting.Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		LoginPage login = new LoginPage();

		String expectedTitle = "OrangeHRM";
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();

		// System.out.println(actualTitle);
		// validating the login page
		if (actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle)) {
			System.out.println("OrangeHRM web application is  opened |validation successful");
			Thread.sleep(4000);
			
			//1
			 login.validCredential(driver,"Login");
			 Thread.sleep(3000);
			 //2
			 login.invalidUserPassword();
			 Thread.sleep(4000);
			 
			 //3
			 login.blankUserBlankPassword();
			 Thread.sleep(4000);
			 //4
			 login.blankUserInvalidPassword();
			 Thread.sleep(4000);
			 
			 //5
			 login.blankUservalidPassword();
			 Thread.sleep(4000);
			 
			 //6
			 login.invalidUserBlankPassword();
			 Thread.sleep(4000);
			
			 //7
			 login.InvalidUservalidPassword();
			 Thread.sleep(4000);
			 
			 //8
			 login.lowercaseUser_lowercasePassword();
			 Thread.sleep(4000);
			 
			 //9
			 login.lowercaseUser_UppercasePassword();
			 Thread.sleep(4000);
			 
			 //10
			 login.Uppercase_UserPassword();
			 Thread.sleep(4000);
			 
			 //11
			 login.UppercaseUser_lowercasePassword();
			 Thread.sleep(4000);
			 
			 //12
			 login.validUserBlankPassword();
			 Thread.sleep(4000);
			 
			 //13
			 login.validUserInvalidPassword();
			 Thread.sleep(4000);
			 
			 //14
			 login.forgetPassword();
			 Thread.sleep(4000);
			
			 //15
			 login.socialLinks();
			 Thread.sleep(4000);

		} else {
			System.err.println("OrangeHRM web application is not opend | validation failed");
		}

		driver.close();
	}

	public void forgetPassword() throws InterruptedException {

		driver.findElement(By.className("orangehrm-login-forgot")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Forgot your password? ")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Reset password page is  opened | forgetPassword");
			Thread.sleep(2000);

		} else {
			System.err.println(" Reset password page is not opend | forgetPassword");

		}
	}

	// for social link
	public void socialLinks() throws InterruptedException {

		driver.findElement(By.linkText("orangehrm-login-forgot")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.linkedin.com/company/orangehrm/";

	}

	public void validCredential(WebDriver driver,String page) throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		Thread.sleep(2000);
		
		/*
		 * calling login button because type is submit by using password web element
		 */		
		pass.submit();
		
		
		
		Thread.sleep(2000);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,page,"validCredential", driver);
		
	}
	

	public void invalidUserPassword() throws InterruptedException {

		WebElement passwordtextfield;
		driver.findElement(By.name("username")).sendKeys("admin12");
		Thread.sleep(2000);
		passwordtextfield = driver.findElement(By.name("password"));
		passwordtextfield.sendKeys("admin1267");
		Thread.sleep(2000);

		// when the after password field next button is submit type button
		passwordtextfield.submit();
		Thread.sleep(2000);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","invalidUserPassword", driver);
	}

	public void validUserInvalidPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin127");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","validUserInvalidPassword", driver);
	}

	public void InvalidUservalidPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("dameon");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","InvalidUservalidPassword",driver);
	}

	public void blankUservalidPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","blankUservalidPassword", driver);
	}

	public void blankUserInvalidPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin678");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","blankUserInvalidPassword", driver);
	}

	public void validUserBlankPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("admin");
		;
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","validUserBlankPassword", driver);
	}

	public void invalidUserBlankPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("masteradmin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","invalidUserBlankPassword", driver);
	}

	public void blankUserBlankPassword() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("masteradmin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("");
		Thread.sleep(2000);

		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","blankUserBlankPassword", driver);
	}

	public void Uppercase_UserPassword() throws InterruptedException {

		WebElement username, password, login;
		driver.findElement(By.name("username")).sendKeys("ADMIN");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ADMIN123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","Uppercase_UserPassword",driver);
	}

	public void UppercaseUser_lowercasePassword() throws InterruptedException {

		WebElement username, password, login;
		driver.findElement(By.name("username")).sendKeys("ADMIN");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);

		login = driver.findElement(By.tagName("button"));
		login.click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","UppercaseUser_lowercasePassword",driver);
	}

	public void lowercaseUser_UppercasePassword() throws InterruptedException {

		WebElement username, password, login;
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ADMIN123");
		Thread.sleep(2000);
		login = driver.findElement(By.tagName("button"));
		login.click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","lowercaseUser_UppercasePassword", driver);
	}

	public void lowercaseUser_lowercasePassword() throws InterruptedException {

		WebElement username, password, login;
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		//calling urlvalidation method
		urlValidation(actualUrl,expectedUrl,"LoginPage","lowercaseUser_lowercasePassword",driver);
	}
	
	
	public void logout(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		Thread.sleep(3000);
		List <WebElement> dropdown_list=driver.findElements(By.className("oxd-userdropdown-link"));
		
		for(WebElement i:dropdown_list) {
			if(i.getText().equals("Logout")) {
			
				
				System.out.println(i.getText()+" button is clicked");
				i.click();
				Thread.sleep(3000);
				
			}
			
		}
	}
	
	public void urlValidation(String actualUrl,String expectedUrl,String page,String methodName,WebDriver driver) throws InterruptedException {
		
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("dashboard is  opened | "+methodName);
			Thread.sleep(2000);
			if(page.equals("Dashboard")) {
				
			}
			else{
				logout(driver);
			
			}
			Thread.sleep(2000);
			
		} else {
			System.err.println(" dashboard is not opend | "+methodName);

		}
	}

}

package com.orangeHRM.AutomationTesting.Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	 driver=new ChromeDriver();
	 LoginPage login=new LoginPage();
		
	String expectedTitle="OrangeHRM";
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	String actualTitle=driver.getTitle();
	String actualUrl=driver.getCurrentUrl();
	
	//System.out.println(actualTitle);
	//validating the login page
	if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle)) {
		System.out.println("OrangeHRM web application is  opened |validation successful");
		Thread.sleep(4000);
		//validating the username textfield
		
		//login.validCredential();
		login.forgetPassword();
		
		
	}
	else {
		System.out.println("OrangeHRM web application is not opend | validation failed");
	}
	
	driver.close();
	}
	
	
	
		
		
	public void forgetPassword() throws InterruptedException {
		
		driver.findElement(By.className("orangehrm-login-forgot")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" Reset password page is  opened | forgetPassword");
			Thread.sleep(2000);
			
			
			
		}
		else {
			System.out.println(" Reset password page is not opend | forgetPassword");
			
		}
	}
	
	//for social link
public void socialLinks() throws InterruptedException {
		
		driver.findElement(By.linkText("orangehrm-login-forgot")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.linkedin.com/company/orangehrm/";
		
}
	

	public void validCredential() throws InterruptedException {
		
	
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" dashboard is  opened | validCredential");
			Thread.sleep(2000);
			
			
			
		}
		else {
			System.out.println(" dashboard is not opend | validCredential");
			
		}
	}
	
	
	public void invalidUserPassword() throws InterruptedException {
		
		WebElement error;
		driver.findElement(By.name("username")).sendKeys("admin12");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin1267");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		//error=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
		//String error_msg=error.getText();
		
		//oxd-text oxd-text--p oxd-alert-content-text
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" dashboard is  opened | invalidUserPassword");
			
		}
		else {
			//System.out.println(" dashboard is not opend | output is "+error_msg);
			System.out.println(" dashboard is not opend | invalidUserPassword" );
		}
	}
	
	
	public void validUserInvalidPassword() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin127");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" dashboard is  opened | validUserInvalidPassword");
			
		}
		else {
			System.out.println(" dashboard is not opend | validUserInvalidPassword");
			
		}
	}



	public void InvalidUservalidPassword() throws InterruptedException {
	
	
	driver.findElement(By.name("username")).sendKeys("dameon");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();
	
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | InvalidUservalidPassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | InvalidUservalidPassword");
		
	}
}
	
	
	public void blankUservalidPassword() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" dashboard is  opened | blankUservalidPassword");
			
		}
		else {
			System.out.println(" dashboard is not opend | blankUservalidPassword");
			
		}
	}
	
	
	public void blankUserInvalidPassword() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin678");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();

		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println(" dashboard is  opened | blankUserInvalidPassword");
			
		}
		else {
			System.out.println(" dashboard is not opend | blankUserInvalidPassword");
			
		}
	}

	public void validUserBlankPassword() throws InterruptedException {
	
	
	driver.findElement(By.name("username")).sendKeys("admin");;
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();
	
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | validUserBlankPassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | validUserBlankPassword");
		
	}
}

	public void invalidUserBlankPassword() throws InterruptedException {
	
	
	driver.findElement(By.name("username")).sendKeys("masteradmin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();

	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | invalidUserBlankPassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | invalidUserBlankPassword");
		
	}
}


	public void blankUserBlankPassword() throws InterruptedException {
	
	
	driver.findElement(By.name("username")).sendKeys("masteradmin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("");
	Thread.sleep(2000);
	
	driver.findElement(By.tagName("button")).click();
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | blankUserBlankPassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | blankUserBlankPassword");
		
	}
}

public void Uppercase_UserPassword() throws InterruptedException {
	
	WebElement username,password,login;
	driver.findElement(By.name("username")).sendKeys("ADMIN");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("ADMIN123");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();
	
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | Uppercase_UserPassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | Uppercase_UserPassword");
		
	}
}

	public void UppercaseUser_lowercasePassword() throws InterruptedException {
	
	WebElement username,password,login;
	driver.findElement(By.name("username")).sendKeys("ADMIN");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	
	login=driver.findElement(By.tagName("button"));
	login.click();
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | UppercaseUser_lowercasePassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | UppercaseUser_lowercasePassword");
		
	}
}

	public void lowercaseUser_UppercasePassword() throws InterruptedException {
	
	WebElement username,password,login;
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("ADMIN123");
	Thread.sleep(2000);
	login=driver.findElement(By.tagName("button"));
	login.click();
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | lowercaseUser_UppercasePassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | lowercaseUser_UppercasePassword");
		
	}
}

	public void lowercaseUser_lowercasePassword() throws InterruptedException {
	
	WebElement username,password,login;
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.tagName("button")).click();
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println(" dashboard is  opened | lowercaseUser_lowercasePassword");
		
	}
	else {
		System.out.println(" dashboard is not opend | lowercaseUser_lowercasePassword");
		
	}
}
}

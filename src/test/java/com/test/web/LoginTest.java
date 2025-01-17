package com.test.web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void test1() {
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("anGd5vmROb9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("vZjSKowQYeM");
		
		driver.findElement(By.xpath("//div[@class='buttons']/input[@value='Log in']")).click();

		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

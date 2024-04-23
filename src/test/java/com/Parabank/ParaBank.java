package com.Parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank {

	public static void main(String[] args) {
		WebDriver driver;
		driver = WebDriverManager.chromedriver().create(); 
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		//Registration
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Rahul");
		driver.findElement(By.id("customer.lastName")).sendKeys("Shah");
		driver.findElement(By.id("customer.address.street")).sendKeys("Thergaon");
		driver.findElement(By.id("customer.address.city")).sendKeys("Pune-PCMC");
		driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("411033");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("345663636");
		driver.findElement(By.id("customer.ssn")).sendKeys("007");
		driver.findElement(By.id("customer.username")).sendKeys("Rahul_S");
		driver.findElement(By.id("customer.password")).sendKeys("23456787");
		driver.findElement(By.id("repeatedPassword")).sendKeys("23456787");
		driver.findElement(By.className("button")).click();
		
		//customer login
		driver.findElement(By.name("username")).sendKeys("Rahul");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@value='Log In'])[1]")).click();
		
		//Forgot login info
		
		driver.findElement(By.linkText("Forgot login info?")).click();
		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		driver.findElement(By.id("lastName")).sendKeys("Shah");
		driver.findElement(By.id("address.street")).sendKeys("Thergaon");
		driver.findElement(By.id("address.city")).sendKeys("Pune-PCMC");
		driver.findElement(By.id("address.state")).sendKeys("Maharashtra");
		driver.findElement(By.id("address.zipCode")).sendKeys("411033");
		driver.findElement(By.id("ssn")).sendKeys("007");
		driver.findElement(By.xpath("//input[@value='Find My Login Info']")).click();
		
		//Customer care
		driver.findElement(By.xpath("//a[normalize-space()='contact']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//a[normalize-space()='contact']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("45674590");
		driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
		
		
		
		
		driver.quit();

	}

}

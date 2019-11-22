package com.pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMyn2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.myntra.com/");//....loading the url
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/]")).click();
		//Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		Thread.sleep(5000);
		name.sendKeys("shirt",Keys.ENTER);
		Thread.sleep(2000);
		
		String parent=driver.getWindowHandle();
		
		
		
		Thread.sleep(2000);
		//String s=driver.getWindowHandle();
		WebElement name2=driver.findElement(By.xpath("//img[@title=\"HERE&NOW Men Mustard Regular Fit Solid Casual Shirt\"]"));
		Thread.sleep(5000);
		name2.click();
		Set<String> wins=driver.getWindowHandles();
		wins.remove(parent);
		
		WebElement name3=driver.findElement(By.xpath("//p[contains(.,'38')]"));
		Thread.sleep(2000);
		name3.click();
		//WebElement name4=driver.findElement(By.xpath(""));
		//Thread.sleep(2000);
		//name4.click();

	    
		
		
		
}
}

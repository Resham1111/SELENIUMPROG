package com.pac1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMyntranassign {

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
		//Thread.sleep(2000);
		
		//String parent=driver.getWindowHandle();
		
		
		
		Thread.sleep(2000);
		//String s=driver.getWindowHandle();
		WebElement name2=driver.findElement(By.xpath("//img[@title=\"HERE&NOW Men Mustard Regular Fit Solid Casual Shirt\"]"));
		Thread.sleep(5000);
		name2.click();
		Thread.sleep(2000);
		//ArrayList<String> yyy=new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().window(yyy.get(1));
		//Thread.sleep(2000);
	
		//driver.close();
		//Thread.sleep(2000);
		
		//driver.switchTo().window(yyy.get(0));
		Set<String> wins=driver.getWindowHandles();
		for(String win: wins)
		{
			driver.switchTo().window(win);
		}
				Thread.sleep(2000);
				
		WebElement name4=driver.findElement(By.xpath("class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\""));
		Thread.sleep(2000);
		name4.click();
		WebElement name5=driver.findElement(By.xpath("//span[@class=\"size-buttons-size-error-message\"]"))	;
		System.out.println(name5.getText());
				

	    
		
		
		
}
}

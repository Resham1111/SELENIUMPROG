package com.pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoflip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.flipkart.com/");//....loading the url
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/]")).click();
		//Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
		name.click();
		
		Thread.sleep(3000);
		List<WebElement> menu =driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"]/li"));
		
		for(WebElement name1:menu)
		{
			System.out.println(name1.getText());
		}
		
		
				//Thread.sleep(3000);
				//System.out.println(sale.getText());
				//Thread.sleep(3000);
}
}

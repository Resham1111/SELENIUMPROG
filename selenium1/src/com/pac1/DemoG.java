package com.pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("/]")).click();
		//Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(2000);
		name.sendKeys("java");
		Thread.sleep(2000);
		
		List<WebElement> name1=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		Thread.sleep(2000);
		for(WebElement n: name1)
		{
		System.out.println(n.getText());
		}
		
	}
}

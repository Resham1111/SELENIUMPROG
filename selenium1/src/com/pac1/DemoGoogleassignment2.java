package com.pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogleassignment2 {

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
		name.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> name1=driver.findElements(By.xpath("//h3[@class=\"LC20lb\"]"));
		Thread.sleep(2000);
		for(WebElement n: name1)
		{
		System.out.println(n.getText());
		}
		Thread.sleep(2000);
		
		for(int i=0;i<name1.size();i++)
		{
			if (i==2)
			{
				name1.get(i).click();
			}
		}
}
}

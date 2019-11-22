package com.pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demoface {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.urbanladder.com/");//....loading the url
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(3000);
		//WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		////Thread.sleep(3000);
		//System.out.println(sale.getText());
		//Thread.sleep(3000);
		
		//Thread.sleep(2000);
		//WebElement sale1=driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\""));
		//Thread.sleep(1000);
		//System.out.println(sale1.getText());
		
		//driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys(sale.getText(),Keys.ENTER);
		//Thread.sleep(3000);
		//sale3.sendKeys(sale.getText());
		
		
		//find elements
		List<WebElement> menu= driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
		
	}

}

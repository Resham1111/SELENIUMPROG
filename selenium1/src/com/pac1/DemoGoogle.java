package com.pac1;
//using xpath
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogle {

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
		WebElement name2=driver.findElement(By.xpath("//div[@id=\"hdtb-msb-vis\"]"));
		Thread.sleep(2000);
		
		
		name2.click();
		WebElement name3=driver.findElement(By.xpath("//img[@id=\"rT8rqQKh8jt3DM:\"]"));
		Thread.sleep(2000);
          name3.click();
		//Thread.sleep(2000);
		
		

}
}

package com.pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo5{

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.google.com/");//....loading the url
		Thread.sleep(2000);
		WebElement name =driver.findElement(By.name("q"));
		Thread.sleep(2000);
		
		name.sendKeys("java");
		Thread.sleep(2000);
		WebElement name1 =driver.findElement(By.name("btnK"));
		Thread.sleep(2000);
		name1.click();
		WebElement name2 =driver.findElement(By.name("q"));
		Thread.sleep(2000);
		name2.clear();
		Thread.sleep(2000);
		name2.sendKeys("selenium",Keys.ENTER);
		driver.navigate().back();
		
		
		
		
		//Set<String> win =driver.getWindowHandles();


}
}

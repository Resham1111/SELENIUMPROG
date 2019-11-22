package com.pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo7{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.facebook.com/");//....loading the url
		Thread.sleep(2000);
		WebElement name =driver.findElement(By.xpath("//[@for='pass']"));
		Thread.sleep(2000);
		System.out.println(name.getText());
		Thread.sleep(2000);
		
		name.sendKeys(name.getText());


}
}


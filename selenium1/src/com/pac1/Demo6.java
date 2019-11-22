package com.pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo6{

	public static void main(String[] args)throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.actitime.com/login.do");//....loading the url
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement name =driver.findElement(By.name("username"));
		Thread.sleep(2000);
	
		name.sendKeys("admin");
		
		WebElement name1 =driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		
		name1.sendKeys("manager");
		Thread.sleep(2000);
		WebElement name2 =driver.findElement(By.id("loginButton"));
		Thread.sleep(2000);
		
		name2.click();
		Thread.sleep(2000);
		String title2=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title2);
		Thread.sleep(2000);
		
		
		if (title==title2)
			System.out.println("login unsuccessful");
		else
			System.out.println("login successful");*/
		
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.facebook.com/");//....loading the url
		Thread.sleep(2000);
		WebElement name1 =driver.findElement(By.xpath("//label[@for='pass']"));
		Thread.sleep(2000);
		System.out.println(name1.getText());
		Thread.sleep(2000);
		
		
		name1.sendKeys(name1.getText());


		
		
		
		



}
}


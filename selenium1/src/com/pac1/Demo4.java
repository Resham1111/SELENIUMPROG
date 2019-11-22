package com.pac1;
//login to gmail





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo4 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://accounts.google.com/");//....loading the url
		//Thread.sleep(2000);
		//Set<String> win =driver.getWindowHandles();
		//System.out.println(win.getClass());
		WebElement user=driver.findElement(By.id("identifierId"));
		user.sendKeys("handwritten110@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement pas=driver.findElement(By.name("password"));
		pas.sendKeys("qrwett",Keys.ENTER);
		//WebElement pas=driver.findElement(By.id("pass"));
		//pas.sendKeys("yyyyyy");
		//WebElement log=driver.findElement(By.id("loginbutton"));
		//log.click();
	}
}


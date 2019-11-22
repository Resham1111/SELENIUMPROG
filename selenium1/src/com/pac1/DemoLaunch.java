package com.pac1;
import java.util.ArrayList;

//prog with the webdriver interface methods
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoLaunch {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		//driver.get("https://www.amazon.in/");....loading the url
		//Thread.sleep(2000);
		
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		
		
		/*driver.navigate().to("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);*/
		//driver.close();
		//driver.quit();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();//gives parent handle returns string
		System.out.println(parent);
		Thread.sleep(2000);
		Set<String>wins=driver.getWindowHandles();//gives parent and child handle returns set of string
		Thread.sleep(2000);
		//wins.remove(parent);
		
		//close the child windows one by one
		/*
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win).close();
		}
		*/
		//close the windows in reverse order
		//so convert set to arraylist
		//set is not indexed
		
		ArrayList <String> al =new ArrayList <>(wins);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
			driver.switchTo().window(al.get(i)).close();
		}
		
		
		
		
		
		
		

	}

}

package com.Login;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://demoaut.com");
		Thread.sleep(3000);
		//System.out.println("Inside Before method");
		
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");

	}

}

package com.Ecomm;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomm_Pack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver-99\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d.manage().window().fullscreen();
		d.manage().window().setSize(new Dimension(1255,1000));
		d.manage().window().maximize();
		
		d.findElement(By.id("search_query_top")).sendKeys("Bra");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		d.findElement(By.className("icon-th-list")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)d ;
		js.executeScript("window.scrollBy(100,1500)");
		Thread.sleep(3000);
		
	}

}

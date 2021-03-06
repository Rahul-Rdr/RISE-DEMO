package SelWebdriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Get all column in a webelement
		//Get those web element text in a array list
		// copy the actual array list
		// sort the copied array list & compare it to the actual
		
		List<WebElement> cols = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		ArrayList<String> actualArray = new ArrayList<String>();
		ArrayList<String> copiedArray = new ArrayList<String>();
		
		driver.findElement(By.xpath("//tr/th[2]")).click();
		//driver.findElement(By.xpath("//tr/th[2]")).click();
		
		
		for(int i=0;i<cols.size();i++) {
			actualArray.add(cols.get(i).getText());
			
		}

		for(String aa : actualArray) {
			System.out.println(aa);
		}
		
		for(int i=0;i<cols.size();i++) {
			copiedArray.add(actualArray.get(i));
			
		}
		System.out.println("==============================================");

		
		Collections.sort(copiedArray);
		Collections.reverse(copiedArray); 	
		
		for(String ca : copiedArray) {
		System.out.println(ca);
	}
		Assert.assertTrue(actualArray.equals(copiedArray));
		

	}

	

}

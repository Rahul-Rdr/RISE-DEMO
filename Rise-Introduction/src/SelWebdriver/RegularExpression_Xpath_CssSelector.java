package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression_Xpath_CssSelector {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		
		// WE WILL USE (CONTAINS & *) IN (Xpath & CssSelector)
		
		//     //tagName[contains(@attribute,'value')]
		//      tagName#[attribute*='value']
		
		
		driver.findElement(By.xpath("//a[contains(@title,'user? Sign in')]")).click(); 
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("vulval-username");
		driver.findElement(By.cssSelector("input[type*='sword']")).sendKeys("vulval-password");
		
		driver.findElement(By.cssSelector("[class*='inbtn']")).click();

	}

}

package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// all links present in website
		int allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(allLinks);
		
		// links present in footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerLinks);
		
		//links present only in first column
		WebElement colDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int colLinks = colDriver.findElements(By.tagName("a")).size();
		System.out.println(colLinks);

	}

}
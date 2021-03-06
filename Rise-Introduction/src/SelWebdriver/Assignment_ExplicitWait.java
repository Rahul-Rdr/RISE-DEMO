package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment_ExplicitWait {
	
	static String expectedText;
	static String actualText="Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.";
	

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait expWait = new WebDriverWait(driver,5);
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		
		
		expectedText=expWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results"))).getText();
		
		System.out.println(expectedText);
		Assert.assertEquals(actualText,expectedText );
	
	}

}

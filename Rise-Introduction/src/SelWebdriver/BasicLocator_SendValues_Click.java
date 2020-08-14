package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator_SendValues_Click {

	public static void main (String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/"); //open facebook login page

driver.findElement(By.id("email")).sendKeys("Username");  // ID LOCATOR & SEND VALUE
driver.findElement(By.name("pass")).sendKeys("password"); // NAME LOCATOR & SEND VALUE
//driver.findElement(By.linkText("Forgotten account?")).click(); // LINKTEXT LOCATION & CLICK


driver.findElement(By.cssSelector("#u_0_m")).sendKeys("checkgn"); // Copy Browser CSS Selector Locator 
driver.findElement(By.xpath("//*[@id='u_0_13']")).click();  // Copy Browser XPATH Locator

		
	}
	 
}

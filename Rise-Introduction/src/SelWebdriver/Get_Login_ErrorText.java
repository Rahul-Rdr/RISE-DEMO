package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Login_ErrorText {

	public static void main (String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver(); 
driver.get("https://login.salesforce.com/"); //open facebook login page

driver.findElement(By.id("username")).sendKeys("vul");  // ID LOCATOR & SEND VALUE
driver.findElement(By.name("pw")).sendKeys("ekdm_vul"); // NAME LOCATOR & SEND VALUE

driver.findElement(By.id("Login")).click();


System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}
	 
}

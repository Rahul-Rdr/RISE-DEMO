package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Locate {
	
public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Select drpdwn = new Select(driver.findElement(By.id("dropdown-class-example")));
		drpdwn.selectByValue("option3");
		drpdwn.selectByIndex(1);
		drpdwn.selectByVisibleText("Option1");
		
	

}
}

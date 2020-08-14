package SelWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_CssSelector {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		
		// FOR cssSelector DON'T USE THAT DOUBLE SLASH IN FRONT
		//  tagName[attribute='value']
		//  tagName#id
		//	tagName#className
		//  It CAN BE WITHOUT tagName LIKE (#className, #id)
		
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("vulval");
		driver.findElement(By.cssSelector("input#password")).sendKeys("vulval-500");
		driver.findElement(By.cssSelector("[name='commit']")).click();
		
	

	}

}

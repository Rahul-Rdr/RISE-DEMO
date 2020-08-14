package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		
		//tagName[@attribute='value']
		//*[@attribute='value']
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Vul");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Onek-Vul");
		
		driver.findElement(By.xpath("//*[@data-disable-with='Signing in…']")).click();
		
		
		
	}

}

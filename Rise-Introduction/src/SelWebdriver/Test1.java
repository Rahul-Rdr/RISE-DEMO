package SelWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rahul-Official/Downloads/test.html");
		
//		driver.findElement(By.xpath("//*[@id='Existing Template, Assembly or View']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> methods = driver.findElements(By.name("selections"));
		methods.get(1).click();

	}

}
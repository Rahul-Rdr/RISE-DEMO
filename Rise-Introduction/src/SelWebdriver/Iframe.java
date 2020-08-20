package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.switchTo().frame(0);
		String txt = driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		System.out.println(txt);
		
		
		
	
		

	}

}

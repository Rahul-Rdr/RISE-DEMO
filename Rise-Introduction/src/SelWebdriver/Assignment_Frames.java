package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		

		//Switch to frames

		System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().frame("frame-top");//.frame(string)

		driver.switchTo().frame("frame-middle");//.frame(string)

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());

		driver.switchTo().defaultContent();

		driver.navigate().back();

		System.out.println(driver.getTitle());
		
		
		

	}

}

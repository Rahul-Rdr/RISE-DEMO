package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement hover = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions a = new Actions(driver);
		
		
		//Mouse hovering
		a.moveToElement(hover).build().perform();
		
		//capital letter through Pressing shift key
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("checking-key-action").build().perform();
		
		Thread.sleep(2000);
		//Double click on the total search text
		a.moveToElement(search).click().doubleClick().build().perform();
		
		Thread.sleep(2000);
		//Right click on the first hovered element
		a.moveToElement(hover).contextClick().build().perform();

	}

}

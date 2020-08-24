package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_DropDown_Part2_KeyPress {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
		
	//driver.findElement(By.cssSelector("li.makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();
	
		WebElement sourceCity= driver.findElement(By.id("fromCity"));
		sourceCity.click();
		sourceCity.sendKeys("Kol");
		sourceCity.sendKeys(Keys.ARROW_DOWN);
		sourceCity.sendKeys(Keys.ENTER);
		
		WebElement destiCity= driver.findElement(By.id("toCity"));
		destiCity.click();
		destiCity.sendKeys("Mum");
		sourceCity.sendKeys(Keys.ARROW_DOWN);
		destiCity.sendKeys(Keys.ENTER);
		
		
		
		
	}
	
}

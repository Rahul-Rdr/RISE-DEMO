package SelWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("Ind");
		System.out.println("1");
		List<WebElement> options = driver.findElements(By.xpath("//input[@id='src']/following-sibling::ul"));
		System.out.println("2");
		for (WebElement option : options) {
			
			if (option.getText().equalsIgnoreCase("Teen Imli Square, Indore")); {
				option.click();
				break;
			}
			
		}
		System.out.println("3");
		
		
		
		
		
		
	}

}

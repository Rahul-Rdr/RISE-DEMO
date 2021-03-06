package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.spicejet.com/Default.aspx");
				
				//Below step will click the checkbox
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				
				//below assert step will return true/pass if the checkbox is selected and true.		
				Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				
				
				//Below steps will PRINT &  match the actual result with expected which is 6 checkboxes.
				System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
				Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6");
			}
	
}

package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/Default.aspx");
		
		//Below step will click the checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//below step will check whether the checkbox is clicked (true or false)
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//Below step will count all checkboxex and print
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}

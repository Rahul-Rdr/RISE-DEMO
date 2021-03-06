package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling_Traverse_Xpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// TEST CASE - 1. Go to practice page 2. Select "broken link" from footer section 3. select below sibling "dummy content"
		// 4. select parent "LATEST NEWS"
		
		String text1 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[2]")).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[2]/following-sibling::li[1]")).getText();
		System.out.println(text2);
		
		String text3 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[2]/following-sibling::li[1]/parent::ul/parent::td")).getText();
		System.out.println(text3);
		
		
		

	}

}

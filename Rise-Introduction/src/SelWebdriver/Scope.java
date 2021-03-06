package SelWebdriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	static String[] windowName = {"","","","",""};
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// all links present in website
		int allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(allLinks);
		
		// links present in footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerLinks);
		
		//links present only in first column
		WebElement colDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int colLinks = colDriver.findElements(By.tagName("a")).size();
		System.out.println(colLinks);
		
		List<WebElement> clikLinks = colDriver.findElements(By.tagName("a"));
		
		//clicking all thr link & opening in new tab
		for(int i=1;i<clikLinks.size();i++) {
			
			String clickKeyPress = Keys.chord(Keys.CONTROL,Keys.ENTER);
			clikLinks.get(i).sendKeys(clickKeyPress);
		}
		
		//Handling all windows by WindowHandles
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> itr= winIds.iterator();
		
		//Iterating on next windows & geting the current window tiitle
		int arr=0;
		for(int i=0;i<windowName.length;i++) {		
			
			windowName[arr]=itr.next();
			driver.switchTo().window(windowName[i]);
			System.out.println(driver.getTitle());
			arr++;
		}
		

		
	}

}

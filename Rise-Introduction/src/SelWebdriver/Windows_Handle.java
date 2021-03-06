package SelWebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handle {
	
	static String parentText;
	static String childText;
	static String[] windowName = {"",""};
	static WebElement textPathc;
	static WebElement textPathp;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
			Set<String> winIds = driver.getWindowHandles();
			Iterator<String> itr= winIds.iterator();
			
			int arr=0;
			for(int i=0;i<2;i++) {		
				
				windowName[arr]=itr.next();
				arr++;
			}
			
			driver.switchTo().window(windowName[1]);			
			textPathc=driver.findElement(By.cssSelector("div[class='example'] h3"));
			String childText=textPathc.getText();
			System.out.println("Child window text is: " +childText);
			
			
			driver.switchTo().window(windowName[0]);
			textPathp=driver.findElement(By.cssSelector("div[class='example'] h3"));
			String parentText=textPathp.getText();
			System.out.println("Parent window text is: " +parentText); 
			

	}

}

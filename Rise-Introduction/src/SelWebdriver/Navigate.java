package SelWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rahul-Official\\\\Documents\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("The tittle is: "+ driver.getTitle());  //Getting Google Page title
		
		driver.navigate().to("https://www.yahoo.com");
	
		System.out.println("The tittle is: "+ driver.getTitle());  //Getting Yahoo page Page title
		
		driver.navigate().back();  // It will navigate to previous tab
		driver.navigate().forward(); // It will do forward step
		
		driver.close();
//		driver.quit();
		
		
	}
	
}

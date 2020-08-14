package SelWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rahul-Official\\\\Documents\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("The tittle is: "+ driver.getTitle());  //Getting Page title
		
	
		
		System.out.println("The url is: "+ driver.getCurrentUrl()); //Getting Current Url of that page
		
		
		
		System.out.println("The tittle is: "+ driver.getPageSource()); //Getting page source of that website
	}

}

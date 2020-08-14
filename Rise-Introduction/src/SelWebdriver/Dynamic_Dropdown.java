package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		  

		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    System.out.println(driver.getTitle());

		      
		    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@text='Bhopal (BHO)']")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		

	}

}

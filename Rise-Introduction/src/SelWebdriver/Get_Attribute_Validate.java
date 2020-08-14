package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Get_Attribute_Validate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
				  

				    driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				 // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

				    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

				    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

				    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

				    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

				    {

				    System.out.println("its enabled");

				    Assert.assertTrue(true);

				    }

				    else

				    {
				    	
				    System.out.println("it's disbled");
				    Assert.assertTrue(false);
				    
				    }

	}

}

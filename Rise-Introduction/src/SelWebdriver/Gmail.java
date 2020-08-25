package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		driver.findElement(By.id("identifierId")).sendKeys("c2h5.wrahul");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).clear();
		driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("R9038571726");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

}

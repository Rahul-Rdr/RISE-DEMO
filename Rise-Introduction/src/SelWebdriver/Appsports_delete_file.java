package SelWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appsports_delete_file {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://app.sportsbetsnow.com/adminadis/login");
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("qZLPhDd1Hp");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.get("http://app.sportsbetsnow.com/filemanagers");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("i.tabularinfo__icon.fa.fa-plus")).click();
		
	List<WebElement> paths = driver.findElements(By.xpath("//tr[contains(@class,'tabularinfo')]/td/table/tbody/tr"));
	
	for(int i=0;i<paths.size();i++) {
		
		
		String paths_Name = paths.get(i).getText();
		
		if (paths_Name.contains("van.png")) {
			
			driver.findElements(By.xpath("//a[text()='Delete']")).get(i).click();
			break;
		}
		
	}
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
//	Thread.sleep(3000);
	String alert_Text = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
	System.out.println(alert_Text);
	
	

	}
}

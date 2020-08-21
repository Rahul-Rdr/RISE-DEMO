package SelWebdriver;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement chkBox = driver.findElement(By.xpath("//label[@for='benz']/input"));
		chkBox.click();
		String chkBoxText = driver.findElement(By.xpath("//label[@for='benz']")).getText();
	
		WebElement drpDown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(drpDown);
		s.selectByVisibleText(chkBoxText);
		
		driver.findElement(By.id("name")).sendKeys(chkBoxText);
		driver.findElement(By.id("alertbtn")).click();
		
		String alrtText= driver.switchTo().alert().getText();
		
		if(alrtText.contains(chkBoxText)) 
		System.out.println("Yes the alert box contains this " +chkBoxText+ " text");
			
		
		
	
	}

}

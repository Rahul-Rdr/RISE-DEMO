package SelWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisgnment_WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement parentTable = driver.findElement(By.xpath("//table[@id='product']"));
		
		int rows =	parentTable.findElements(By.xpath("tbody/tr")).size();
		int cols =	parentTable.findElements(By.xpath("tbody/tr/th")).size();
		
	System.out.println("Total Rows: " +rows);
	System.out.println("Total Columns: " +cols);	
	
	List<WebElement> secondRow = parentTable.findElements(By.xpath("tbody/tr[3]/td"));
	
	int colIndex=1;
	
		for(int i=0;i<secondRow.size();i++) {
			String val= secondRow.get(i).getText();
			
			System.out.print("Column"+colIndex+" Text: "  +val+ " | ");
			colIndex++;
			
		}
		
		
	}

}

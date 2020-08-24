package SelWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("departureCalendar")).click();
		
		
		//Select the month
		while(!driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText().contains("December")) {
		driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		
		//Select the date
		List<WebElement> dates = driver.findElements(By.className("calDate"));
		int date_Count = dates.size();
		
		for(int i =0; i<date_Count;i++) {
			String getDate = dates.get(i).getText();
			System.out.println(getDate);
			if(getDate.equalsIgnoreCase("30")) {
				dates.get(i).click();
				break;
			}
		}
		
		
		

	}

}

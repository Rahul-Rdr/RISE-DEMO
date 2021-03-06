package SelWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.espncricinfo.com/scores");

		driver.findElement(By.cssSelector("div[class='widget-tabs match-finder-tabs']  a:nth-child(3)")).click();
		driver.findElement(By.xpath("//*[@data-hover='Scorecard'] ")).click();

		WebElement tableDriver = driver.findElement(By.xpath("//*[@class='match-scorecard-page']/div[1]/div[1]"));

	List<WebElement> scoreCol = tableDriver.findElements(By.xpath("//table[@class='table batsman']/tbody/tr/td[3]"));

		for (int i = 0; i < scoreCol.size(); i++) {

			System.out.println(scoreCol.get(i).getText());
		}

	}

}

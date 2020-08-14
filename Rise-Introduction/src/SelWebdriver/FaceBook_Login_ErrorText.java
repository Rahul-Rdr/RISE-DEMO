package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login_ErrorText {



		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");

			System.out.println(driver.getTitle());

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//input[@name='email']")).click();

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cvft23@gmail.com");

			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");

			driver.findElement(By.xpath("//input[@value='Log In']")).click();

			Thread.sleep(5000);

			String alertmsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();

			System.out.println(alertmsg);

			}

	}



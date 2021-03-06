package SelWebdriver;

import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_to_cart {
	
	String promoText;
	

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Explicit Wait
		WebDriverWait w =new WebDriverWait(driver,5);
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);
		Add_to_cart item_Obj = new Add_to_cart();
		item_Obj.addItems(driver, itemsNeeded);
		item_Obj.cart_Promocode(driver, w);
		

		System.out.println("Promo Text in Main method:  "+item_Obj.promoText);
	}
	
	
	
	
	
	
	

	public  void addItems(WebDriver driver, String[] itemsNeeded)

		{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

//Broccoli - 1 Kg

//Broccoli,    1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

	public String cart_Promocode(WebDriver driver, WebDriverWait w) {
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		
		//2nd step, Explicit Wait for a locator
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//2nd step, Explicit Wait for a locator		
		promoText=w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))).getText();
		
		
		System.out.println("The text in Child Method: " +promoText);
		return promoText;
		
	}
}
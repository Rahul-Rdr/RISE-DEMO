package SelWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Loop_Dropdown {

public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/");
		
		driver.findElement(By.xpath("//div[@id='root']//div[4]//div[1]//input[1]")).click();
		
		
System.out.println(driver.findElement(By.xpath("//div[@id='root']//div//div//section//div//div//div//div//div//div//div//div//h4")).getText());

int i=1;
while(i<5)
{
driver.findElement(By.xpath("//div[@id='root']//div//div//section//div//div//div//div//div//div//div//div//h4//following-sibling::span")).click();
i++;
}
System.out.println(driver.findElement(By.xpath("//div[@id='root']//div//div//section//div//div//div//div//div//div//div//div//h4")).getText());		


System.out.println(driver.findElement(By.xpath("//div[@id='root']//div//div//section//div//div//div//div//div//div//div//div//h4[contains(text(),'0')]")).getText());

for(i=1;i<3;i++)
{
driver.findElement(By.xpath("//div[3]//div[1]//span[2]")).click();	
}

System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]")).getText());

Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]")).getText(), "2");

}

}

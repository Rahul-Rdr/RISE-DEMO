package SelWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_Cleartrip {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    String Title = driver.getTitle();
	    System.out.println("Website title is : " + Title);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='CCU']")).click();
	    
		driver.findElement(By.xpath("(//a[@text='Bagdogra (IXB)'])[2]")).click();
	    driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXB']")).click();
	  
	    
	    
	    
	    driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click(); //today's date
	    
	    
	    
	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    Thread.sleep(2000);
	    Select drp = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
	    drp.selectByValue("5");
	    Select drp2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
	    drp2.selectByIndex(3);
	    Thread.sleep(2000);


	    Select drp_currency = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
	    drp_currency.selectByVisibleText("USD");
	    Thread.sleep(1000);
	    Assert.assertEquals(drp_currency.getFirstSelectedOption().getText(),"USD");
	    
	    
	   
	 
Boolean checkbox = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();

	    if( checkbox == false) {
	    	System.out.println("Pass - No checkbox selected yet");
	    }
	    else {
	    	System.out.println("Error - checkbox auto selected without user interaction");
	    }
	    
	    driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
	    Thread.sleep(1000);
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    int All_Chkbx = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	    if(All_Chkbx == 6) {
	    	System.out.println("TOTAL CHEKCBOX : " + All_Chkbx);
	    	Assert.assertTrue(true);
	    }
	    else{
	    	Assert.assertTrue(false);
	    }
	 
	    
		
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
	    	System.out.println("Return Date Activated");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	   driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
	   driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
	   
	   driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

}
	}

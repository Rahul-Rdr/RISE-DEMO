import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public int verify() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com/");
		
		String TT= driver.getTitle();
	
		System.out.println("The title PASS " + TT);
		
		
		return 10;
		

	}

}

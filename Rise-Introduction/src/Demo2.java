import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul-Official\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Demo V = new Demo();
		System.out.println(V.verify());
		
	int a= 5;
	int b=6;
	int sum = a+b;
	
	System.out.println(sum);
		
		
	}

}

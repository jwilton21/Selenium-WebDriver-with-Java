import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Selenium test cases invokes browser testing.
public class Demo {

	public static void main(String[] args) 
	{
		// Implement methods of web driver. 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\955089\\Documents\\chromedriver.exe");
		// Create new driver object.
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

	}
	


}
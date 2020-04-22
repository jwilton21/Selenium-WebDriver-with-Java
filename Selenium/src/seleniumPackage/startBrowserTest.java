// Import all the Selenium for Chrome/JUnit packages/libraries.
package seleniumPackage;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class startBrowserTest {
	// Declare webDriver object. Variable access within class only and static
	private static WebDriver driver;

	// BeforeClass- method executed once before class Tests. Expensive common operations.
	@BeforeClass
	public static void setUp() 
	{	// Implement methods of WebDriver.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jasmi\\AppData\\Local\\Temp\\Temp1_chromedriver_win32.zip\\chromedriver.exe");
		// Instantiate WebDriver object.
		driver = new ChromeDriver();
	}
	// First Test class- testChromeSelenium.
	@Test
	public void  testChromeSelenium() 
	{	// Try catch block to catch potential exception thrown 
		// and print stackTrace errors to console if occured.
		try 
		{	// Go to url.
			driver.get("https://google.com");   
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	// AfterClass method executed after all class Tests.
	@AfterClass
	public static void cleanUp() 
	// If driver object != null then close driver (webDriver object)
	{	if(driver != null) {
		driver.close();
		driver.quit();		
	}

	}
}


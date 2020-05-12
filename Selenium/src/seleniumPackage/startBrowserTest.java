// Import all the Selenium for Chrome/JUnit packages/libraries.
// JUnit testing framework.
package seleniumPackage;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import static org.hamcrest.CoreMatchers.*;

public class startBrowserTest {
	// Declare webDriver object. Variable access within class only and static
	private static WebDriver driver;

	// BeforeClass- method executed once before class Tests. Expensive common operations.
	@BeforeClass
	public static void setUpWebdriver() 
	{	// Implement methods of WebDriver.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jasmi\\ChromeDriver\\chromedriver.exe");
		// Instantiate WebDriver object.
		driver = new ChromeDriver();
	}
	// First Test class- testChromeSelenium.
	@Test
	public void  testChromeSelenium() 
	{	// Try catch block to catch potential exception thrown 
		// and print stackTrace errors to console if occurred.
		try 
		{	// Go to url.
			driver.get("https://www.booking.com/");
			// Return to console webpage title.
			System.out.println("Web page title is:" +driver.getTitle());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Maximise window.
			driver.manage().window().maximize();
			// Search button has web element name 'ss'.Send 'Japan to element.
			driver.findElement(By.name("ss")).sendKeys("Japan");
			// Click on search button element.
			driver.findElement(By.cssSelector("#frm > div.xp__fieldset.accommodation > div.xp__button > div.sb-searchbox-submit-col.-submit-button > button > span:nth-child(1)")).click();


			// If exception thrown, catch here.
		}catch (Exception e) 
		{	//Call to print stack trace method so we can get the line that caused exception.
			e.printStackTrace();
		}
	}

	@Test
	// Test site title, actual v expected, using assert.
	public void testSiteTitle()
	{	driver.getTitle();
	String actualSiteTitle = driver.getTitle();
	String expectedSiteTitle = "Booking.com: Hotels in Tokyo. Book your hotel now!";
	assertEquals(expectedSiteTitle, actualSiteTitle);

	if(driver.getTitle().contains("Booking.com: Hotels in Tokyo. Book your hotel now!"))
		// Pass
		System.out.println("Test passed" + expectedSiteTitle);
	else
		// Fail... code should not reach here if there is a title match...
		System.out.println("Test failed:Page title does not match.\n Actual site title:"+actualSiteTitle +"is");

	}	


	// Once code finished, change toAfterClass.
	@Ignore
	//Disable this code for now.
	public static void shutDownWebDriver() 
	{	 
		if(driver != null) 
			driver.close();
		driver.quit();	

	}
}




package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class WebDriverManager {
	
	private WebDriver driver;
	//private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	

	public WebDriver getDriver() {
		if(driver==null)
			driver=createDriver();
		return driver;
}
	
	
	private WebDriver createDriver() {
		
			System.setProperty(CHROME_DRIVER_PROPERTY, "src/test/resources/drivers/chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
            //options.addArguments("headless");
            //options.addArguments("window-size=1200x600");
             driver = new ChromeDriver();
             //driver = new ChromeDriver(options);
		     driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
}

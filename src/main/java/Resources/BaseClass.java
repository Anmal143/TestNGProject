package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver BrowserLaunch() throws IOException
	{
		//This will help us to read data.properties file
		//FileInputStream fis = new FileInputStream("C:\\Users\\agd15\\eclipse-workspace\\28thAugTestNGFramework\\src\\main\\java\\Resources\\data.properties");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"); //for any other system or we provide project to other
		//This will access the data.properties
		prop = new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\agd15\\Desktop\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		    
			WebDriverManager.chromedriver().setup();
			
       //	WebDriverManager.chromedriver().browserVersion("128.0.6613.85").setup(); //for particular version
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//FireFox code
		}
		
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			//Edge code
		}
		else
		{
			System.out.println("Please select valid browser");
		}
		
		return driver;
		
	}
	@BeforeMethod
	public void LaunchBrowser() throws IOException
	{
		BrowserLaunch();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void CloseBrowser() throws IOException
	{
		driver.quit();
	}

}

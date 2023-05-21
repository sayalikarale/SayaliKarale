package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeyWordDrivenPackage.flib;

public class BaseTest extends flib implements IAutoConstant{

	static WebDriver driver;

	public void setUp() throws IOException
	{
		flib flib = new flib();

		String browservalue = flib.readpropertyfile(PROPERTY_PATH, "browser");
		String urlvalue = flib.readpropertyfile(PROPERTY_PATH, "url");

		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlvalue);
		}
		else if(browservalue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlvalue);
		}
		else if(browservalue.equals("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlvalue);
		}
		else
		{
			System.out.println("invalid browser!!!");  
		}
}

       public void tearDown()
       {
    	   driver.quit();
       }
}


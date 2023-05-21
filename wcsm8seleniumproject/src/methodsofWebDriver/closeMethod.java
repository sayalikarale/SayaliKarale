package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class closeMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions c1 = new ChromeOptions();
	c1.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(c1);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
     Thread.sleep(2000);
     driver.close();
}
}

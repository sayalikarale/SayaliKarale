package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathLocator2 {
	// xpath by using contains() function

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		// By using contains and text function

		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sneakers")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'PUMA White-PU')]")).click();
		Thread.sleep(2000);
		// till it will search for product but we cant click beacause its having image
		// sourcecode

	}
}

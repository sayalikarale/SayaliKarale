package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleException extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
	//to create an stale exception
	
	Flib flib = new Flib();
	System.setProperty(CHROME_KEY, CHROME_PATH);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(flib.readpropertyfile(PROPERTY_PATH, "url"));
	
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("admin");
	WebElement password = driver.findElement(By.name("pwd"));
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    driver.navigate();
    driver.findElement(By.name("username")).clear();
    username.sendKeys("admin");
   }
}


package DataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLogin extends flib{
	
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://desktop-9vjhm05/login.do");
    
    
    flib flib = new flib();
    driver.findElement(By.name("username")).sendKeys(flib.readexceldata("./data/actitimetestdata.xlsx", "validcreds", 1, 0));
    driver.findElement(By.name("pwd")).sendKeys(flib.readexceldata("./data/actitimetestdata.xlsx", "validcreds", 1, 1));
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
}
}

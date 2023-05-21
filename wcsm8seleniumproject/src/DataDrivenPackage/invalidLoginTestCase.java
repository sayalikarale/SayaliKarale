package DataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLoginTestCase extends flib {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://desktop-9vjhm05/login.do");
	
    flib flib = new flib();
    //to read data from external files
    int rc = flib.rowcount("./data/actitimetestdata.xlsx", "invalidcreds");
    for(int i=1; i<=rc; i++) {
    	
    String validusn = flib.readexceldata("./data/actitimetestdata.xlsx", "invalidcreds", i, 0);
    String validpassword = flib.readexceldata("./data/actitimetestdata.xlsx", "invalidcreds", i, 1);
    
    driver.findElement(By.name("username")).sendKeys(validusn);
    driver.findElement(By.name("pwd")).sendKeys(validpassword);
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.name("username")).clear();
    }






}
}

package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    //by method chaining
    driver.get("http://desktop-9vjhm05/login.do");
    //driver.findElement(By.name("username")).sendKeys("admin");
    
    //by store in ref-variable
    WebElement usernameTB = driver.findElement(By.name("username"));
    usernameTB.sendKeys("admin");
    
    
}
}

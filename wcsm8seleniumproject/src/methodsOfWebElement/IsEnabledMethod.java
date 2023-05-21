package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.instagram.com/");
    WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Log in']"));
    //boolean verify0 = loginbtn.isEnabled();
    //System.out.println(verify0);
    
    driver.findElement(By.name("username")).sendKeys("sayali123");
    driver.findElement(By.name("password")).sendKeys("12345789");
    loginbtn.click();
    boolean verify1 = loginbtn.isEnabled();
    System.out.println(verify1);
}
}

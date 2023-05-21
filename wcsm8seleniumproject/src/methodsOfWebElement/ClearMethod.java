package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    //by method chaining
    driver.get("http://desktop-9vjhm05/login.do");
    
  //by store in ref-variable
   WebElement usernameTB = driver.findElement(By.name("username"));
   usernameTB.sendKeys("admin123");
  // WebElement passwordTB = driver.findElement(By.name("pwd"));
   //passwordTB.sendKeys("manager123");
   Thread.sleep(1000);
   usernameTB.clear();
  
   usernameTB.sendKeys("admin");
   
}
}

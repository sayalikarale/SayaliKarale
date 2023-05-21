package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    //by method chaining
    driver.get("http://desktop-9vjhm05/login.do");
    //driver.findElement(By.name("username")).sendKeys("admin");
    //driver.findElement(By.name("pwd")).sendKeys("manager");
    Thread.sleep(2000);
    //driver.findElement(By.id("loginButton")).click();
    
    
  //by store in ref-variable
   WebElement usernameTB = driver.findElement(By.name("username"));
   usernameTB.sendKeys("admin");
   WebElement passwordTB = driver.findElement(By.name("pwd"));
   passwordTB.sendKeys("manager");
   WebElement loginbutton = driver.findElement(By.id("loginButton"));
   loginbutton.click();


}
}

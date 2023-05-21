package xpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    //By using multiple attribute
    
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    driver.findElement(By.name("q")).sendKeys("hp laptops");
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    
    driver.findElement(By.xpath("//div[text()='Core i9']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Brand']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='HP']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Operating System' and @class='_2gmUFU _3V8rao']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
    
    
  








}
}

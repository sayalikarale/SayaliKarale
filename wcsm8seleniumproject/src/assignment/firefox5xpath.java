package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox5xpath {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();

 driver.manage().window().maximize();
 driver.navigate().to("https://www.google.com/search?client=firefox-b-d&q=firefox");
 
 driver.switchTo().activeElement().sendKeys("chandler Bing", Keys.ENTER);
 Thread.sleep(2000);
 driver.findElement(By.xpath("//canvas[@jsname='h797r']")).click();
 Thread.sleep(2000);
}
}

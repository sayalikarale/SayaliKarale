package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathLocatoe3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(co);
     driver.manage().window().maximize();
     
     driver.get("https://www.airindia.in/");
     driver.findElement(By.id("bdMainSite")).sendKeys("Pune");
     
     driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
     Thread.sleep(2000);
    
     driver.findElement(By.xpath("//a[text()='Kochi, Cochin International Airport, COK, India, IN']")).click();
     Thread.sleep(2000);
          
     driver.findElement(By.id("_depdateeu1")).sendKeys("02/05/23");
     Thread.sleep(2000);
     driver.findElement(By.id("_retdateeu1")).sendKeys("03/05/23");
     Thread.sleep(2000);
     driver.findElement(By.id("btnbooking")).click();
     Thread.sleep(2000);
}
}

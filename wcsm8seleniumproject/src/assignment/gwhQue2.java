package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsofWebDriver.manageMethod;

public class gwhQue2 {
public static void main(String[] args) throws InterruptedException {
	
	//How to close all browsers without using quit method
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://omayo.blogspot.com/");
    
    WebElement link = driver.findElement(By.linkText("Open a popup window"));
    Thread.sleep(2000);
    Point loc = link.getLocation();
    int xa = loc.getX();
    int ya = loc.getY();
   
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy("+xa+","+ya+")");
    
    Thread.sleep(2000);
     String parenthandle = driver.getWindowHandle();
     System.out.println(parenthandle);
     link.click();
     
     Thread.sleep(2000);
     Set<String> allhandle = driver.getWindowHandles();
     System.out.println(allhandle);
     
     for(String wh:allhandle) {
    	 Thread.sleep(2000);
    	 driver.switchTo().window(wh).close();
     }
     

}
}

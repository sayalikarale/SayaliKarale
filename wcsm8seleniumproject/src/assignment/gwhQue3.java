package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gwhQue3 {
public static void main(String[] args) throws InterruptedException {
	
	//How to close only parent window
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
     
     Thread.sleep(2000);
     driver.close();
}
}

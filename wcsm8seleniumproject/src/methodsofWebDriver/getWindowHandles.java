package methodsofWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://omayo.blogspot.com/");
    //to open popup window
    WebElement link=driver.findElement(By.linkText("Open a popup window"));
    Point loc = link.getLocation();
    int xaxis = loc.getX();
    int yaxis = loc.getY();
    
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript
    ("window.scrollBy("+xaxis+","+yaxis+")");
    
    Thread.sleep(2000);
   
    link.click();
    Set<String> allhandle = driver.getWindowHandles();
    System.out.println("add. of all window :" +allhandle);











}
}

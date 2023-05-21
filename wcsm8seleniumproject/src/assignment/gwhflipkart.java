package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class gwhflipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[.='✕']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
    
    String parenthandle = driver.getWindowHandle();
   
    Set<String> allhandle = driver.getWindowHandles();
    
    for(String wh:allhandle)
    {
    	if (!parenthandle.equals(wh)) {
			driver.switchTo().window(wh);
		}
    	else {
    		
    	}
    }
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,800)");
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
    
    Thread.sleep(2000);
    jse.executeScript("window.scrollBy(0,800)");

    driver.findElement(By.linkText("512 GB")).click();
    Thread.sleep(2000);
    jse.executeScript("window.scrollBy(0,800)");

    driver.findElement(By.id("pincodeInputId")).sendKeys("410505");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Check']")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    Thread.sleep(2000);
    
    jse.executeScript("window.scrollBy(0,800)");
    driver.findElement(By.xpath("//div[text()='Remove']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Remove']/ancestor::div[@class='td-FUv WDiNrH']")).click();
    
    Thread.sleep(2000);
    driver.quit();











}
}

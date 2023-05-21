package xpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathLocator5 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    driver.findElement(By.name("q")).sendKeys("hp laptops");
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    
    
    
    
	
	
	
	
}
}

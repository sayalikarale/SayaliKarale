package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppersstack {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
     
    driver.get("https://www.shoppersstack.com/");
    driver.findElement(By.xpath("//a[text()='Shorts']")).click();
    driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("410505");
    driver.findElement(By.xpath("//button[@id='Check']")).click();
    

}
}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hotstarloginpagexpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    
    driver.get("https://www.hotstar.com/in/subscribe/sign-in");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("9356361887");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='submit-button']")).click();
    
}
}

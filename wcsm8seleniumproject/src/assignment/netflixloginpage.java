package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class netflixloginpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.netflix.com/in/Login");
    Thread.sleep(2000);
    driver.findElement(By.name("userLoginId")).sendKeys("sayalikarale678@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("sayalik@2000");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}

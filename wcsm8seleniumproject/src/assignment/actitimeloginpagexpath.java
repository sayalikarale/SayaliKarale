package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitimeloginpagexpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    
    driver.get("http://desktop-9vjhm05/login.do");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
    
    

}
}


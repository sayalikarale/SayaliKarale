package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class puma {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    
    driver.get("https://in.puma.com/in/en");
    driver.findElement(By.xpath("//span[text()='Men']")).click();
}

}

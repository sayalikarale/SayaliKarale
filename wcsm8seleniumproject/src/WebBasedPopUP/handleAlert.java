package WebBasedPopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("file:///C:/Users/HP/Desktop/WCSM8Workspace/AlertPopup.html");
    
    //to generate popup
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[.='Click me!']")).click();
    
    //to handle alert popup
    Thread.sleep(2000);
    Alert al = driver.switchTo().alert();
    //al.accept();
    al.dismiss();
    System.out.println();
}
}

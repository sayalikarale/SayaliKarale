package WebBasedPopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleConfirmationpopup {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
    driver.get("file:///C:/Users/HP/Desktop/WCSM8Workspace/Confirmation.html");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    Thread.sleep(2000);
    Alert al = driver.switchTo().alert();
    al.accept();
    
    
    System.out.println(al.getText());
    //we cant prin the text as we are handling from alert mehod for cofirmation
}
}
package assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropOnBlueStone {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.get("https://www.bluestone.com/");
     driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")).click();
     Actions act = new Actions(driver);
     act.moveToElement(null)
     driver.findElement(By.xpath("//a[text()='Band']")).click();
     
     
     








}
}

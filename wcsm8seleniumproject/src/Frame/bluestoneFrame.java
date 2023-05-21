package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestoneFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.bluestone.com/");
    //to handle Hidden Division Popup
    driver.findElement(By.id("denyBtn")).click();
    
    //identifying the frame
    driver.findElement(By.id("fc_frame"));
    //to switch control
    driver.switchTo().frame("fc_frame");
    
    Thread.sleep(2000);
    //identifying the chatbox
    WebElement chatbox = driver.findElement(By.xpath("//div[@id='chat-icon']/ancestor::div[@class='d-hotline h-btn animated zoomIn faster     ']"));
    chatbox.click();
    
    
    
    
    
    
    
}
}

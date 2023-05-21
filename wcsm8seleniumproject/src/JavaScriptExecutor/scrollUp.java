package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.instagram.com/accounts/login/");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    Thread.sleep(3000);
    //to scroll down
    jse.executeScript("window.scrollBy(0,450)");
    Thread.sleep(2000);
    //to scroll up
    jse.executeScript("window.scrollBy(0,-350)");




}
}

package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollRight {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    Thread.sleep(2000);
    //to scroll right
    jse.executeScript("window.scrollBy(5000,0)");
    


}
}

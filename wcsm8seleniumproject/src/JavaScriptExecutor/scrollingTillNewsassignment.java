package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingTillNewsassignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.selenium.dev/");
    WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
    Point point = news.getLocation();
    int xaxis = point.getX();
    int yaxis = point.getY();
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeAsyncScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");









}

}

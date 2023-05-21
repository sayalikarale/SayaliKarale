package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    WebElement loginbtn = driver.findElement(By.xpath("//button[text()=' Login ']"));
    Rectangle loc = loginbtn.getRect();
    int xaxis = loc.getX();
    int yaxis = loc.getY();
    System.out.println("x axis:"+xaxis+"y axis:"+yaxis);
    int h = loc.getHeight();
    int w = loc.getWidth();
    System.out.println("Height:"+h+"Width:"+w);
}
}

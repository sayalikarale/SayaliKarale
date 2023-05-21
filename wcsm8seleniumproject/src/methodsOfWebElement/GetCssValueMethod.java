package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    
    driver.get("https://www.instagram.com/");
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("sayali");
    driver.findElement(By.name("password")).sendKeys("123457");
    WebElement loginbtn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
    String font = loginbtn.getCssValue("font");
    System.out.println(font);
    
    
}
}

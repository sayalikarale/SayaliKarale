package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://desktop-9vjhm05/login.do");
    WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
    boolean verify = checkbox.isSelected();
    System.out.println(verify);
    checkbox.click();
    boolean verify1 = checkbox.isSelected();
    System.out.println(verify1);


}
}

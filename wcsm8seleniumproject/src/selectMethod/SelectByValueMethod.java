package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //for single select static Dropdown
    driver.get("file:///C:/html%20doc/dropdown.html");
    WebElement dropdown = driver.findElement(By.name("menu"));
    Select sel = new Select(dropdown);
    Thread.sleep(2000);
    //by using value method
    sel.selectByValue("v2");
}
}

package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.netflix.com/in/Login");
    WebElement textbox = driver.findElement(By.name("userLoginId"));
    driver.findElement(By.name("password")).sendKeys("1234");
    WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
    if (textbox.isDisplayed()) {
		textbox.sendKeys("sayali123");
		System.out.println("succesfully worked");
	}
    else {
		System.out.println("will get exception");
	}
    if (button.isDisplayed()) {
		button.click();
		System.out.println("succesfully worked");
	}
    else {
		System.out.println("will get exception");
	}
}
}

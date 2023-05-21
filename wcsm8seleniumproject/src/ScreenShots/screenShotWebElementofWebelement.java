package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShotWebElementofWebelement {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.instagram.com");
    WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
    if (button.isEnabled()) {
		System.out.println("can di login");
	}
    else {
		System.out.println("cant login take ss!!!");
		File src = button.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShots/webelement.jpg");
	    Files.copy(src, dest);
	    
    
    
    }




}
}

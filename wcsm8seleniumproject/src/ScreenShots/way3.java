package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class way3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.instagram.com/");
    TakesScreenshot ts = (TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("./ScreenShots/way3ss5.png");
    Files.copy(src, dest);
}
}

package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assignments3 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver(); 
	driver.manage().window().maximize();
}
}

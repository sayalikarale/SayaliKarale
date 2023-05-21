package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiiTimeLoginPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    // to get web application
    driver.get("http://desktop-9vjhm05/user/submit_tt.do");
    
    if (driver.getTitle().equals("actiTIME - Login"))
    {
	System.out.println("Login page title is matched,test case is passed");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("LoginButton")).click();
	
	}
    else {
    	System.out.println("Login page title is not matched,test case is failed");
	}

    if (driver.getTitle().equals("actiTIME - Enter Time-Track"))
    {
	System.out.println("Home page title is matched,test case is passed");
	}
    else {
    	System.out.println("Home page title is not matched,test case is failed");
	}
    
}
}

package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiiTimeLoginPageTestCase2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://desktop-9vjhm05/user/submit_tt.do");
    String LoginpageTitle = driver.getTitle();
    if (waitMethod(driver,30,LoginpageTitle)) {
		System.out.println("Login page title is matched!!, Test case is passed!!");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
    }
    else {
		System.out.println("Login page title is not matched!!, test case is not passed!!");
		
	}





}

private static boolean waitMethod(WebDriver driver, int i, String loginpageTitle) {
	// TODO Auto-generated method stub
	return false;
}
}

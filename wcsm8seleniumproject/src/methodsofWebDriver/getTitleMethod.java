package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/accounts/login/");
    String loginpageTitle =driver.getTitle();
    System.out.println(loginpageTitle);
               //OR
   //   System.out.println(driver.getTitle());
      
      
}
}

package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getCurrentTitleMethod {
public static void main(String[] args) {
	System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");
   	WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/");
    String scode=driver.getCurrentUrl();
    System.out.println(scode);


}
}

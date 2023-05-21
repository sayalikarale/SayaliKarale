package methodsofWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(co);
     driver.manage().window().maximize();
     
     driver.get("https://www.google.com/");
     driver.switchTo().activeElement().sendKeys("biryani");
     Thread.sleep(2000);
     List<WebElement> biryaniOptions = driver.findElements(By.xpath("//div[@class='ClJ9Yb']"));
     
     //by using for loop
 //     for(int b=1;b<biryaniOptions.size();b++)
 //     {
 //     String biryani = biryaniOptions.get(b).getText();
 //   	  System.out.println(biryani);
 //   	  Thread.sleep(2000);
 //     }
      
   //by using for each loop
     for(WebElement biryani:biryaniOptions)
     {
    	 System.out.println(biryani.getText());
    	 Thread.sleep(2000);
     }
}
}

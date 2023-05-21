package methodsofWebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class manageMethod {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    Dimension targetSize=new Dimension(300,500);
    Thread.sleep(2000);
    driver.manage().window().setSize(targetSize);
   Thread.sleep(2000);
   
     
     
}
}

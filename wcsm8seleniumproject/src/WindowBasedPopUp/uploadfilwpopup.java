package WindowBasedPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadfilwpopup {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://desktop-9vjhm05/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[.='Settings']/ancestor::a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
    WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
    
    Actions act = new Actions(driver);
    act.doubleClick(target).perform();
    
    File file = new File("./Autoit/upload file.exe");
    String abs = file.getAbsolutePath();
    
    //to intigrate compiled script and selenuim script
    Thread.sleep(4000);
    Runtime.getRuntime().exec(abs);
    Thread.sleep(2000);
    driver.quit();
    
    




}
}

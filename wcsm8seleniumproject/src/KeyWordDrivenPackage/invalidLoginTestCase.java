package KeyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;

public class invalidLoginTestCase extends baseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
	baseTest bt = new baseTest();
    flib flib = new flib();
    bt.openbrowser();
    
    for(int i=0;i<8;i++)
    {
    String invalidusername = flib.readexceldata(EXCEL_PATH, "invalidcreds", i, 0);
    String invalidpassword = flib.readexceldata(EXCEL_PATH, "invalidcreds", i, 1);
    
    driver.findElement(By.name("username")).sendKeys(invalidusername);
    Thread.sleep(2000);
    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("username")).clear();
    Thread.sleep(2000);
    }
    bt.closebrowser();
    }
}

package KeyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends baseTest{

 public static void main(String[] args) throws IOException, InterruptedException {
	
	 baseTest bt = new baseTest();
	 flib flib = new flib();
	 
	 bt.openbrowser();
	 driver.findElement(By.name("username")).sendKeys(flib.readpropertyfile(PROPERTY_PATH, "username"));
     driver.findElement(By.name("pwd")).sendKeys(flib.readpropertyfile(PROPERTY_PATH, "password"));
     Thread.sleep(2000);
     driver.findElement(By.id("loginButton")).click();
     bt.closebrowser();
  }
}

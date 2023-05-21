package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginactitime {
	//login with valid credentials
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("http://desktop-9vjhm05/login.do");
    
    //to get the username from the excel
    FileInputStream fis = new FileInputStream("./data/actitimetestdata.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sheet = wb.getSheet("validcreds");
    Row row = sheet.getRow(1);
    Cell cell = row.getCell(0);
    String data = cell.getStringCellValue();
  
    
    //to get the password from the excel
    FileInputStream fis1 = new FileInputStream("./data/actitimetestdata.xlsx");
    Workbook wb1 = WorkbookFactory.create(fis1);
    Sheet sheet1 = wb1.getSheet("validcreds");
    Row row1 = sheet1.getRow(1);
    Cell cell1 = row1.getCell(1);
    String data1 = cell1.getStringCellValue();
    
 
    driver.findElement(By.name("username")).sendKeys(data);
    Thread.sleep(2000);
    driver.findElement(By.name("pwd")).sendKeys(data1);
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
    
    //driver.quit();













}
}

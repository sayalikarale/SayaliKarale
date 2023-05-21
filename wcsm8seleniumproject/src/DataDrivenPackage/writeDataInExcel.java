package DataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeDataInExcel extends flib {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//insert cell in the existing sheet with data
	
    flib flib = new flib();
    flib.writedatainexcel("./data/Test Data.xlsx", "IPL", 1, 2, "karale");
    






}
}

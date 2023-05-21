package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readmultipleDataFromExcel {
	
	
//to read data multiple times 
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");//to provide relative path
    Workbook wb = WorkbookFactory.create(fis);//to make data readable
    
    for(int i=0; i<10; i++) {
    
    Sheet sheet = wb.getSheet("IPL");//to get the particular sheet
    Row row = sheet.getRow(i);//to get partcular row
    Cell cell = row.getCell(1);//to get particular cell/coloumn
    String data = cell.getStringCellValue();//to get the data present inside cell
    Thread.sleep(2000);
    
    FileInputStream fis1 = new FileInputStream("./data/Test Data.xlsx");//to provide relative path
    Workbook wb1 = WorkbookFactory.create(fis1);//to make data readable
    Sheet sheet1 = wb1.getSheet("IPL");//to get the particular sheet
    Row row1 = sheet1.getRow(i);//to get partcular row
    Cell cell1 = row.getCell(0);//to get particular cell/coloumn
    String data1 = cell1.getStringCellValue();//to get the data present inside cell
    Thread.sleep(2000);
    System.out.println(data +": " +data1);//print the data
    }
}
}

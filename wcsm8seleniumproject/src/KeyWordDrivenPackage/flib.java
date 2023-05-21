package KeyWordDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	//all are non static method
	//all are generic reusable method

    //generalization to read the data from the excel
	
	public String readexceldata(String excelpath, String sheetname, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
     FileInputStream fis = new FileInputStream(excelpath);
	 Workbook wb = WorkbookFactory.create(fis);	
	 Sheet sheet = wb.getSheet(sheetname);	
	 Row row = sheet.getRow(rowcount);	
	 Cell cell = row.getCell(cellcount);	
	 String data = cell.getStringCellValue();
	 return data;
	 }

   
     //to generalize the rowcount
     public int rowcount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException 
     {
    	 FileInputStream fis = new FileInputStream(excelpath);
    	 Workbook wb = WorkbookFactory.create(fis);	
    	 Sheet sheet = wb.getSheet(sheetname);
    	 int data = sheet.getLastRowNum();
         return data;
     }
     
     //to write data in excel
     public void writedatainexcel(String excelpath, String sheetname, int rowcount, int cellcount, String data) throws EncryptedDocumentException, IOException
     {
      	 FileInputStream fis = new FileInputStream(excelpath);
         Workbook wb = WorkbookFactory.create(fis);
         Sheet sheet = wb.getSheet(sheetname);
         Row row = sheet.getRow(rowcount);
         Cell cell = row.createCell(cellcount);
         cell.setCellValue(data);
         
         FileOutputStream fos = new FileOutputStream(excelpath);
         wb.write(fos);
     }

     //read data from property file
     public String readpropertyfile(String excelpath, String key) throws IOException
     {
    	 FileInputStream fis = new FileInputStream(excelpath);
    	 Properties prop = new Properties();
    	 prop.load(fis);
    	 String data = prop.getProperty(key);
    	 return data;
     }
}

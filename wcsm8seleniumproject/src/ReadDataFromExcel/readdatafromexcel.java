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

	public class readdatafromexcel {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		//how to read data from excel sheets
		
		//to rovide the path of excel sheet
		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
	    
		//get into the sheets
		Sheet sheet = wb.getSheet("IPL");
	 
		//to get into the desired row
		Row row = sheet.getRow(4);
	   
		//to get into desird cell/coloumn
		Cell cell = row.getCell(1);

		//read the data inside the cell
		String data = cell.getStringCellValue();

		//to print the value
		System.out.println(data);
	
	
}
}
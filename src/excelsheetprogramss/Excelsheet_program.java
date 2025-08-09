package excelsheetprogramss;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excelsheet_program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium3\\Excelsheet\\Anuradha.xlsx");
		Workbook W1 = WorkbookFactory.create(f1);// to display the excel sheet
		 String un1=NumberToTextConverter.toText(W1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());//to accept numeric values
	   // String un=W1.getSheet("login").getRow(1).getCell(0).getStringCellValue();//to accept string type value
	    System.out.println(un1);
	    String pwd=W1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	    System.out.println(pwd);

	
	
	
	
	}
	
	
	
	
	
	

}

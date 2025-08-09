package excelsheetprogramss;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchingvaluesfromexcelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium3\\Excelsheet\\Anuradha.xlsx");
		Workbook W1 = WorkbookFactory.create(f1);// to display the excel sheet
		Sheet s1 = W1.getSheet("login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String un = c1.getStringCellValue();
		System.out.println(un);
	}
}
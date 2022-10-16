package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelSheetData {

	public static String LoginDataExcel(int Rowindex,int Cellindex) throws EncryptedDocumentException, InvalidFormatException, IOException {
FileInputStream fs=new FileInputStream("D:\\velocity corporate\\ExcelData\\OrangeHRMData.xlsx");
Workbook workbook = WorkbookFactory.create(fs);
Sheet sheet = workbook.getSheet("sheet1");
String LoginData = sheet.getRow(Rowindex).getCell(Cellindex).getStringCellValue();
return LoginData;

	}
}

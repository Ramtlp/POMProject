package excelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData
{

	public static String fullname;
	public static String email;
	public static String craddress;
	public static String permanentaddress;
	
	
	public static void getdata() throws EncryptedDocumentException, IOException
	{
		String path="E:\\QADemoProject\\DemoQA\\ExcelData\\UserDetails.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		Workbook wb=WorkbookFactory.create(file);
		fullname=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		email=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		craddress=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		permanentaddress=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		
	}
}


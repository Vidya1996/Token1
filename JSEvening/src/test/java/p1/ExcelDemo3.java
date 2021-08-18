package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ExcelDemo3 {

	public static void main(String[] args) throws Exception 
	{
	 Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xlsx"));
	
	 Sheet sheet = wb.getSheet("sheet1");
	 int rowCount=sheet.getLastRowNum();
	 
	 for(int i=0;i<=rowCount;i++)
	 {
		 try 
		 {	 
			  int colCount = sheet.getRow(i).getLastCellNum();
			  for(int j=0;j<colCount;j++)
			  {
				  try 
				  {
					  String v=sheet.getRow(i).getCell(j).getStringCellValue();
					  System.out.print(v+" ");
				  }
				  catch (Exception e) 
				  {
					System.out.print("-- ");
				  }
			  }
		 }
		 catch (Exception e) {
			System.out.print("-- -- -- -- --");
		}
			  
	  System.out.println();
	 }
	 wb.close();
	 
	 
	}

}

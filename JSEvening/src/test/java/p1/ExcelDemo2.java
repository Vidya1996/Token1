package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ExcelDemo2 {

	public static void main(String[] args) throws Exception 
	{

		
	 String path="./data/book1.xlsx";
	 Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 String v=wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
			 System.out.print(v+" ");
		 }
		 System.out.println();
	 }

	 
	 
	 wb.close();
	 
	 
	}

}

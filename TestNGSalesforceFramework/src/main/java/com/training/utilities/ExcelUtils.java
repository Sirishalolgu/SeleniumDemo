package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook  ExcelWBook;
	static XSSFSheet ExcelWSHeet;
	static XSSFRow ROW;
	static XSSFCell CELL;

	public static Object[][] getTableArray(String filePath,String SheetName) throws Exception {
		
		String [][] tabArray=null;
		FileInputStream ExcelFile=new FileInputStream(filePath);
		ExcelWBook=new XSSFWorkbook(ExcelFile);
		
		ExcelWSHeet=ExcelWBook.getSheet(SheetName);
		int totalRows=ExcelWSHeet.getLastRowNum();
		int totalcols=2;
		tabArray=new String[totalRows][totalcols];
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=1;i<=totalcols;j++)
			{
				cell=	ExcelWSHeet.getRow(i).getCell(j);
				tabArray[i][j]=cell.to 
			}
		}
		return tabArray;

	}

}

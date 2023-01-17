package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	
	
	static XSSFWorkbook  ExcelWBook;
	static XSSFSheet ExcelWSHeet;
	static XSSFRow ROW;
	static XSSFCell CELL;
	public static void main(String[] args) throws Exception
	{
		String FilePath="C:\\October2022\\Java\\File one.xlsx";
		FileInputStream ExcelFile=new FileInputStream(FilePath);
		ExcelWBook=new XSSFWorkbook(ExcelFile);
		ExcelWSHeet=ExcelWBook.getSheet("Login");
		int totalRows=ExcelWSHeet.getLastRowNum();
		System.out.println(totalRows);
		int totalcols=2;
		
		
		for(int i=1;i<=totalRows;i++)
		{
			
			for(int j=1;j<=2;j++)
			{
				//System.out.print(ExcelWSHeet.getRow(i).getCell(j));
				CELL=ExcelWSHeet.getRow(i).getCell(j);
				System.out.print(CELL);
				
			}
			System.out.println("\n");
		}
		
				
	}

}

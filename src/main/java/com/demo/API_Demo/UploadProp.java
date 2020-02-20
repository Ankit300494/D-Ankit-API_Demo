package com.demo.API_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeTest;

public class UploadProp
{
	@BeforeTest
	public static void TestDataSheet() throws FileNotFoundException
	{
		try
		{
			File file = new File("D:\\Ankit\\API_Demo\\TestData");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet_TestData");
			String Text= sh.getRow(1).getCell(1).getStringCellValue();
			System.out.println(Text);
			

		}
		catch(IOException e) {
			// TODO: handle exception
			System.out.println("Error occured..");
		}
	}
}

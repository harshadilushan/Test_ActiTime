package com.actitime.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.actitime.base.BaseClass;

public class ExcelRead extends BaseClass{

	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
	   
	    File file =    new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook actiTimeWorkbook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    	if(fileExtensionName.equals(".xlsx")){
	    		actiTimeWorkbook = new XSSFWorkbook(inputStream);
	    	}
	    	else if(fileExtensionName.equals(".xls")){
	    	actiTimeWorkbook = new HSSFWorkbook(inputStream);
	    	}

	    Sheet actiTimeSheet = actiTimeWorkbook.getSheet(sheetName);
	    int rowCount = actiTimeSheet.getLastRowNum()-actiTimeSheet.getFirstRowNum();

	    	for (int i = 0; i < rowCount+1; i++) {
	        Row row = actiTimeSheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum(); j++) {
	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	        }
	        System.out.println();
	    	} 

	    }  


	    public static void main(String...strings) throws IOException{

	    ExcelRead objExcelFile = new ExcelRead();

	    String filePath = System.getProperty("user.dir")+"C:\\Users\\hdilu\\eclipse-workspace\\ActiTime\\src\\main\\java\\com\\actitime\\testdata";

	    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","actiTimeTestData");

	    }

	
}


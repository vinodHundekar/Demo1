package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLlocating {
	static XSSFWorkbook xsf;
	static XSSFSheet XLrecord;
	static FileInputStream fis;
	
	public XLlocating(String XLsheet) {
		File f=new File(XLsheet);
//		System.out.println(f.exists());  //returns true if file is present at mentioned location
		try {
			 fis= new FileInputStream(f);
				 xsf=new XSSFWorkbook(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String XLdata(int sheetno, int rowno, int colno) {		
		 XLrecord=xsf.getSheetAt(sheetno);		
		String XLvalues=XLrecord.getRow(rowno).getCell(colno).getStringCellValue();
		return XLvalues;
		
	}
	
	public int rowCount(int sheetno) {
		int Rows=xsf.getSheetAt(sheetno).getLastRowNum();
		return Rows++;
		
	}
	public int cellCount(int sheetno) {
		int cells=xsf.getSheetAt(sheetno).getRow(0).getLastCellNum();
		
		return cells;
		
	}
}

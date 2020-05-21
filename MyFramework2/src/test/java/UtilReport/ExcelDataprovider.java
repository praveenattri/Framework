package UtilReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {



	public XSSFWorkbook wb;

	public ExcelDataprovider() {

		File src=new File("./excel/data.xlsx");

		try {
			FileInputStream fis=new FileInputStream(src);

			wb=new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("The file data is not taken from the excel sheet");
		}	
	}

	public String getString_Data(int SheetAt,int RowNum, int ColoumNum) {

		return wb.getSheetAt(SheetAt).getRow(RowNum).getCell(ColoumNum).getStringCellValue();
	}
	public String get_StringData(String SheetName,int RowNum, int ColoumNum) {

		return wb.getSheet(SheetName).getRow(RowNum).getCell(ColoumNum).getStringCellValue();
	}
	public String get_NumericData(String SheetName,int RowNum, int ColoumNum) {

		return wb.getSheet(SheetName).getRow(RowNum).getCell(ColoumNum).getStringCellValue();
	}
}

package UtilReport;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {

	public static XSSFWorkbook wb;

	public ExcelDataprovider()
	{
		File src=new File("./excel/data.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis); 
		} catch (Exception e) {

			System.out.println("Unable to load data from Excel "+e.getMessage());
		}
	}
	public String getStringData(int SheetIndex, int RowNum, int RowColoum)
	{
		return wb.getSheetAt(SheetIndex).getRow(RowNum).getCell(RowColoum).getStringCellValue();
	}

	public String getStringData(String SheetName, int RowNum, int RowColoum)
	{
		return wb.getSheet(SheetName).getRow(RowNum).getCell(RowColoum).getStringCellValue();
	}

	public double getNumericValue(String SheetName, int RowNum, int RowColoum)
	{
		return wb.getSheet(SheetName).getRow(RowNum).getCell(RowColoum).getNumericCellValue();
	}
}

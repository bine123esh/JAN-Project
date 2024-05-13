package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import basepkg.Baseclass;

public class Excelutils extends Baseclass {
	
	private static XSSFWorkbook wb;
	private static XSSFWorkbook wb2;

	public static String getCellValue(String xl, String Sheet, int r, int c)
	{
		try
		
		{
			FileInputStream fi=new FileInputStream(xl);
			wb2 = new XSSFWorkbook(fi);
			
			XSSFCell cell =wb2.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v=cell.getNumericCellValue();
				int val=(int)v;
				return String.valueOf(val);
				//return cell.getRawValue();
				//cell.get
			}
		}
		catch(Exception e)
		{
			return"";
		}
	}
	
	public static int getRowCount (String xl, String Sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			wb = new XSSFWorkbook(fi);
			
			return wb.getSheet(Sheet).getLastRowNum();
		}
	
		catch(Exception e)
		{
			return 0;
		}
	}

}

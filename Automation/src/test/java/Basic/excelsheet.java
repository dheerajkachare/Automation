package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;



public class excelsheet
{
	

	
	public static String getValue(String login)
	{
		FileInputStream	fis = new FileInputStream("C:\\Users\\Dheeraj\\eclipse-workspace\\Automation\\testdataexcel");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet	sheet = wbook.getSheet("Sheet1");
		String value=null;
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		int columncount = sheet.getRow(rows).getLastCellNum();
		System.out.println(columncount);
		
		for (int i = 0; i <= rows; i++) 
		{
			for (int j = 0; j < columncount;) 
			{
				if (sheet.getRow(i).getCell(j).toString().equals(login)) 
				{
					j++;
					if (sheet.getRow(i).getCell(j).getCellType() == CellType.NUMERIC)
						{
						
						Long in = new Double(sheet.getRow(i).getCell(j).getNumericCellValue()).longValue();
						value= String.valueOf(in);
						} 
					else 
						{
						value= sheet.getRow(i).getCell(j).toString();
						}
					
				   }
				else 
				{
					break;
				}
			}
		}
		return value;
	}

}



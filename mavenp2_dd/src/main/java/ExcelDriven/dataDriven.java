package ExcelDriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	
	   public ArrayList<String> getData(String tcName) throws IOException
	   {
	     
		   ArrayList<String> a=new ArrayList<String>();
		
// file input stream argument
		FileInputStream fis =new FileInputStream("C:\\Users\\SayaliMane\\Desktop\\ExcelDriven.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fis);
        
// identify needed sheet        
    	int sheets =workbook.getNumberOfSheets();
    	for(int i=0; i<sheets; i++)
    	{
    		if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
    		{
    		XSSFSheet sheet=workbook.getSheetAt(i);
    		
// identify testcase columns by scanning entire single row    		
    		Iterator<Row> rows= sheet.iterator(); // collection of rows
    		Row firstrow =rows.next();
    		Iterator<Cell> c=firstrow.cellIterator(); // collection of cells
    
    		int k=0;
    		int column = 0;
    		while(c.hasNext())
    		{
    			Cell value = c.next();
    			if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
    			{
    				column=k;
    				System.out.println(value);
    			}
    			k++;
    		}
    		System.out.println(column);
    		
// once column identify scan entire testcase column  	
    		while(rows.hasNext())
    		{
    			Row r=rows.next();
    			if(r.getCell(column).getStringCellValue().equalsIgnoreCase(tcName))
    			{
// pull all data from row     				
    			Iterator<Cell> ic= r.cellIterator();
    			while(ic.hasNext())
    			{
    				Cell cell=ic.next();
    				if(cell.getCellType()==CellType.STRING)
    				{
    					a.add(cell.getStringCellValue());
    				}
    				else {
    					a.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
    				}
    				
    			}
    			
    		    }
    			
    
    		}
    		
    	    }
    	}
		return a;
       
    	
   }
}	  
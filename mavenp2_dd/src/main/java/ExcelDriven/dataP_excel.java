package ExcelDriven;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//public class dataP_excel {
//	
//	
//	public static Object[][] getData() {
//		 FileInputStream fis= new FileInputStream("C:\\Users\\SayaliMane\\Desktop\\ExcelDriven.xlsx"); //Excel sheet file location get mentioned here
//		 XSSFWorkbook workbook =new XSSFWorkbook(fis);; //get my workbook 
//		 XSSFSheet worksheet=workbook.getSheet("Sheet2");// get my sheet from workbook
//		       XSSFRow Row=worksheet.getRow(0);   //get my Row which start from 0   
//		   
//		    	int r = worksheet.getPhysicalNumberOfRows();// count my number of Rows
//		    	int c= Row.getLastCellNum(); // get last ColNum 
//		    	
//		    	Object Data[][]= new Object[r-1][c]; // pass my  count data in array
//		    	
//		     for(int i=0; i<r-1; i++) //Loop work for Rows
//		     {  
//		     XSSFRow row= worksheet.getRow(i+1);
//		     
//		     for (int j=0; j<c; j++) //Loop work for colNum
//		     {
//		     if(row==null)
//		     Data[i][j]= "";
//		     else 
//		     {
//		     XSSFCell cell= row.getCell(j);
//		     if(cell==null)
//		     Data[i][j]= ""; //if it get Null value it pass no data 
//		     else
//		     {
//		     String value=formatter.formatCellValue(cell);
//		     Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
//		     }
//		     }
//		     }
//		     }
//		  
//		
//
//	}
//
//}

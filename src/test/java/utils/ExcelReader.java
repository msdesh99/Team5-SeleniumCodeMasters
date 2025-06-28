package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
   private Workbook wrk;
   private Sheet sheet;
   private String file;
    
        public ExcelReader(String filePath, String sheetName) {
        	this.file = System.getProperty("user.dir")+filePath;
        	try(FileInputStream fis = new FileInputStream(new File(this.file))){
        		wrk = new XSSFWorkbook(fis);
        		sheet = wrk.getSheet(sheetName);
        	}catch(IOException ioe) {
        		System.out.println(ioe.getMessage());
        	}       	
        }
	
   public List<Map<String,Object>> readExcelToList(){
	    Row dataRow;
	    Map<String,Object>map = new HashMap<String,Object>();
	    List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
	    Row headerRow = sheet.getRow(0);
	    
	   	for(int j=1; j<sheet.getLastRowNum();j++) {
	   		dataRow = sheet.getRow(j);
	   		for(int i=0;i<headerRow.getPhysicalNumberOfCells();i++) {
	   			if(dataRow.getCell(i).getCellType().equals(CellType.NUMERIC)) 
	   				map.put(headerRow.getCell(i).getStringCellValue(), 
        				String.valueOf((long)dataRow.getCell(i).getNumericCellValue())); 
	   			else map.put(headerRow.getCell(i).getStringCellValue(),
	   					dataRow.getCell(i).getStringCellValue()); 
	   		}
    	list.add(map);	        	
	}   		
	   return list;
	   
   }
}

package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
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
        	this.file = System.getProperty("user.dir") + File.separator + filePath;
        	try(FileInputStream fis = new FileInputStream(new File(this.file))){
        		wrk = new XSSFWorkbook(fis);
        		sheet = wrk.getSheet(sheetName);
        	}catch(IOException ioe) {
        		System.out.println(ioe.getMessage());
        	}       	
        }
	
//   public List<Map<String,Object>> readExcelToList(){
//	    Row dataRow;
//	    Map<String,Object>map = new HashMap<String,Object>();
//	    List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//	    Row headerRow = sheet.getRow(0);
//	    
//	   	for(int j=1; j<sheet.getLastRowNum();j++) {
//	   		dataRow = sheet.getRow(j);
//	   		for(int i=0;i<headerRow.getPhysicalNumberOfCells();i++) {
//	   			if(dataRow.getCell(i).getCellType().equals(CellType.NUMERIC)) 
//	   				map.put(headerRow.getCell(i).getStringCellValue(), 
//        				String.valueOf((long)dataRow.getCell(i).getNumericCellValue())); 
//	   			else map.put(headerRow.getCell(i).getStringCellValue(),
//	   					dataRow.getCell(i).getStringCellValue()); 
//	   		}
//    	list.add(map);	        	
//	}   		
//	   return list;
//	   
//   }
   public List<Map<String,Object>> readExcelToList() {
	    List<Map<String,Object>> list = new ArrayList<>();
	    Row headerRow = sheet.getRow(0);
	    int totalRows = sheet.getLastRowNum();

	    for (int j = 1; j <= totalRows; j++) {
	        Row dataRow = sheet.getRow(j);
	        if (dataRow == null) continue;

	        Map<String,Object> map = new HashMap<>();
	        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
	            if (dataRow.getCell(i) == null) {
	                map.put(headerRow.getCell(i).getStringCellValue(), "");
	                continue;
	            }
	            if (dataRow.getCell(i).getCellType() == CellType.NUMERIC) {
	                map.put(headerRow.getCell(i).getStringCellValue(),
	                        String.valueOf((long)dataRow.getCell(i).getNumericCellValue()));
	            } else {
	                map.put(headerRow.getCell(i).getStringCellValue(),
	                        dataRow.getCell(i).getStringCellValue());
	            }
	        }
	        list.add(map);
	    }
	    return list;
	}


   public List<String> getColumnDataByName(String columnName) {
	    List<String> values = new ArrayList<>();
	    List<Map<String, Object>> data = readExcelToList();

	    for (Map<String, Object> row : data) {
	        Object value = row.get(columnName);
	        if (value != null) {
	            values.add(value.toString());
	        } else {
	            values.add(""); // add blank if cell was empty
	        }
	    }
	    return values;
	}
}

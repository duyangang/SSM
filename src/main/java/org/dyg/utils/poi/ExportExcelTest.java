package org.dyg.utils.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExportExcelTest {
	
	/**
	 * 根据模板导出Excel文件
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {  
        //excel模板路径  
        File fi=new File("D:\\test.xls");  
        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(fi));  
        //读取excel模板  
        HSSFWorkbook wb = new HSSFWorkbook(fs);  
        //读取了模板内所有sheet内容  0
        HSSFSheet sheet = wb.getSheetAt(0);
        System.out.println(sheet.getPhysicalNumberOfRows());
        //在相应的单元格进行赋值  
        HSSFCell cell = sheet.getRow(1).getCell(3);  
        cell.setCellValue("测试");  
        HSSFCell cell2 = sheet.getRow(3).getCell(3);  
        cell2.setCellValue("数据");  
        HSSFCell cell3 = sheet.getRow(0).getCell(0);  
        cell3.setCellValue("大标题");    
        //修改模板内容导出新模板  
        FileOutputStream out = new FileOutputStream("D:/export.xls");  
        wb.write(out);  
        out.close();  
    } 
}

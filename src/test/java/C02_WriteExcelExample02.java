import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcelExample02 {
    @Test
    public void changeExcelData() throws IOException {
       /* Create an object of File class to open xlsx file.
        Create an object of FileInputStream class to read excel file.
        Create an object of FileInputStream class to read excel file.
        Creating workbook instance that refers to .xlsx file.
        Creating a Sheet object.
        Get all rows in the sheet.
        Create a row object to retrieve row at index 3.
        Create a cell object to enter value in it using cell Index.
        Write the data in excel using output stream.
        Collapse*/

        //


        String filepath ="src/test/java/Resouruces/excelData.xlsx";
        File file=new File(filepath);

        FileInputStream fis=new FileInputStream(file);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet informationData=wb.getSheet("informationData");

int totalPowsUsed=informationData.getLastRowNum()-informationData.getFirstRowNum();
        System.out.println("totalPowsUsed = " + totalPowsUsed);
      Row row5=informationData.getRow(4);
       row5.createCell(0).setCellValue("nurcan");
       row5.createCell(1).setCellValue("yerlı");
       row5.createCell(2).setCellValue("nur@yer.com");
       row5.createCell(3).setCellValue("woman");
       row5.createCell(4).setCellValue("1223455");
       row5.createCell(5).setCellValue("adress");

        FileOutputStream fos=new FileOutputStream(file);
        wb.write(fos);
        fis.close();
        fos.close();
        wb.close();


    }












}

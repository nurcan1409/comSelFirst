package Day11_ApachePOI_wrıteExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcellExample {


   @Test
   public void writeexcell() throws IOException {
       //dosyamızın pathını belırledık
       String path="src\\test\\java\\Resouruces\\excelfile.xlsx";
       // dosyamızı acıyoruz
       FileInputStream fis=new FileInputStream(path);
       //Dosyamizi bir workbook haline getiriyoruz
       Workbook workbook= WorkbookFactory.create(fis);
       //Sheetimizi olusturduk
       Sheet sheet2=workbook.getSheetAt(1);
       // Ilk satirimiza gittik
       Row row1= sheet2.getRow(0);
       // Ilk satirimizin 3. hucresini olusturduk
       Cell row1cell3=row1.createCell(2);
       // Hucremize deger atadik
       row1cell3.setCellValue("POPULATION");
       //method chain ile data ekleme/degıstırme methodu
       sheet2.getRow(1).createCell(2).setCellValue("rusyanın populasyonu");
       sheet2.getRow(2).createCell(2).setCellValue("cının populasyonu");
       sheet2.getRow(3).createCell(2).setCellValue("ABDnin populasyonu");

       //Excel dosyamıza yazma ıslemını yapıyoruz
       FileOutputStream fos=new FileOutputStream(path);
       workbook.write(fos);
       //dosyalarımzı kapattık
       fis.close();
       fos.close();

       //workbook umuzu kapattık
       workbook.close();


   }









}

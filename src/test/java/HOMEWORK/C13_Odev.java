package HOMEWORK;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C13_Odev extends BaseTest {

    @Test
    public void test01() throws InterruptedException, IOException {

        //Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get(" https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        //Getting screenshot of  Orange HRM Page Section.
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //        Save the screenshot with format 'screenshotname_yyyy_MM_dd_hh_mm_ss.png'

String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss.png").format(new Date());
String path="src/test/java/Resouruces/fileExist.jpg";
      FileUtils.copyFile(source,new File(path));


    }


}

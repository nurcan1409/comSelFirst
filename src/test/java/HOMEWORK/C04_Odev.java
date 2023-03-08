package HOMEWORK;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class C04_Odev extends BaseTest {
    @Test
    public void test01() {
        // - https://demoqa.com/select-menu sitesine gidin
        driver.get(" https://demoqa.com/select-menu");
        //   - Multiple select yapabileceginiz <select> elementini locate edin
        WebElement selectbutton=driver.findElement(By.id("cars"));
//- Birden fazla secim yapip secimlerinizi DOGRULAyin

        Select secim=new Select(selectbutton);
        System.out.println("secim.isMultiple() = " + secim.isMultiple());
        secim.selectByVisibleText("Volvo");
    secim.selectByIndex(1);
    secim.selectByVisibleText("Opel");
    secim.selectByIndex(3);
        Assert.assertTrue(!selectbutton.isSelected());
    }

}

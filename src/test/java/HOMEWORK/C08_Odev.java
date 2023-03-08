package HOMEWORK;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C08_Odev extends BaseTest {
@Test
    public void test01() throws AWTException, InterruptedException {


    // https://api.jquery.com/ sitesine gidelim
driver.get("https://api.jquery.com/");
    // arama alanina json yazalim
    WebElement search=driver.findElement(By.name("s"));
    search.sendKeys("json");
    Thread.sleep(2000);
    //Enter islemini robot class kullanarak yapalim
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

}


}

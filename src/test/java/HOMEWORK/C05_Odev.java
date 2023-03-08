package HOMEWORK;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C05_Odev extends BaseTest {



@Test
    public void test01() {

    //Go to URL: http://demo.guru99.com/test/guru99home/
    driver.get("http://demo.guru99.com/test/guru99home/");
    // Find the number of iframes on the page.
    List<WebElement> linklist=driver.findElements(By.xpath("//iframe"));
    System.out.println("linklist.size() = " + linklist.size());
    // Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
    driver.switchTo().frame("a077aa5e");
    driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
    // Exit the iframe and return to the main page.

   driver.switchTo().defaultContent();

}








}

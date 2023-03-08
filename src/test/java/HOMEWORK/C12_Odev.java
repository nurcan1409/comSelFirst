package HOMEWORK;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C12_Odev extends BaseTest {


    @Test
    public void test01() throws InterruptedException {



//  Then verify if the file downloaded successfully
// Go to https://the-internet.herokuapp.com/download
driver.get("https://the-internet.herokuapp.com/download");
//  Download sample.png file

        WebElement samplepngLink = driver.findElement(By.linkText("sample.png"));
    samplepngLink.click();
Thread.sleep(3000);


    }






}

package HOMEWORK;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Set;

public class C07_Odev extends BaseTest {


    @Test
    public void test01() {

        //  Go to URL: https://demoqa.com/browser-windows
        driver.get(" https://demoqa.com/browser-windows");
        //  Click on the windows - "WindowButton"
        String pagHomeId=driver.getWindowHandle();
        WebElement tabbutton=driver.findElement(By.id("tabButton"));
        tabbutton.click();
        WebElement windowbutton=driver.findElement(By.id("windowButton"));
        windowbutton.click();
        //  Click on all the child windows.
        //  Print the text present on all the child windows in the console.
        Set<String> allWindows=driver.getWindowHandles();
        for(String each:allWindows) {
            if(!each.equals(pagHomeId)) {
                driver.switchTo().window(each);

                System.out.println((driver.findElement(By.id("sampleHeading")).getText()));

            }
        }


        //  Print the heading of the parent window in the console.,
        driver.switchTo().window(pagHomeId).getTitle();

    }
}

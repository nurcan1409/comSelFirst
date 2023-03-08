package Day9_JSEScroll_Cookier_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C11_AssertElementTrick extends BaseTest {
    @Test
            public void Filepload() {

        driver.get("https://the-internet.herokuapp.com/upload");

        //Upload edilecek dosyamizi seciyoruz
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        dosyaSec.sendKeys("C:\\Users\\user\\Desktop\\fileExist.png");

        // Upload butonuna basiyoruz
        WebElement uploadFile = driver.findElement(By.id("file-submit"));
        uploadFile.click();


        // Upload edilme mesajinin goruntulendigini dogruluyoruz
        List<WebElement>uploadedMessageList=driver.findElements(By.tagName("h3"));

Assert.assertEquals("upload mesajı goruntulenemedı ",1,uploadedMessageList.size());

WebElement uploadmessage=uploadedMessageList.get(0);

Assert.assertTrue(uploadmessage.isDisplayed());

Assert.assertEquals("mesajın textı ıstenılen gıbı goruntulenemıyor","file uploaded!",uploadmessage.getText());




    }








}

package HOMEWORK;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C02_Odev extends BaseTest {

    @Test
    public void Test() {

//Go to URL: https://demoqa.com/radio-button

        driver.get("https://demoqa.com/radio-button");
//Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
        WebElement yesbutton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        if (!yesbutton.isSelected()) {
            yesbutton.click();

        }

        WebElement yesSonuc = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println(yesSonuc.getText());


        WebElement impressiveButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        if (!impressiveButton.isSelected()) ;
        {
            impressiveButton.click();
        }
        WebElement impressiveButtonSonuc = driver.findElement(By.xpath("//span[@class='text-success']"));
        System.out.println(impressiveButtonSonuc.getText());

        WebElement nobutton = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));
        nobutton.click();
        Assert.assertTrue(nobutton.isDisplayed());


//Her bir seçenek seçildiğinde aşağıda çıkan text'leri konsolda yazdırınız.

        System.out.println("yesbutton = " + yesbutton.getText());
        System.out.println("nobutton = " + nobutton.getText());
        System.out.println("impressiveButton.getText() = " + impressiveButton.getText());
    }

}
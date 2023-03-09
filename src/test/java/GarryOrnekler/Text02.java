package GarryOrnekler;

import com.google.j2objc.annotations.Weak;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class Text02 extends BaseTest {

/*

    ● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.

    ● Bir method oluşturun: acceptAlert

        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının "You successfully clicked an alert" olduğunu test edin.

    ● Bir method oluşturun: dismissAlert

        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının "successfuly" içermediğini test edin.

    ● Bir method oluşturun: sendKeysAlert

        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna tıklayın ve result mesajında isminizin içerdiğini doğrulayın.

 */
    @Test
    public void acceptAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("Result")).getText(),"You successfully clicked an alert");
    }
@Test
    public void dismissAlert(){
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
jsConfirm.click();

driver.switchTo().alert().dismiss();
Assert.assertFalse(driver.findElement(By.id("Result")).getText().contains("successfuly"));

}
@Test
    public void sendKeysAlert(){
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
jsPrompt.click();

driver.switchTo().alert().sendKeys("nurcan");
driver.switchTo().alert().accept();
    Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("nurcan"));



}










}

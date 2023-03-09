package GarryOrnekler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class Text04 extends BaseTest {

/*

    1- https://html.com/tags/iframe/ sayfasına gidelim.

    2- Video'yu görecek kadar aşağı inin.

    3- Videoyu izlemek için Play tuşuna basın.

    4- Videoyu çalıştırdığınızı test edin.

*/

@Test
    public void test01(){

    driver.get(" https://html.com/tags/iframe/");

    WebElement iframe= driver.findElement(By.xpath("(//iframe[@frameborder='0'])[1]"));
 driver.switchTo().frame(iframe);

    WebElement play = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
    Actions actions=new Actions(driver);
   actions.click(play).perform();

    Assert.assertFalse(play.isDisplayed());







}








}

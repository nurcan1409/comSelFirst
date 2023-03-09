package GarryOrnekler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class Text05 extends BaseTest {

/*

    1- https://demoqa.com/droppable adresine gidelim.

    2- "Drag me" butonunu tutup "Drop here" kutusunun üstüne bırakalım.

    3- "Drop here" yazısı yerine "Dropped!" olduğunu test edin.

*/


@Test
    public void test01() {
    driver.get(" https://demoqa.com/droppable ");

    Actions actions=new Actions(driver);

    WebElement dragme=driver.findElement(By.id("draggable"));

WebElement drophere=driver.findElement(By.id("droppable"));

actions.dragAndDrop(dragme,drophere).perform();
    Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Dropped!']")).getText(),"Dropped!");


}





















}

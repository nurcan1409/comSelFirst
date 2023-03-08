package Day12_Screenshots;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;



public class TableTask1 extends BaseTest {


   /* Go to URL: https://the-internet.herokuapp.com/tables
    Print the entire table
    Print All Rows
    Print Last row data only
    Print column 5 data in the table body
    Write a method that accepts 2 parameters
    parameter 1 = row number
    parameter 2 = column number
    printData(3,4); => prints
    parameter 3 = table id
    printData(3,4,"table1") => prints data in 3rd row 4th Column with table id


    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table.getText() = " + table.getText());

        int satırsayisi=table.findElement(By.xpath(".//tr")).size();
        System.out.println("satırsayisi = " + satırsayisi);

        for (int i=2; i<satırsayisi; i++){
            table.findElement(By.xpath("(.//tr)[" +i+"]")).getText();

            WebElement sonsatır=driver.findElement(new By.ByXPath(".//tr["+(satırsayisi-1)+"]"));
            System.out.println("sonsatır.getText() = " + sonsatır.getText());
for (int j=1; j<satırsayisi; i++) {
    table.findElement(By.xpath(".//tr["+j+"]//td[5]")).getText();
}

*/







        }



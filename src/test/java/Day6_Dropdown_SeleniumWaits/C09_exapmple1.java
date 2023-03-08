package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C09_exapmple1 extends BaseTest {

    @Test
    public void test() {
        driver.get("http://www.amazon.com");
        WebElement buton = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        buton.sendKeys("samsung" + Keys.ENTER);
        WebElement span = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']) [1]"));

        span.click();
        driver.navigate().back();

        WebElement span1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']) [3]"));
        span1.click();


    }}








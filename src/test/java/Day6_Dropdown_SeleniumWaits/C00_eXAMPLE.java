package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C00_eXAMPLE {

    /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
            3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
*/

@Test
    public void test1() {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get("http://automationexercise.com");
WebElement sıgnup=driver.findElement(By.xpath(("//a[text()='Signup/Login']")));
    Actions actions=new Actions(driver);
actions.click(sıgnup).perform();
WebElement namekutusu=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
actions.click(namekutusu);
    actions.sendKeys("ahmet");
    actions.sendKeys(Keys.TAB);
    actions.sendKeys("asdd@dd.com");
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(Keys.ENTER);
    actions.perform();




}

}

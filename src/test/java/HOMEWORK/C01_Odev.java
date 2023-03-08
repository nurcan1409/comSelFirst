package HOMEWORK;

//import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
        import org.junit.Test;
import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import utilities.BaseTest;

//    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.
//    Verify that "You have selected" is visible
public class C01_Odev extends BaseTest {

   /* WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/



    @After
    public void tearDown() {

    }

    @Test
    public void test01 () {

//    Go to URL: https://demoqa.com/
        driver.get(" https://demoqa.com/");

        //Click on Elements.
        WebElement elementClick= driver.findElement(By.xpath("(//div[@class=\"avatar mx-auto white\"])[1]"));
       elementClick.click();

//    Click on Checkbox.
       WebElement checkbox=driver.findElement(By.xpath(("//span[@class='text'])[1]")));
checkbox.click();
//    Verify if Home checkbox is selected.
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        Assert.assertTrue(checkbox.isSelected());

//    Verify that "You have selected" is visible.

        WebElement result = driver.findElement(By.xpath("//div[@id=\"result\"]"));
        Assert.assertTrue(result.isDisplayed());




    }




}

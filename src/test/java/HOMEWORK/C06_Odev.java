package HOMEWORK;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class C06_Odev extends BaseTest {

@Test
    public void test01() {
    driver.get("https://testproject.io/");
    //Go to URL: https://testproject.io/

    //Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
    //TestProjectın blog sayfası ıcın yenı bır pencere acmak ıcın selenıumun 4 newwindow() yontemı
WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
    //https://blog.testproject.io/
driver.get("https://blog.testproject.io/");

}


}

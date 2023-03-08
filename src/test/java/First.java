import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {


       System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe") ;
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        System.setProperty("webdriver.chrome.driver","Dependencies//drivers//chromedriver.exe");
        WebDriver driver1=new ChromeDriver();


    }
}

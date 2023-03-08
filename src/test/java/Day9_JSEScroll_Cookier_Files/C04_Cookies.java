package Day9_JSEScroll_Cookier_Files;

import io.netty.handler.codec.http.cookie.Cookie;
import org.junit.Assert;
import org.junit.Test;
import utilities.BaseTest;

public class C04_Cookies  extends BaseTest {

  /*  Go to URL: https://kitchen.applitools.com/ingredients/cookie
    Get Cookie.
    Find the total number of cookies.
    Print all the cookies.
    Add Cookie.
    Edit Cookie.
    Delete Cookie.
    Delete All Cookies.*/




    @Test
    public void testCookie() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("test get cookie");
        Cookie cookie= (Cookie) driver.manage().getCookieNamed("protein");
       // Assert.assertEquals("chicken",cookie.getValue());

      //  Set<Cookie>allCookies=driver.manage().getCookies();

    }
}

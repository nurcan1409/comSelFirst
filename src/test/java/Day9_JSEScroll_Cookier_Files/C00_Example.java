package Day9_JSEScroll_Cookier_Files;

import org.junit.Test;
import utilities.BaseTest;

public class C00_Example extends BaseTest {

       /*
    go to url : https://api.jquery.com/dblclick/
    double click on the blue square at the bottom of the page and then write the changed color.
     */

    @Test
    public void doubleclick() {
        driver.get( "https://api.jquery.com/dblclick/");

    }
}

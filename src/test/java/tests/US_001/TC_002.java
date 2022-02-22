package tests.US_001;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_001Page;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_002 extends TestBase {

    US_001Page us_001Page;
    @Test
    public void tC_0002 (){
        us_001Page = new US_001Page();

        ReusableMethods.goToUrl();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(us_001Page.restaurantLink.isDisplayed(),"Test for visibility of 'restaurant Link' is failed!");

        us_001Page.restaurantLink.click();

    }

}

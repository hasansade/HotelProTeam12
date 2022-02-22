package tests.US_001;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_001Page;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_005 extends TestBase {

    US_001Page us_001Page;
    @Test
    public void tC_0005 (){
        us_001Page = new US_001Page();

        ReusableMethods.goToUrl();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(us_001Page.contactLink.isDisplayed(),"Test for visibility of 'contact Link' is failed!");

        us_001Page.contactLink.click();

    }

}

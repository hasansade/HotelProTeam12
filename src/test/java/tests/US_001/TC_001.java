package tests.US_001;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_001Page;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_001 extends TestBase {

    US_001Page us_001Page;
    @Test
    public void tC_0001 (){
        us_001Page = new US_001Page();

        ReusableMethods.goToUrl();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertFalse(us_001Page.welcomeToOurHotelPart.isDisplayed(),"Test for visibility of 'wellcome Text' is passed");


    }

}

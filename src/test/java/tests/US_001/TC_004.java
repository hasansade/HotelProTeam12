package tests.US_001;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_001Page;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_004 extends TestBase {

    US_001Page us_001Page;
    @Test
    public void tC_0004 (){
        us_001Page = new US_001Page();

        ReusableMethods.goToUrl();
        ReusableMethods.scrollTo(us_001Page.footerPart);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(us_001Page.footerPartHotelMyCamp.isDisplayed(),"Test for visibility of 'Hotelmycamp Part' is failed!");
        softAssert.assertTrue(us_001Page.footerPartUsefulLinks.isDisplayed(),"Test for visibility of 'Useful Link Part' is failed!");
        softAssert.assertTrue(us_001Page.footerPartPrivacy.isDisplayed(),"Test for visibility of 'Privacy Part' is failed!");
        softAssert.assertTrue(us_001Page.footerPartHaveAQuestions.isDisplayed(),"Test for visibility of 'Have a Questions? Part' is failed!");
        softAssert.assertAll();



    }

}

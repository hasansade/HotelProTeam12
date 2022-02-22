package tests.US_004;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class TC_003  extends TestBaseRapor {

    @Test
    public void test(){
        US_004Page us_004Page = new US_004Page();


        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        ReusableMethods.waitFor(1);
        us_004Page.hotelList.click();
        ReusableMethods.waitFor(1);
        us_004Page.addHotel.click();

        Assert.assertTrue(us_004Page.createHotelPage.isDisplayed(), "Create Hotel Sayfası Gözükmedi");
        extentTest = extentReports.createTest("TC_003 from US_004" , "Create Hotel sayfasi  görüldü");


    }


}

package tests.US_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_003Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {


    @Test
    public void test(){

        US_003Page us_003Page = new US_003Page();

        ReusableMethods.goToUrl();
        Assert.assertTrue(US_003Page.logIn.isDisplayed() , "Log İn butonu gözükmedi");

        US_003Page.logIn.click();
        extentTest = extentReports.createTest("TC_001 from US_003" , "Log in butonu görüldü ve tikLandi");
    }
}

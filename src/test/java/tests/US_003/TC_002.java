package tests.US_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_003Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_002 extends TestBaseRapor {
    @Test
    public void test() {

        US_003Page us_003Page = new US_003Page();

        ReusableMethods.goToUrl();
        ReusableMethods.waitFor(1);
        us_003Page.logIn.click();

        Assert.assertTrue(US_003Page.createNewAcc.isDisplayed(), " Create a new Account butonu görülmedi");
        ReusableMethods.waitFor(1);
        US_003Page.createNewAcc.click();

        extentTest = extentReports.createTest("TC_002 from US_003" , "Create a new Account butonu görüldü ve tiklandi");

    }

}

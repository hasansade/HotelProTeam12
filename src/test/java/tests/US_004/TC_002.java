package tests.US_004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_004Page;
import utilities.ReusableMethods;
import utilities.TestBase;


public class TC_002  extends TestBase {

    @Test
    public void test(){

       SoftAssert softAssert = new SoftAssert();

        US_004Page us_004Page = new US_004Page();

        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        us_004Page.hotelList.click();





    }

}

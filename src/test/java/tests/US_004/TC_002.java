package tests.US_004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_004Page;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.TestBaseRapor;


public class TC_002  extends TestBaseRapor {

    @Test
    public void test(){



        US_004Page us_004Page = new US_004Page();

        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        us_004Page.hotelList.click();
        us_004Page.addHotel.isDisplayed();

        extentTest = extentReports.createTest("TC_002 from US_004 ", "List of Hotels gorunur");
    }

}

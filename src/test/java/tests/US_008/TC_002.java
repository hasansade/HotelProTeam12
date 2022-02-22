package tests.US_008;

import org.testng.annotations.Test;
import pages.US_008Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_002 extends TestBaseRapor {

    public TC_002() {
    }

    @Test
    public void test() {
        ReusableMethods.login();
        US_008Page us_008Page = new US_008Page();
        ReusableMethods.waitForPageToLoad(3L);
        us_008Page.hotelManagementLinki.click();
        ReusableMethods.waitFor(2);
        us_008Page.roomReservationLinki.click();
        us_008Page.addRoomReservationButonu.isDisplayed();
        extentTest = extentReports.createTest("TC_002 from US_008 ", "List of Reservation gorunur");
    }
}

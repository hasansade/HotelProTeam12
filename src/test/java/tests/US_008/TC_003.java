package tests.US_008;

import org.testng.annotations.Test;
import pages.US_008Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_003 extends TestBaseRapor {

    public TC_003() {
    }

    @Test
    public void test() {
        ReusableMethods.login();
        US_008Page us_008Page = new US_008Page();
        ReusableMethods.waitForPageToLoad(3L);
        us_008Page.hotelManagementLinki.click();
        ReusableMethods.waitFor(2);
        us_008Page.roomReservationLinki.click();
        ReusableMethods.waitForClickablility(us_008Page.addRoomReservationButonu, 2);
        extentTest = extentReports.createTest("TC_003 from US_008 ", "Create Hotelroomreservatıon goruldu");
        extentTest.pass("Hotelroomreservatıon goruldu");
    }

}

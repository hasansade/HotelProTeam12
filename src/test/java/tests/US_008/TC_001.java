package tests.US_008;

import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {
    /*
        "Welcome to our hotel" yazısı gorunur olmali.
         */
    public TC_001() {
    }

    @Test
    public void test() {
        ReusableMethods.login();
        extentTest= extentReports.createTest("TC_001 anasayfaya Login olundu");
    }
}
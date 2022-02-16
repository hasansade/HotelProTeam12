package tests.US_008;

import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBase;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {

    public TC_001() {
    }

    @Test
    public void test() {

        ReusableMethods.login();
       // extentTest = extentReports.createTest("TC_001 from US_008 ", "Sayfaya Login olundu");
        //extentTest.info("hotel anasayfasına sayfasına gidildi");

    }
}

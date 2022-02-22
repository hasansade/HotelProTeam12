package tests.US_004;

import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {
    @Test
    public void test() {

        ReusableMethods.login();
        extentTest = extentReports.createTest("TC_001 from US_004" , "Başarılı bir şekilde login olundu");
    }
}
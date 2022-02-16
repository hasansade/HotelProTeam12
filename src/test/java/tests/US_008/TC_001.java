package tests.US_008;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001Raporlama extends TestBaseRapor {
    @Test
    public void test(){
        ReusableMethods.login();



        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("hotel anasayfasına sayfasına gidildi");
        extentTest = extentReports.createTest("TC_001 from US_008 ","Sayfaya Login olundu");


    }
}

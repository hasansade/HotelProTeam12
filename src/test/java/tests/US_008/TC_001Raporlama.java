package tests.US_008;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_001Raporlama extends TestBaseRapor {
    @Test
    public void test(){
        extentTest=extentReports.createTest("url giris");

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("hotel anasayfasına sayfasına gidildi");


    }
}

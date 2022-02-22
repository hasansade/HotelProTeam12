package tests.US_010;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_001Page;
import pages.US_010Page;
import utilities.ReusableMethods1;
import utilities.TestBase;
import utilities.TestBaseRapor;
//1- https://www.hotelmycamp.com/ sitesine girilir
//2-Login butonuna tiklanir
//3-Gecerli Username ve password girilir
//4- Basarili giris test edilir

public class TC_001 extends TestBase {
    US_010Page us_010Page;
    @Test
    public void tC_0001 (){
        us_010Page = new US_010Page();

        ReusableMethods1.login();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(us_010Page.hotelManagementLinki.isDisplayed(),"Login olunamadı");
    }
}

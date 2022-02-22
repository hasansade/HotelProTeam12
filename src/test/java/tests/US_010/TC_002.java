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

public class TC_002 extends TestBase {
    US_001Page us_001Page;
    @Test
    public void tC_0002 (){
        us_001Page = new US_001Page();

        ReusableMethods1.login();
        us_001Page.roomsLink.click();

    }
}

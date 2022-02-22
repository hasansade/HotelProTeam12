
package tests.US_010;

import pages.US_010Page;
import org.testng.annotations.Test;
import pages.US_001Page;
import pages.US_010Page;
import utilities.ReusableMethods1;
import utilities.TestBase;
import utilities.TestBaseRapor;
//1- https://www.hotelmycamp.com/ sitesine girilir
//2-Login butonuna tiklanir
//3-Gecerli Username ve password girilir
//4- Basarili giris test edilir

public class TC_003 extends TestBase {
    US_001Page us_001Page;
    US_010Page us_010Page;
    @Test
    public void tC_0003 (){
        us_001Page = new US_001Page();
        us_010Page = new US_010Page();

        ReusableMethods1.login();
        us_001Page.roomsLink.click();
        us_010Page.bookNowLinki.click();

    }
}

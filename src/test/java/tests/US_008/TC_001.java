package tests.US_008;

import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_001 extends TestBaseFinal {

MainPage mainPage=new MainPage();

    @Test
    public void test() throws InterruptedException {

        ReusableMethods.goToUrl();
        MainPage mainPage=new MainPage();
    }

}

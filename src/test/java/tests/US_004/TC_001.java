package tests.US_004;

import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBase;

public class TC_001 extends TestBase{
    @Test
    public void test() {

        ReusableMethods.login();
    }
}
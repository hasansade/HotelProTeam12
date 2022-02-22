package tests.US_009;

import org.testng.annotations.Test;
import pages.US_009.HotelMyCamp09;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02 {

    @Test
    public void test2(){

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        HotelMyCamp09 hotelMyCamp09 = new HotelMyCamp09();

        hotelMyCamp09.ilkLoginButton.click();

        hotelMyCamp09.userNameBox.sendKeys("manager");

        hotelMyCamp09.passwordBox.sendKeys("Manager1!");

        hotelMyCamp09.ikinciLoginButton.click();

        hotelMyCamp09.hotelManagementButton.click();
        hotelMyCamp09.hotelListButton.click();
        hotelMyCamp09.addHotelButton.click();

        Driver.closeDriver();


    }
}

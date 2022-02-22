package tests.US_006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_006.HotelMyCamp06;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03 {

    HotelMyCamp06 hotelMyCamp06;


    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        hotelMyCamp06 =new HotelMyCamp06();
        hotelMyCamp06.login.click();
        hotelMyCamp06.username.sendKeys(ConfigReader.getProperty("validUserName"));
        hotelMyCamp06.password.sendKeys(ConfigReader.getProperty("validPassword"));
        hotelMyCamp06.loginButonu.click();
        hotelMyCamp06.hotelManagement.click();
        hotelMyCamp06.hotelRooms.click();

        hotelMyCamp06.addHotelRoomBtn.click();

        Assert.assertTrue(hotelMyCamp06.createHotelRoomText.isDisplayed());
        // Create HotelRoom Yazisi Görüldü

    }

}

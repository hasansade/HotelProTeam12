package tests.US_006;

import org.testng.annotations.Test;
import pages.US_006.HotelMyCamp06;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC01 extends TestBaseRapor {
    HotelMyCamp06 hotelMyCamp06;

    @Test
    public void test() {
        extentTest=extentReports.createTest("21 Numaralı odalı Kaydi : ");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("Hotel sayfasına gidildi");
        hotelMyCamp06 =new HotelMyCamp06();


        hotelMyCamp06.login.click();
        extentTest.info("Butona basıldı");

        hotelMyCamp06.username.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.info("Kullanıcı adı başarılı bir şekilde girildi");

        hotelMyCamp06.password.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("Kullanıcı adı başarılı bir şekilde girildi");

        hotelMyCamp06.loginButonu.click();
        extentTest.info("Buton click edildi");
        hotelMyCamp06.hotelManagement.click();

        extentTest.info("Butona tıklandı");

        hotelMyCamp06.hotelRooms.click();
        hotelMyCamp06.roomId.sendKeys("21");
        extentTest.info("Başarılı bir şekilde 21 numaralı oda rezervasyonu yapıldı");


        hotelMyCamp06.roomSearch.click();


        Driver.closeDriver();

    }
}

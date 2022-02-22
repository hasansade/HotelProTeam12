package tests.US_009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.US_009.HotelMyCamp09;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03 {


    @Test
    public void test3() throws InterruptedException {

        HotelMyCamp09 hotelMyCamp09 = new HotelMyCamp09();
        hotelMyCamp09.HotelMyCamp();
        hotelMyCamp09.HotelMyCamp_buttonsClick();

        Thread.sleep(2000);

        Actions actions=new Actions(Driver.getDriver());

        actions.click(hotelMyCamp09.codeBox).
                sendKeys(ConfigReader.getProperty("CodeBox")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("NameBox")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("AdressBox")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("PhoneBox")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("EmailBox")).
                sendKeys(Keys.PAGE_DOWN).perform();


        Select select=new Select(hotelMyCamp09.selectIDGroup);
        select.selectByIndex(1);

        hotelMyCamp09.saveButton.click();

        Driver.closeDriver();

    }


}

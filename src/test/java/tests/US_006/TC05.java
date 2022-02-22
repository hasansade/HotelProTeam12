package tests.US_006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_006.HotelMyCamp06;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC05 {

    @Test
    public void TC05() throws InterruptedException {

        Actions actions=new Actions(Driver.getDriver());
        HotelMyCamp06 hotelMyCamp06=new HotelMyCamp06();

        ReusableMethods.login();

        hotelMyCamp06.hotelManagementLinki.click();
        hotelMyCamp06.hotelRoomsLinki.click();

        hotelMyCamp06.addHotelRoomBtn.click();

        Thread.sleep(3000);
        Select select=new Select(hotelMyCamp06.addHotelRoomSelectHotel);
        select.selectByVisibleText(ConfigReader.getProperty("NameBox"));

        hotelMyCamp06.addHotelRoomCode.sendKeys(ConfigReader.getProperty("addHotelRoomCode"));

        hotelMyCamp06.addHotelRoomName.sendKeys(ConfigReader.getProperty("addHotelRoomName"));

        hotelMyCamp06.addHotelRoomLocation.sendKeys(ConfigReader.getProperty("addHotelRoomLocation"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelMyCamp06.addHotelRoomDescription.sendKeys(ConfigReader.getProperty("addHotelRoomDescription"));

        Thread.sleep(2000);
        actions.dragAndDrop(hotelMyCamp06.price300, hotelMyCamp06.priceBox).perform();

        select=new Select(hotelMyCamp06.addHotelRoomType);
        select.selectByVisibleText(ConfigReader.getProperty("addHotelRoomType"));

        hotelMyCamp06.addHotelRoomMaxAdult.sendKeys(ConfigReader.getProperty("addHotelRoomMaxAdult"));

        hotelMyCamp06.addHotelRoomMaxChild.sendKeys(ConfigReader.getProperty("addHotelRoomMaxChild"));

        hotelMyCamp06.addHotelRoomApproved.click();

        hotelMyCamp06.addHotelRoomSaveBtn.click();

        Thread.sleep(2000);
        Assert.assertTrue(hotelMyCamp06.addHotelRoomSuccessfully.isDisplayed());

        hotelMyCamp06.addHotelRoomOkBtn.click();

        hotelMyCamp06.addHotelRoomArrowUp.click();

        Assert.assertTrue(hotelMyCamp06.createHotelRoomText.isDisplayed());








    }


}

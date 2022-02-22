package tests.US_008;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_004 extends TestBaseRapor {
    public TC_004() {
    }

    @Test
    public void test() {
        ReusableMethods.login();
        US_008Page us_008Page = new US_008Page();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();



        ReusableMethods.waitForPageToLoad(3L);
        us_008Page.hotelManagementLinki.click();
        ReusableMethods.waitFor(2);

        us_008Page.roomReservationLinki.click();
        us_008Page.addRoomReservationButonu.click();
        Select select = new Select(us_008Page.selectUserDropDown);

        select.selectByVisibleText(ConfigReader.getProperty("idUserAddRoomReservation"));
        select = new Select(us_008Page.selectHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("idHotelRoomAddRoomReservation"));

        us_008Page.priceBox.sendKeys(String.valueOf(faker.number().numberBetween(100, 500)));

        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("dateStartAddRoomReservation"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("dateEndAddRoomReservation"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1, 3)))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1, 3)))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("noteAddRoomReservation"))
                .sendKeys(Keys.TAB).perform();

        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", us_008Page.createHotelroomreservationSaveButonu);


        ReusableMethods.waitFor(1);
        us_008Page.createHotelroomreservationSaveButonu.click();
        ReusableMethods.waitFor(2);
       // Assert.assertTrue(us_008Page.roomReservationWasInsertedSuccessfullyOkButonu.isDisplayed(), "Rezervasyon Onay mesaji alinamadi.");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(us_008Page.roomReservationWasInsertedSuccessfullyOkButonu.isDisplayed());
        ReusableMethods.waitFor(2);
        us_008Page.roomReservationWasInsertedSuccessfullyOkButonu.click();

        extentTest = extentReports.createTest("TC_004 from US_008 ", "Basarili Hotelroomreservatıon yapildi");
        extentTest.pass("Hotelroomreservatıon yapıldı");
        softAssert.assertAll();
    }

}

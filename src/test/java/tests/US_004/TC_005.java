package tests.US_004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_004Page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_005  extends TestBaseRapor {
    public TC_005() {
    }

    @Test
    public void test(){
        driver.close();
        US_004Page us_004Page = new US_004Page();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        ReusableMethods.waitFor(1);
        us_004Page.hotelList.click();
        ReusableMethods.waitFor(1);
        us_004Page.addHotel.click();
        ReusableMethods.waitFor(1);
        us_004Page.addCode.sendKeys(String.valueOf(faker.number().numberBetween(100, 500)));

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .perform();

        Select slc = new Select(US_004Page.IDGroup);

        slc.selectByIndex(1);
        ReusableMethods.waitFor(2);
        slc.selectByIndex(2);

        ReusableMethods.waitFor(1);
    US_004Page.saveBtn.click();
    ReusableMethods.waitFor(3);
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertFalse(us_004Page.hotelWasInsertedText.isDisplayed(), "Hotel was inserted successfully yazısı görülmedi");
    softAssert.assertFalse(us_004Page.okBtn.isDisplayed(), "Ok butonu görülmedi");

    us_004Page.okBtn.click();

    extentTest = extentReports.createTest("TC_005 from US_004" , "Hotel was inserted successfully yazısı görüldü , ok butonuna basıldı");

    }
}

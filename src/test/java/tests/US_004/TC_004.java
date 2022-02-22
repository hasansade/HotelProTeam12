package tests.US_004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004Page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_004  extends TestBaseRapor {
    public TC_004() {
    }

    @Test
    public void test(){

        US_004Page us_004Page = new US_004Page();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        ReusableMethods.waitFor(1);
        us_004Page.hotelList.click();
        ReusableMethods.waitFor(1);
        us_004Page.addHotel.click();

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


       Assert.assertTrue(us_004Page.saveBtn.isDisplayed(), "Save butonu görülmedi");
       extentTest = extentReports.createTest("TC_004 from US_004" , " Create Hotel sekmesindeki bosluklar gecerli bilgiler ile dolduruldu ve save butonu görüldü ");




    }
}

package tests.US_003;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_003Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import com.github.javafaker.Faker;


public class TC_003 extends TestBaseRapor {
    @Test
    public void test() {

        US_003Page us_003Page = new US_003Page();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        ReusableMethods.goToUrl();
        US_003Page.logIn.click();
        ReusableMethods.waitFor(1);
        US_003Page.createNewAcc.click();


        Assert.assertTrue(US_003Page.editForm.isDisplayed(), "İnputlar görülmedi");

        String username = faker.name().username();
        String mail = faker.internet().emailAddress();
        String fullName = faker.name().fullName();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String adress = faker.address().fullAddress();

        US_003Page.userName.sendKeys(username);
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(fullName)
                .sendKeys(Keys.TAB)
                .sendKeys(phoneNumber)
                .sendKeys(Keys.TAB)
                .sendKeys(phoneNumber)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("drivingLicense"))
                .perform();

        Select slc = new Select(US_003Page.selectCountry);
        slc.selectByVisibleText("Turkey");

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(adress)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("workingSector"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("birthDate"))
                .perform();


        extentTest = extentReports.createTest("TC_003 from US_003" , "Registration" +
                " Formundaki bilgiler başarılı bir şekilde girilidi");
    }

}

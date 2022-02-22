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


public class TC_006 extends TestBaseRapor {
    public TC_006(){}

    @Test
    public void test(){

        US_004Page us_004Page = new US_004Page();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        ReusableMethods.login();
        us_004Page.hotelManagement.click();
        us_004Page.hotelList.click();
        us_004Page.addHotel.click();


        int code = faker.number().numberBetween(100, 500);
        String name = faker.name().name();
        String adress = faker.address().fullAddress();
        String phonenumber = faker.phoneNumber().phoneNumber();
        String email= faker.internet().emailAddress();

        US_004Page.addCode.sendKeys(String.valueOf(code));
        actions.sendKeys(Keys.TAB)
                .sendKeys(name)
                .sendKeys(Keys.TAB)
                .sendKeys(adress)
                .sendKeys(Keys.TAB)
                .sendKeys(phonenumber)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .perform();


        Select slc = new Select(US_004Page.IDGroup);

        slc.selectByIndex(1);
        ReusableMethods.waitFor(2);
        slc.selectByIndex(2);

        ReusableMethods.waitFor(1);
        us_004Page.saveBtn.click();
        ReusableMethods.waitFor(3);
        us_004Page.okBtn.click();

        ReusableMethods.waitFor(1);
        us_004Page.hotelList.click();

        us_004Page.CodeSearch.sendKeys(String.valueOf(code));
        actions.sendKeys(Keys.TAB)
                .sendKeys(name)
                .sendKeys(Keys.TAB)
                .sendKeys(adress)
                .sendKeys(Keys.TAB)
                .sendKeys(phonenumber)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .perform();


        Select slcc = new Select(US_004Page.selectGroup);
        slcc.selectByIndex(2);
        ReusableMethods.waitFor(1);
        us_004Page.searchBtn.click();

    Assert.assertTrue(us_004Page.foundData.isDisplayed(), "Hotel bulunamadı");
    extentTest = extentReports.createTest("TC_006 from US_004" , "Hotel başarılı bir şekilde search edildi ve List'de bulundu");






    }


}

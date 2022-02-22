package tests.US_010;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.US_010Page;
import org.testng.annotations.Test;
import pages.US_001Page;
import pages.US_010Page;
import utilities.*;


public class TC_005 extends TestBase {
    US_001Page us_001Page;
    US_010Page us_010Page;
    @Test
    public void tC_0005 () throws InterruptedException {
        US_001Page us_001Page = new US_001Page();
        US_010Page us_010Page = new US_010Page();

        ReusableMethods1.login();
        us_001Page.roomsLink.click();
        us_010Page.bookNowLinki.click();

        us_010Page.checkInDateKutusu.clear();
        us_010Page.checkInDateKutusu.sendKeys(ConfigReader.getProperty("checkIn"));
        us_010Page.checkOutDateKutusu.clear();
        us_010Page.checkOutDateKutusu.sendKeys(ConfigReader.getProperty("checkOut"));
        us_010Page.adultCountDropdown.click();
        Select select = new Select(us_010Page.adultCountDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("adultCount"));
        Select select1 = new Select(us_010Page.childrenCountDropdown);
        select1.selectByVisibleText(ConfigReader.getProperty("childrenCount"));

        us_010Page.nameSurnameKutusu.clear();
        us_010Page.nameSurnameKutusu.sendKeys(ConfigReader.getProperty("name"));
        us_010Page.emailKutusu.clear();
        us_010Page.emailKutusu.sendKeys(ConfigReader.getProperty("email"));
        us_010Page.telephoneKutusu.clear();
        us_010Page.telephoneKutusu.sendKeys(ConfigReader.getProperty("telephone"));
        us_010Page.nameCreditCardKutusu.clear();
        us_010Page.nameCreditCardKutusu.sendKeys(ConfigReader.getProperty("nameCredit"));
        us_010Page.cardNumberKutusu.clear();
        us_010Page.cardNumberKutusu.sendKeys(ConfigReader.getProperty("cardNumber"));
        Select select2 = new Select(us_010Page.yearDropdown);
        select2.selectByVisibleText(ConfigReader.getProperty("creditCardYear"));
        Select select3 =new Select(us_010Page.monthDropdown);
        select3.selectByVisibleText(ConfigReader.getProperty("creditCardMonth"));
        us_010Page.cvvKutusu.clear();
        us_010Page.cvvKutusu.sendKeys(ConfigReader.getProperty("cvv"));
        us_010Page.messageKutusu.clear();
        us_010Page.messageKutusu.sendKeys(ConfigReader.getProperty("message"));
        us_010Page.bookKutusu.click();
        Thread.sleep(2000);
        Assert.assertTrue(us_010Page.eklemeBasarili.isDisplayed());
        us_010Page.okButonu.click();


    }
}
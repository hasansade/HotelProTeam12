package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_010Page {

    public US_010Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "/html/body/section[1]/div/div/div[1]/div/div[1]/div/div/p[2]")
    public WebElement bookNowLinki;

    @FindBy(xpath = "//input[@id='checkin_date']")
    public WebElement checkInDateKutusu;

    @FindBy(xpath = "//input[@id='checkout_date']")
    public WebElement checkOutDateKutusu;

    @FindBy(xpath = "//select[@id='AdultCount']")
    public WebElement adultCountDropdown;

    @FindBy(xpath = "//select[@id='ChildrenCount']")
    public WebElement childrenCountDropdown;

    @FindBy(xpath = "//input[@id='NameSurname']\n")
    public WebElement nameSurnameKutusu;

    @FindBy(xpath = "//input[@id='EmailAddress']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='PhoneNumber']")
    public WebElement telephoneKutusu;

    @FindBy(xpath = "//input[@id='NameOnCreditCard']")
    public WebElement nameCreditCardKutusu;

    @FindBy(xpath = "//input[@id='CreditCardNumber']")
    public WebElement cardNumberKutusu;

    @FindBy(xpath = "//select[@id='CreditCardExpirationYear']")
    public WebElement yearDropdown;

    @FindBy(xpath = "//select[@id='CreditCardExpirationMonth']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//input[@id='CVV']")
    public WebElement cvvKutusu;

    @FindBy(xpath = "//textarea[@id='Message']")
    public WebElement messageKutusu;

    @FindBy(xpath = "//input[@value='Book this room']")
    public WebElement bookKutusu;

    @FindBy(xpath = "//div[text()='Reservation was made successfully'][2]")
    public WebElement eklemeBasarili;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButonu;




    public String selectedInDateControl (String day) {
        String xpath = "//input[contains(@value, '/"+day+"/2021' ) and @id='checkin_date']";
        return xpath;
    }

    public String selectedOutDateControl (String day) {
        String xpath = "//input[contains(@value, '/"+day+"/2021' ) and @id='checkout_date']";
        return xpath;
    }


    public String randomSelectedDayForIn (int randomDayForIn) {
        String xpath = "(//td [contains (@class, 'active')  or starts-with (@class, 'day') or contains (@class, 'new')])["+randomDayForIn+"]";
        return xpath;
    }

    public String randomSelectedDayForOut (int randomDayForOut) {
        String xpath = "(//td [contains (@class, 'active')  or starts-with (@class, 'day') or contains (@class, 'new')])["+randomDayForOut+"]";
        return xpath;
    }


}


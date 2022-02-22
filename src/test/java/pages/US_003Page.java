package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_003Page {

    public US_003Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public static WebElement logIn;

    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public static WebElement createNewAcc;

    @FindBy(xpath = "//input[@id='UserName']")
    public static WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public static WebElement password;

    @FindBy(xpath = "//input[@id='Email']")
    public static WebElement email;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public static WebElement nameSurname;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public static WebElement phoneNo;

    @FindBy(xpath = "//input[@id='SSN']")
    public static WebElement socialSecurity;

    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public static WebElement drivingLicanse;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public static WebElement selectCountry;

    @FindBy(xpath = "//select[@id='IDState']")
    public static WebElement selectState;

    @FindBy(xpath = "//input[@id='Address']")
    public static WebElement adress;

    @FindBy(xpath = "//input[@id='WorkingSector']")
    public static WebElement workingSelector;

    @FindBy(xpath = "//input[@id='BirthDate']")
    public static WebElement birdDate;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public static WebElement saveBtn;

    @FindBy(xpath = "//form[@id='edit-form']")
    public static WebElement editForm;

    @FindBy(xpath = "//div[@class='modal-content']")
    public static WebElement userDataWasInsertedAllert;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public static WebElement userDataWasInsertedOk;
}

package pages.US_009;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCamp09 {

    public WebDriver driver;
    public HotelMyCamp09 (){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(linkText = "Log in")
    public WebElement ilkLoginButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement ikinciLoginButton;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariligGirisYaziElementi;

    @FindBy(xpath = "//*[@id=\"divMessageResult\"]/div/span")
    public WebElement negativeResultMessage;

    @FindBy(xpath = "//*[@id=\"menuHotels\"]/span[1]")
    public WebElement hotelManagementButton;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListButton;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeBox;

    @FindBy (xpath = "//select[@id='IDGroup']")
    public WebElement selectIDGroup;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div")
    public WebElement successfullyTextElement;

    @FindBy (xpath = "/html/body/div[5]/div/div/div[2]/button")
    public WebElement okButton;

    public void HotelMyCamp (){
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        HotelMyCamp09 hotelMyCamp09=new HotelMyCamp09();
        hotelMyCamp09.ilkLoginButton.click();
        hotelMyCamp09.userNameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        hotelMyCamp09.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        hotelMyCamp09.ikinciLoginButton.click();

    }

    public void HotelMyCamp_buttonsClick (){
        HotelMyCamp09 hotelMyCamp09=new HotelMyCamp09();
        hotelMyCamp09.hotelManagementButton.click();
        hotelMyCamp09.hotelListButton.click();
        hotelMyCamp09.addHotelButton.click();
    }

}

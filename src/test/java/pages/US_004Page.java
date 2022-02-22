package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_004Page {

    public US_004Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath =  "//*[@id=\"menuHotels\"]/span[1]")
    public static WebElement hotelManagement;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/a")
    public static WebElement hotelList;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/a/span")
    public static WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public static WebElement addCode;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public static WebElement IDGroup;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement saveBtn;

    @FindBy(xpath = "/html/body/div[5]/div/div")
    public static WebElement hotelWasInsertedText;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public static WebElement okBtn;

    @FindBy(xpath = "//div[@class='row']")
    public static WebElement createHotelPage;

    //TC_006

    @FindBy(xpath = "//input[@name='IDHotel']")
    public  static  WebElement IDHotelSearch;

    @FindBy(xpath = "//input[@name='Code']")
    public  static  WebElement CodeSearch;

    @FindBy(xpath = "//input[@name='Name']")
    public  static  WebElement NameSearch;

    @FindBy(xpath = "//input[@name='Address']")
    public  static  WebElement AddressSearch;

    @FindBy(xpath = "//input[@name='Phone']")
    public  static  WebElement PhoneSearch;

    @FindBy(xpath = "//input[@name='Email']")
    public  static  WebElement EmailSearch;

    @FindBy(xpath ="//select[@name='lkpGroups']")
    public static  WebElement selectGroup;

    @FindBy(xpath ="//button[@class='btn btn-sm yellow filter-submit margin-bottom']" )
    public static WebElement searchBtn;

    @FindBy(xpath = "//div[@id='datatable_ajax_info']")
    public static WebElement foundData;


}

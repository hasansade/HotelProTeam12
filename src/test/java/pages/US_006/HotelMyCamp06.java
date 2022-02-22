package pages.US_006;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp06 {

    WebDriver driver;

    public HotelMyCamp06(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement login;

    @FindBy(id = "UserName")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(name = "IDHotelRoom")
    public WebElement roomId;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement roomSearch;

    @FindBy(name = "Code")
    public WebElement roomCode;

    @FindBy(name = "Name")
    public WebElement roomName;

    @FindBy(name = "Location")
    public WebElement roomLocation;

    @FindBy(name = "Price")
    public WebElement roomPrice;

    @FindBy(xpath = "//span[text()='Add Hotelroom ']")
    public WebElement addHotelRoomBtn;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsLinki;

    @FindBy(id = "Code")
    public WebElement addHotelRoomSelectHotel;

    @FindBy(id = "Name")
    public WebElement addHotelRoomCode;

    @FindBy(id = "Location")
    public WebElement addHotelRoomName;


    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/textarea")
    public WebElement addHotelRoomLocation;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomText;

    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/textarea")
    public WebElement addHotelRoomDescription;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(linkText = "300")
    public WebElement price300;

    @FindBy(id = "IDGroupRoomType")
    public WebElement addHotelRoomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement addHotelRoomMaxAdult;

    @FindBy(id = "MaxChildCount")
    public WebElement addHotelRoomMaxChild;

    @FindBy(id = "IsAvailable")
    public WebElement addHotelRoomApproved;

    @FindBy(id = "btnSubmit")
    public WebElement addHotelRoomSaveBtn;
    @FindBy(
            xpath = "//div[@class='bootbox-body']"
    )
    public WebElement addHotelRoomSuccessfully;

    @FindBy(
            xpath = "//button[@class='btn btn-primary']"
    )
    public WebElement addHotelRoomOkBtn;

    @FindBy(
            className = "icon-arrow-up"
    )
    public WebElement addHotelRoomArrowUp;



    public void hotelRoomsLinki() {
    }
}

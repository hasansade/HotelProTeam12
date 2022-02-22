package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008Page {

    public US_008Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//span[text()='System Management']")
    public WebElement systemManagementLinki;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Room reservation")
    public WebElement roomReservationLinki;

    @FindBy(xpath = "//span[text()='Add Room Reservation ']")
    public WebElement addRoomReservationButonu;

@FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfReservationsLinki;

    @FindBy(id = "IDUser")
    public WebElement selectUserDropDown;

    @FindBy(id = "IDHotelRoom")
    public WebElement selectHotelDropDown;

    @FindBy(id= "Price")
    public WebElement priceBox;

    @FindBy(id = "btnSubmit")
    public WebElement createHotelroomreservationSaveButonu;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement roomReservationWasInsertedSuccessfullyOkButonu;



}
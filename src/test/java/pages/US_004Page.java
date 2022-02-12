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


}

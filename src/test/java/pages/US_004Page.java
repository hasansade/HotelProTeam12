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

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]")
    public static WebElement listOfHotels;


}

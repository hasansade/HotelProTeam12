package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008Page {

    public US_008Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
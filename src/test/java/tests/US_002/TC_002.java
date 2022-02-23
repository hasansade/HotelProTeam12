package tests.US_002;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

// Anasayfadaki "Rooms" butonu gorunebilir ve kullanabilir olmali
// Rooms butonuna tiklanir
// Rooms sayfasina gittigi test edilir

public class TC_002 extends TestBaseRapor {
    @Test
    public void roomsPage () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomsButton = driver.findElement(By.xpath("(//a[text()='Rooms'])[1]"));
        Assert.assertTrue(roomsButton.isEnabled());
        roomsButton.click();
        String actualRoomsUrl = driver.getCurrentUrl();
        String expectedRoomsUrl = "https://www.hotelmycamp.com/rooms";
        Assert.assertEquals(actualRoomsUrl, expectedRoomsUrl);
    }

    @Test
    public void roomsPageScreenshot () throws IOException {
        driver.get("https://www.hotelmycamp.com/");
        TakesScreenshot tss=(TakesScreenshot) driver;
        File roomPageScreenshot = new File("target/screenShot/roomPageSS.png");
        File temporaryScreenshotFile = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temporaryScreenshotFile,roomPageScreenshot);
    }
}
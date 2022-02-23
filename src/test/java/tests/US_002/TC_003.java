package tests.US_002;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

/*
"Rooms" bolumunun icindeki "Advanced Search" kismi gorunur ve altindaki fonsiyonlar kullanilabilir  olmali
"Advanced Search" kisminin altinda bulunan "Check-in Date" kutusuna tiklanmali ve tarih girilmeli
"Check-out Date" kutusuna tiklanmali ve otelden cikis tarihi girilmeli
"Select Room Type" kutusuna tiklanmali ve oda turu secilmeli
"Select Adult Count" kutusuna tiklanmali ve kalacak kisi sayisi girilmeli
"Select Children Count" kutusuna tiklanmali ve kalacak kisi sayisi girilmeli
Location kutusuna tiklanmali ve location bos birakilmali
Search butonuna tiklanmali
Butona tiklandiktan sonra acilan arama sonuclari sayfasinin ekran goruntuse alinir
*/

public class TC_003 extends TestBaseRapor {


    @Test
    public void advancedSearchButtonDisplayed() {
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomsButtonElement = driver.findElement(By.id("navRooms"));
        roomsButtonElement.click();
        WebElement advancedSearchElement = driver.findElement(By.xpath("//h3[text()='Advanced Search']"));
        Assert.assertTrue(advancedSearchElement.isDisplayed(), "Advanced Search button must be displayed");
    }

    @Test
    public void checkInDateBox() {
        driver.get("https://www.hotelmycamp.com/");
        WebElement checkInDateElement = driver.findElement(By.id("checkin_date"));
        checkInDateElement.clear();
        Assert.assertTrue(checkInDateElement.isEnabled());
        checkInDateElement.sendKeys("02/25/2022");
    }

    @Test
    public void checkOutDateBox() {
        // checkOutDateElement = driver.findElement(By.id("navRooms"));
        driver.get("https://www.hotelmycamp.com/");
        WebElement checkOutDateElement = driver.findElement(By.id("checkout_date"));
        checkOutDateElement.clear();
        Assert.assertTrue(checkOutDateElement.isEnabled());
        checkOutDateElement.sendKeys("02/28/2022");
    }

    @Test
    public void roomTypeDropdownList() {
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomTypeDropdownList = driver.findElement(By.xpath("//select[@id='IDRoomType']"));
        Select select = new Select(roomTypeDropdownList);
        Assert.assertTrue(roomTypeDropdownList.isEnabled());
        select.selectByVisibleText("Studio");
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @Test
    public void adultCount () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement adultCount = driver.findElement(By.xpath("//select[@id='AdultCount']"));
        Select select = new Select(adultCount);
        Assert.assertTrue(adultCount.isEnabled());
        select.selectByVisibleText("2 Adult");
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @Test
    public void childrenCount () {
        // WebElement childrenCount = driver.findElement(By.id("ChildrenCount"));
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomsButtonElement = driver.findElement(By.id("navRooms"));
        roomsButtonElement.click();
        WebElement childrenCount = driver.findElement(By.id("ChildrenCount"));
        Select select = new Select(childrenCount);
        Assert.assertTrue(childrenCount.isEnabled());
        select.selectByVisibleText("2 Children");
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @Test
    public void locationBox () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomsButtonElement = driver.findElement(By.id("navRooms"));
        roomsButtonElement.click();
        WebElement locationBox = driver.findElement(By.id("location"));
        locationBox.click();
        locationBox.clear();
        Assert.assertTrue(locationBox.getText().isBlank());
    }

    @Test
    public void searchButton () throws IOException {
        driver.get("https://www.hotelmycamp.com/");
        WebElement roomsButtonElement = driver.findElement(By.id("navRooms"));
        roomsButtonElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//input[@class='btn btn-primary py-3 px-5']"));
        Assert.assertTrue(searchButton.isEnabled());
        searchButton.click();

        TakesScreenshot tss=(TakesScreenshot) driver;
        File searchResultScreenhot = new File("target/screenShot/searchResultPage.png");
        File temporaryPicture=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temporaryPicture,searchResultScreenhot);
    }
}

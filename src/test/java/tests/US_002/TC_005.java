package tests.US_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TC_005 extends TestBaseRapor {

    @Test
    public void questionsDisplayed () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement questionsTextElement = driver.findElement(By.xpath("//h2[text()='Have Questions?']"));
        Assert.assertTrue(questionsTextElement.isDisplayed());
    }
    @Test
    public void phoneIconButtonEnabled () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement phoneNumberButtonElement =driver.findElement(By.xpath("//span[@class='icon icon-phone']"));
        Assert.assertTrue(phoneNumberButtonElement.isEnabled());
    }

    @Test
    public void phoneNumberButtonnabled () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement phoneNumberButtonElement =driver.findElement(By.xpath("//span[text()='302 718 2180']"));
        Assert.assertTrue(phoneNumberButtonElement.isEnabled());
    }

    @Test
    public void emailIconEnabled () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement emailIconButtonElement =driver.findElement(By.xpath("//span[@class='icon icon-envelope']"));
        Assert.assertTrue(emailIconButtonElement.isEnabled());
    }

    @Test
    public void emailAddressInabled () {
        driver.get("https://www.hotelmycamp.com/");
        WebElement emailAddressButtonElement =driver.findElement(By.xpath("//span[text()='info@hotelmycamp.com']"));
        Assert.assertTrue(emailAddressButtonElement.isEnabled());
    }
}
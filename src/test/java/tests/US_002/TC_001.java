package tests.US_002;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;
import utilities.TestBaseRapor;

//  Anasayfadaki "Our Rooms" kısmı gorunebilir olmali, altindaki
//  "View Room Details" butonlari gorunur ve kullanilabilir olmali

public class TC_001 extends TestBaseRapor {

    @Test
    public void room1Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room1ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[1]"));
        actions.moveToElement(room1ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room1ReviewdetailsButton).perform();
        String room1Page = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(room1Page), "Review Details button could not lead to room1 page");
    }

    @Test
    public void room2Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room2ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[2]"));
        actions.moveToElement(room2ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room2ReviewdetailsButton).perform();
        String room2Page = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(room2Page), "Review Details button could not lead to room2 page");
    }

    @Test
    public void room3Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room3ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[3]"));
        actions.moveToElement(room3ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room3ReviewdetailsButton).perform();
        String room3Page = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(room3Page), "Review Details button could not lead to room3 page");
    }

    @Test
    public void room4Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room4ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[4]"));
        actions.moveToElement(room4ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room4ReviewdetailsButton).perform();
        String room4Page = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(room4Page), "Review Details button could not lead to room4 page");
    }

    @Test
    public void room5Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room5ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[5]"));
        actions.moveToElement(room5ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room5ReviewdetailsButton).perform();
        String room5Page = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(room5Page), "Review Details button could not lead to room5 page");
    }

    @Test
    public void room6Reviewdetails () throws InterruptedException {
        driver.get("https://www.hotelmycamp.com/");
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement room6ReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[6]"));
        actions.moveToElement(room6ReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(room6ReviewdetailsButton).perform();
        String roomMsAbelConsidinePage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomMsAbelConsidinePage), "Review Details button could not lead to room6 page");
    }
}

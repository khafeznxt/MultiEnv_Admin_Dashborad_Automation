package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContentItineraryPage extends BasePage {
    public ContentItineraryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=  "//*[text() =\"Content\"]")
    protected WebElement content;
    @FindBy(xpath=  "//*[text() =\"Itinerary\"]")
    protected WebElement itinerary;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div[2]/div[2]/div[3]/div[97]/div")
    protected WebElement calender;

    @FindBy(id = "activityTitle")
    protected  WebElement activitytitle;

    @FindBy(id = "attire")
    protected  WebElement activityattire;

    @FindBy(id = "activityDate")
    protected  WebElement activitydate;

    @FindBy(id = "startTime")
    protected  WebElement activitystarttime;

    @FindBy(id = "endTime")
    protected  WebElement activityendtime;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/div/form/div[2]/section[2]/div[11]/div[2]/div[2]")
    protected WebElement activityhtimezone;

    @FindBy(css = "[value=\"(UTC+03:00) Doha\"]")
    protected WebElement activitytimezonevalue;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/div/form/div[2]/section[1]/div[2]/div/button[2]")
    protected WebElement activitysavebutton;

    //to test this case separately
    @FindBy(xpath=  "//*[text() =\"Karim Event_1\"]")
    protected WebElement createdevent;

    @FindBy(xpath=  "//*[text() =\"TimeZone\"]")
    protected WebElement activitytimezonelabel;



public void CreateItinerary(){
    createdevent.click();
    content.click();
    itinerary.click();
    calender.click();
    activitytitle.sendKeys("karimactivity_1");
    activityattire.sendKeys("formal");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", activityhtimezone);
    activityhtimezone.click();
    activitytimezonevalue.click();
    activitysavebutton.click();
}

}

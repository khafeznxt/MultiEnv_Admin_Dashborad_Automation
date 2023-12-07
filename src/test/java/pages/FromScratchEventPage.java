package pages;

import Utls.ConfigUtils;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FromScratchEventPage extends BasePage {

    public FromScratchEventPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "New Event")

    protected WebElement createvent;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/div[2]/div[1]/div")

    protected WebElement fromscratch;

    @FindBy(xpath = "//*[@id=\"event_name\"]")
    protected  WebElement eventname;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/select")
    protected WebElement eventtype;

    @FindBy(xpath = "//*[@id=\"0\"]")
    protected WebElement typevalue;

    @FindBy(id = "event_slug")
    protected WebElement eventslug;

    @FindBy(id = "Start_Date")
    protected WebElement startdate;

    @FindBy(id = "End_Date")
    protected WebElement enddate;

    @FindBy(id = "Start_Time")
    protected WebElement starttime;

    @FindBy (id = "End_Time")
    protected WebElement endtime;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/section/div[2]/div/div[1]/button")
    protected WebElement cancelbttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/div/div/div[2]/div[2]/div[3]/div[2]/select")
    protected WebElement timezone;

    @FindBy(css = "[value=\"(UTC+03:00) Doha\"]" )
    protected WebElement timezonevalue;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/section/div[2]/div/div[2]/button")
    protected WebElement createbtn;

    @FindBy(xpath=  "//*[text() =\"karimevent_6\"]")
    protected WebElement createdevent;

    public void load() {
        driver.get(ConfigUtils.getInstance().BaseUrl());
        //return this;
    }
    public void CreateEventFromScratch(){

        createvent.click();
        fromscratch.click();
        eventname.sendKeys("Automation Event  12");
        eventtype.click();
        typevalue.click();
        eventslug.sendKeys("Autoevent12");
        startdate.sendKeys("12022023");
        starttime.sendKeys("1200PM");
        endtime.sendKeys("0800PM");
        enddate.sendKeys("01012024");
        // cancelbttn.click();
        timezone.click();
        timezonevalue.click();
        createbtn.click();
        //createdevent.click();


    }
}

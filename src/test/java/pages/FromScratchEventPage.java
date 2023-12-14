package pages;

import Utls.ConfigUtilsProd;
import Utls.ConfigUtilsStg;
import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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



    @FindBy(xpath=  "//*[text() =\"Event Info\"]")
    protected WebElement eventinfo;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/div/div/button")
    protected WebElement editevent;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div[2]/div/div/div[13]/div[1]/div/div/span")
    protected WebElement advancedconfig;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div[2]/div/div/div[13]/div[2]/div/div[4]/div/div[2]/div/label/div")
    protected WebElement vmstogglebttn;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/div/div[3]")
    protected WebElement saveeventediting;
    @FindBy(xpath=  "//*[text() =\"Event Config\"]")
    protected WebElement eventconfig;
    @FindBy(xpath=  "//*[text() =\"Automated VMS Event\"]")
    protected WebElement createdevent;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[2]/div/div/div[1]/button")
    protected WebElement sessionsuccessmsg;


    public void load() {
        driver.get(ConfigUtilsStg.getInstance().BaseUrl());
        //return this;
    }

    public void loadprod() {
        driver.get(ConfigUtilsProd.getInstance().BaseUrl());
        //return this;
    }
    @Step
    public void CreateEventFromScratch(){

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element5 = wait5.until(ExpectedConditions.visibilityOf(createvent));
        createvent.click();
        fromscratch.click();
        eventname.sendKeys("Automated VMS Event");
        eventtype.click();
        typevalue.click();
        eventslug.sendKeys("autovms");
        startdate.sendKeys("12022023");
        starttime.sendKeys("1200PM");
        endtime.sendKeys("0800PM");
        enddate.sendKeys("01012024");
        // cancelbttn.click();
        timezone.click();
        timezonevalue.click();
        createbtn.click();
        createdevent.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        //sessionsuccessmsg.click();
// Enable VMS
        eventconfig.click();
        eventinfo.click();
        WebDriverWait wait44 = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element44 = wait44.until(ExpectedConditions.visibilityOf(editevent));
        editevent.click();
        WebDriverWait wait34 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element14 = wait34.until(ExpectedConditions.visibilityOf(typevalue));
        advancedconfig.click();
        WebDriverWait wait35 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element15 = wait35.until(ExpectedConditions.visibilityOf(vmstogglebttn));
        vmstogglebttn.click();
        saveeventediting.click();


    }
}

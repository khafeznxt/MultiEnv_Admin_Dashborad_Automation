package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DeleteEventPage extends BasePage {
    public DeleteEventPage(WebDriver driver) {
        super(driver);
    }

    // You should put here the event/s name/s and how many elements you want to delete [Note:Comment the element that you will not use ]
     @FindBy(xpath=  "//*[text() =\"Automated VMS Event\"]")
    protected WebElement createdevent1;
    @FindBy(xpath=  "//*[text() =\"Automation Event  2\"]")
    protected WebElement createdevent2;

    @FindBy(xpath=  "//*[text() =\"Automation Event  3\"]")
    protected WebElement createdevent3;

    @FindBy(xpath=  "//*[text() =\"Automation Event  4\"]")
    protected WebElement createdevent4;

    @FindBy(xpath=  "//*[text() =\"Automation Event  5\"]")
    protected WebElement createdevent5;

    @FindBy(xpath=  "//*[text() =\"Automation Event  6\"]")
    protected WebElement createdevent6;

    @FindBy(xpath=  "//*[text() =\"Automation Event  5\"]")
    protected WebElement createdevent7;

    @FindBy(xpath=  "//*[text() =\"Automation Event  4\"]")
    protected WebElement createdevent8;

    @FindBy(xpath=  "//*[text() =\"Automation Event  3\"]")
    protected WebElement createdevent9;

    @FindBy(xpath=  "//*[text() =\"Automation Event  2\"]")
    protected WebElement createdevent10;

    // the end of the event elements which could be deleted , you can add more events elements to be deleted
    @FindBy(xpath=  "//*[text() =\"Event Config\"]")
    protected WebElement eventconfig;

    @FindBy(xpath=  "//*[text() =\"Event Info\"]")
    protected WebElement eventinfo;

    @FindBy(xpath = "//*[text() =\"Edit\"]")
    protected WebElement edit;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/div/div[1]/div/button")
    protected WebElement threedots;

    @FindBy(xpath = "//*[text() =\"Delete\"]")
    protected WebElement deletebttn;

    @FindBy(id = "delete-input")
    protected WebElement deletetxt;

    @FindBy(css = "[label=\"Delete Forever\"]" )
    protected WebElement deleteforeverbttn;
    @FindBy(xpath=  "//*[@id=\"root\"]/div[2]/div/div/div[1]/button")
    protected WebElement sessionsuccessmsg;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/section")
    protected WebElement switcherpageheader;



    @Step
    public UnityLoginSTGPage DeleteBulkEvents(){
    List<WebElement> events = List.of(new WebElement[]{createdevent1});
      //  , createdevent2  , createdevent3,createdevent4,createdevent5 ,createdevent6, createdevent7  , createdevent8,createdevent9,createdevent10});
    for (WebElement element : events ){
       element.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element2 = wait2.until(ExpectedConditions.visibilityOf(eventconfig));
        eventconfig.click();
        eventinfo.click();
        edit.click();
        threedots.click();
        deletebttn.click();
        deletetxt.sendKeys("delete-event-permanently");
        deleteforeverbttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement element1 = wait.until(ExpectedConditions.visibilityOf(switcherpageheader));


}

        return new UnityLoginSTGPage(driver);
    }
    @Step
    public void DeleteEvent(){
        createdevent1.click();
        eventconfig.click();
        eventinfo.click();
        edit.click();
        threedots.click();
        deletebttn.click();
        deletetxt.sendKeys("delete-event-permanently");
        deleteforeverbttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        //sessionsuccessmsg.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(switcherpageheader));


    }
}
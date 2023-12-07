package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DeleteEventPage extends BasePage {
    public DeleteEventPage(WebDriver driver) {
        super(driver);
    }

    // You should put here the event/s name/s and how many elements you want to delete [Note:Comment the element that you will not use ]
     @FindBy(xpath=  "//*[text() =\"Automation Event  10\"]")
    protected WebElement createdevent1;
    @FindBy(xpath=  "//*[text() =\"Automation Event  9\"]")
    protected WebElement createdevent2;

    @FindBy(xpath=  "//*[text() =\"Automation Event  8\"]")
    protected WebElement createdevent3;

    @FindBy(xpath=  "//*[text() =\"Automation Event  7\"]")
    protected WebElement createdevent4;

    @FindBy(xpath=  "//*[text() =\"Automation Event  6\"]")
    protected WebElement createdevent5;

    @FindBy(xpath=  "//*[text() =\"Automation Event  5\"]")
    protected WebElement createdevent6;

    @FindBy(xpath=  "//*[text() =\"Automation Event  4\"]")
    protected WebElement createdevent7;

    @FindBy(xpath=  "//*[text() =\"Automation Event  3\"]")
    protected WebElement createdevent8;

    @FindBy(xpath=  "//*[text() =\"Automation Event  2\"]")
    protected WebElement createdevent9;

    @FindBy(xpath=  "//*[text() =\"Automation Event  1\"]")
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

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/div/div[1]/ul/div/button")
    protected WebElement deletebttn;

    @FindBy(id = "delete-input")
    protected WebElement deletetxt;

    @FindBy(css = "[label=\"Delete Forever\"]" )
    protected WebElement deleteforeverbttn;




    public LoginPage DeleteEvent(){
List<WebElement> events = List.of(new WebElement[]{createdevent1, createdevent2  , createdevent3,createdevent4,createdevent5 , createdevent6 });
        //, createdevent7  , createdevent8,createdevent9,createdevent10});
for (WebElement element : events ){
       element.click();
        eventconfig.click();
        eventinfo.click();
        edit.click();
        threedots.click();
        deletebttn.click();
        deletetxt.sendKeys("delete-event-permanently");
        deleteforeverbttn.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"col-1\"]/div")));


}

        return new LoginPage(driver);
    }
}
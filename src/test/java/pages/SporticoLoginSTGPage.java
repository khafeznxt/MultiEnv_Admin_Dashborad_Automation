package pages;

import Utls.BlinkConfigUtilsSTG;
import Utls.SporticoConfigUtilsSTG;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class SporticoLoginSTGPage extends BasePage {
    public SporticoLoginSTGPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "username")
    protected WebElement insertusername;
    @FindBy(id= "password")
    protected WebElement insertpassword;

    @FindBy (tagName = "button")
    //@FindBy(xpath ="//*[/html/body/div/div[1]/div[5]/main/div/div/form/div/div[2]/button]")
    protected WebElement submit;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div/div/form/div/div[3]/button")
    protected WebElement skipe;

    @FindBy(linkText = "New Event")

    protected WebElement createvent;
    @FindBy(xpath= "//*[@id=\"root\"]/div[1]/div[5]/main/div/div[2]/div[3]")
    protected WebElement setuplater;

    //@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[1]/aside/div/main/div[4]/div[1]/div")
    @FindBy(xpath=  "//*[text() =\"Planning\"]")
    protected WebElement planning;

    @FindBy(xpath=  "//*[text() =\"Venues\"]")
    protected WebElement venues;

    @FindBy(xpath=  "//*[text() =\"Add Venue\"]")
    protected WebElement addvenue;

    @FindBy(name = "Venue Type")
    protected WebElement venuetype;


    @FindBy(xpath = "//*[@id=\"1\"]")
    protected WebElement venuetypevalue;

    @FindBy(xpath = "//*[@id=\"Name\"]")
    protected WebElement venuename;

    @FindBy(xpath = "//*[@id=\"Capacity\"]")
    protected WebElement venuecapacity;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div/div[5]/div/div[2]/div/button/div")
    protected WebElement locationsection;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div/div[5]/div/div[2]/div/div/div[1]/input")
    protected WebElement location;

    @FindBy(xpath = "//*[@id=\"place_list\"]/li[1]")
    protected WebElement placelist;

    @FindBy(xpath = "//*[@id=\"place_stack\"]/div[1]")
    protected WebElement chooseplace;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/button")
    protected WebElement createbttn;

    public SporticoLoginSTGPage loadSporticoSTG() {
        driver.get(SporticoConfigUtilsSTG.getInstance().BaseUrl());
        return this;
    }

    public void login(String username, String password) {
        insertusername.sendKeys(username);
        insertpassword.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        submit.click();
        skipe.click();


        // create setup later event

        // Create Event From Scratch

        /*createvent.click();
        setuplater.click();
        planning.click();
        venues.click();
        addvenue.click();
        venuetype.click();
        venuetypevalue.click();
        venuename.sendKeys("El Tetch Stadium");
        venuecapacity.sendKeys("1000");
        locationsection.click();
        location.sendKeys("Pyramids Gardens, Al Haram, Egypt");
        placelist.click();
        chooseplace.click();
        createbttn.click();



        //return new TodoPage(driver);*/
    }
}


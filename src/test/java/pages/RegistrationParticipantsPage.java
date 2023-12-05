package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationParticipantsPage extends BasePage {
    public RegistrationParticipantsPage(WebDriver driver) {
        super(driver);
    }

    // Create Group Elements
    @FindBy(xpath=  "//*[text() =\"Registration\"]")
    protected WebElement registration;

    @FindBy(xpath=  "//*[text() =\"Participants\"]")
    protected WebElement participants;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[3]/button/div/span")
    protected WebElement creatgroupbttn;
    @FindBy(xpath=  "//*[text() =\"karimevent_8\"]")
    protected WebElement createdevent;

    @FindBy(id=  "groupName")
    protected WebElement groupname;

    @FindBy(xpath =  "//*[@id=\"portal\"]/div/div[3]/div/button[2]")
    protected WebElement savebttn;

    @FindBy(xpath=  "//*[text() =\"KarimGroup253\"]")
    protected WebElement createdgroup;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[3]/a/div")
    protected WebElement adduserbttn;

    // Add User Elements
    @FindBy(id = "firstName")
    protected WebElement fname;

    @FindBy(id = "lastName")
    protected WebElement lname;

    @FindBy(id = "email")
    protected WebElement email;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div/div[2]/button")
    protected WebElement createuserbttn;

    // Package Elements
    @FindBy(xpath=  "//*[text() =\"Event Config\"]")
    protected WebElement eventconfig;

    @FindBy(xpath=  "//*[text() =\"Packages\"]")
    protected WebElement packages;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")
    protected WebElement newpackagebttn;

    @FindBy(id=  "package_title")
    protected WebElement packagetitle;

    @FindBy(id=  "package_priority")
    protected WebElement packagepriority;


    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/aside[2]/div/form/div[2]/div/button[2]")
    protected WebElement savepackagebttn;

    // Create Ticket Elements
    @FindBy(xpath=  "//*[text() =\"Ticket Type\"]")
    protected WebElement tickettype;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")
    protected WebElement addticketbttn;

    @FindBy(id=  "name")
    protected WebElement ticketname;

    @FindBy(id=  "selected_packages")
    protected WebElement packagesdropdown;


    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/button")
    protected WebElement selectpackage;
    @FindBy (xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/button")
    protected WebElement createticketbttn;

    // create Venue Elements

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

    //Create Session Elements

    @FindBy(xpath=  "//*[text() =\"Sessions\"]")
    protected WebElement sessions;


    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div/a")
    protected WebElement addsessionbttn;

    @FindBy(id = "event_title")
    protected  WebElement sessiontitle;


    @FindBy(id = "session_attire")
    protected  WebElement sessionattire;

    @FindBy(id = "event_date")
    protected  WebElement sessiondate;

    @FindBy(id = "event_from")
    protected  WebElement sessionfrom;


    @FindBy(id = "event_till")
    protected  WebElement sessiontill;

    //*[@id="root"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[8]/div[2]/select


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[8]/div[2]/select")
    protected  WebElement sessiontype;

    @FindBy(id = "1")
    protected  WebElement sessiontypevalue;



    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[10]/div[2]/div/div/button")
    protected  WebElement venue;



    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[10]/div[2]/div/ul/ul/li")
    protected  WebElement sessionvenuetype;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div/div/div[2]/button")
    protected  WebElement sessioncreatebttn;

    @FindBy(xpath=  "//*[text() =\"Ksession9\"]")
    protected WebElement newsession;

    //Add Ticket to Session


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[1]/ul/li[2]/strong[4]/div")
    protected  WebElement tickets;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[2]/div/div[2]/button/p")
    protected  WebElement sessionaddticket;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[2]/div[2]/input")
    protected  WebElement ticketquantity;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[6]/div[2]/select")
    protected  WebElement sessiontickettype;

    @FindBy(id = "NOT_SELECTED")
    protected WebElement sessiontickettypevalue;



    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[2]/div/button[2]")
    protected  WebElement savenewticketbttn;

    // Create Activity Elements

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


    public void CreateGroup() {
        createdevent.click();
    registration.click();
    participants.click();
    creatgroupbttn.click();
    groupname.sendKeys("KarimGroup253");
    savebttn.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       //WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div[1]")));
        //driver.navigate().refresh();
        createdgroup.click();
    adduserbttn.click();


    }

    public void CreateUser(){

        fname.sendKeys("AutoTestZY");
        lname.sendKeys("User");
        email.sendKeys("auto@101autotestZY.com");
        createuserbttn.click();
    }
    public void CreatePackage(){
    eventconfig.click();
    packages.click();
    newpackagebttn.click();
    packagetitle.sendKeys("KPackage33");
    packagepriority.sendKeys("33");
    savepackagebttn.click();


    }
    public void CreateTicketType(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() =\"Event Config\"]")));
        //driver.navigate().refresh();
        driver.navigate().to("https://dev-admin.blink.global/tickets/p/1");
        WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element2 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")));
        //eventconfig.click();
        //tickettype.click();
        addticketbttn.click();
        ticketname.sendKeys("KType6");
        packagesdropdown.click();
        selectpackage.click();
        createticketbttn.click();

    }

    public void CreateVenue(){
        driver.navigate().to("https://dev-admin.blink.global/venues/p/1");

        //createdevent.click();

       // planning.click();
       // venues.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element3 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() =\"Add Venue\"]")));

        addvenue.click();
        venuetype.click();
        venuetypevalue.click();
        venuename.sendKeys("KVenue14");
        venuecapacity.sendKeys("14");
        locationsection.click();
        //location.sendKeys("Pyramids Gardens, Al Haram, Egypt");
        //placelist.click();
       // chooseplace.click();
        createbttn.click();


    }
    public void CreateSession(){

        //createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
        //WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement element3 = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() =\"Planning\"]")));
        //driver.navigate().refresh();
        driver.navigate().to("https://dev-admin.blink.global/sessions/p/1");

        //planning.click();
        //sessions.click();
       addsessionbttn.click();
       sessiontitle.sendKeys("Ksession9");
       sessionattire.sendKeys("formal");
       sessiondate.sendKeys("12/05/2023");
       sessionfrom.sendKeys("10:00 AM");
       sessiontill.sendKeys("10:00 PM");
       sessiontype.click();
       sessiontypevalue.click();
       venue.click();
       sessionvenuetype.click();
       sessioncreatebttn.click();
       newsession.click();

    }

    public void CreateNewTicketInsideSession (){
        /*  createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
        planning.click();      // to test separated , Comment if this test will be a part of the whole test
        sessions.click();       // to test separated , Comment if this test will be a part of the whole test
        newsession.click();  */      // to test separated , Comment if this test will be a part of the whole test
        driver.navigate().to("https://dev-admin.blink.global/sessions/41?tab=Tickets");
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[1]/ul/li[2]/strong[4]/div")));

        //tickets.click();
        sessionaddticket.click();
        ticketquantity.sendKeys("10");
        sessiontickettype.click();
        sessiontickettypevalue.click();
        savenewticketbttn.click();

    }

    public void CreateActivityForAnEvent(){

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


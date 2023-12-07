package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

    @FindBy(id = "create-group")
    protected WebElement creatgroupbttn;
    @FindBy(xpath=  "//*[text() =\"Automation Event  12\"]")
    protected WebElement createdevent;

    @FindBy(id=  "groupName")
    protected WebElement groupname;

    @FindBy(xpath =  "//*[@id=\"portal\"]/div/div[3]/div/button[2]")
    protected WebElement savebttn;

    @FindBy(xpath=  "//*[text() =\"AutoGroup 42\"]")
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
    protected WebElement createvenuebttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[1]/div")
    protected WebElement allvenuepage;

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



    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[10]/div[2]/div/ul/ul/li[1]")


    protected  WebElement sessionvenuetype;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div/div/div[2]/button")
    protected  WebElement sessioncreatebttn;

    @FindBy(xpath=  "//*[text() =\"AutoSession 5\"]")
    protected WebElement newsession;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[2]/div/div/div[1]/button")
    protected WebElement sessionsuccessmsg;

    //Add Ticket to Session


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[1]/ul/li[2]")

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


    // Create Room Type
    @FindBy(id = "accommodation" )
    protected WebElement accomodation;

    @FindBy(xpath=  "//*[text() =\"Room Type\"]")
    protected WebElement roomtype;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div/a")
    protected WebElement addnewroomtypebttn;

    @FindBy(id = "name")
    protected WebElement roomname;

    @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div/div[2]")
    protected WebElement createroomtypebttn;





    public void CreateGroup() {
    createdevent.click();
    registration.click();
    participants.click();
    creatgroupbttn.click();
    groupname.sendKeys("AutoGroup 42");
    savebttn.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       //WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div[1]")));
        //driver.navigate().refresh();
        createdgroup.click();
    adduserbttn.click();


    }

    public void CreateUser(){

        fname.sendKeys("AutoUser BQSS");
        lname.sendKeys("User");
        email.sendKeys("auto@101AutoUserBss.com");
        createuserbttn.click();
    }
    public void CreatePackage(){
        //createdevent.click();
    eventconfig.click();
    packages.click();
    newpackagebttn.click();
    packagetitle.sendKeys("AutoPackage 37");
    packagepriority.sendKeys("37");
    savepackagebttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
    sessionsuccessmsg.click();
   // driver.navigate().refresh();


    }
    public void CreateTicketType(){

        //driver.navigate().refresh();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        /*WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
         Boolean element1 = wait7.until(ExpectedConditions.invisibilityOf(packages));
        Assert.assertTrue(element1);*/
       // driver.navigate().to("https://dev-admin.blink.global/tickets/p/1");
       // WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement element2 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")));
        //eventconfig.click();
        tickettype.click();
        addticketbttn.click();
        ticketname.sendKeys("AutoTicketType18");
        packagesdropdown.click();
        selectpackage.click();
        createticketbttn.click();
        driver.navigate().refresh();

    }

    public void CreateVenue(){
        //driver.navigate().to("https://dev-admin.blink.global/venues/p/1");

        //createdevent.click();
        //driver.navigate().refresh();
        //WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
       //WebElement element3 = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() =\"Planning\"]")));

        planning.click();
        planning.click();
        planning.click();
        venues.click();
        venues.isSelected();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element4 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() =\"Add Venue\"]")));

        addvenue.click();
        venuetype.click();
        venuetypevalue.click();
        venuename.sendKeys("AutoVenue 15");
        venuecapacity.sendKeys("15");
        createvenuebttn.click();
        sessionsuccessmsg.click();
        // driver.navigate().refresh();

        //WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement element9 = wait10.until(ExpectedConditions.elementToBeClickable( By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[1]/div")));

        // By SuccessMessageLocator = By.xpath("");

        //locationsection.click();
        //location.sendKeys("Pyramids Gardens, Al Haram, Egypt");
        //placelist.click();
       // chooseplace.click();



    }
    public void CreateSession(){

        //createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
        WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element3 = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() =\"Planning\"]")));
        //driver.navigate().refresh();
        //driver.navigate().to("https://dev-admin.blink.global/sessions/p/1");

       // planning.click();
        sessions.click();
       addsessionbttn.click();
       sessiontitle.sendKeys("AutoSession 5");
       sessionattire.sendKeys("formal");
       sessiondate.sendKeys("12/05/2023");
       sessionfrom.sendKeys("10:00 AM");
       sessiontill.sendKeys("10:00 PM");
       sessiontype.click();
       sessiontypevalue.click();
       venue.click();
       sessionvenuetype.click();
       sessioncreatebttn.click();
       sessionsuccessmsg.click();
        //driver.navigate().refresh();
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element7 = wait12.until(ExpectedConditions.visibilityOf(newsession));

       newsession.click();

    }

    public void CreateNewTicketInsideSession (){
        // createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
       /* planning.click();      // to test separated , Comment if this test will be a part of the whole test
        sessions.click();       // to test separated , Comment if this test will be a part of the whole test
        newsession.click();  */      // to test separated , Comment if this test will be a part of the whole test
        // driver.navigate().to("https://dev-admin.blink.global/sessions/41?tab=Tickets");
         WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(tickets));
        //planning.click();
        //sessions.click();
        //newsession.click();
        tickets.click();
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
        activitytitle.sendKeys("AutoActivity 1");
        activityattire.sendKeys("formal");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", activityhtimezone);
        activityhtimezone.click();
        activitytimezonevalue.click();
        activitysavebutton.click();
    }

    public void CreateRoomType() {
        // Createdevent element should be comment if you test the full happy path scenario , not commented if you test the method separetly
        createdevent.click();
        accomodation.click();
        roomtype.click();
        addnewroomtypebttn.click();
        roomname.sendKeys("AutoRoom3");
        createroomtypebttn.click();
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element7 = wait12.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();



    }

    public void CreateStayAndRoom() {
        // Createdevent element should be comment if you test the full happy path scenario , not commented if you test the method separetly
       // createdevent.click();
        createdevent.click();



    }

}


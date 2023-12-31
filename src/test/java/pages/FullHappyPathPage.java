package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FullHappyPathPage extends BasePage {
    public FullHappyPathPage(WebDriver driver) {
        super(driver);
    }

    // Create Group Elements
    @FindBy(xpath = "//*[text() =\"Registration\"]")
    protected WebElement registration;

    @FindBy(xpath = "//*[text() =\"Participants\"]")
    protected WebElement participants;

    @FindBy(id = "create-group")
    protected WebElement creatgroupbttn;
    @FindBy(xpath = "//*[text() =\"Automated VMS Event\"]")
    protected WebElement createdevent;

    @FindBy(id = "groupName")
    protected WebElement groupname;

    @FindBy(xpath = "//*[@id=\"portal\"]/div/div[3]/div/button[2]")
    protected WebElement savebttn;

    @FindBy(xpath = "//*[text() =\"AutoGroup 66\"]")
    protected WebElement createdgroup;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[3]/a/div")
    protected WebElement adduserbttn;

    // Add User Elements

    File file = new File("./vms.png");

    @FindBy(id = "Add-user")
    protected WebElement adduserbttnoutgroup;

    @FindBy(id = "firstName")
    protected WebElement fname;

    @FindBy(id = "lastName")
    protected WebElement lname;

    @FindBy(id = "title")
    protected WebElement title;

    @FindBy(id = "organization")
    protected WebElement organization;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div[1]/div/div/div[5]/div[2]/div[2]/div/input")
    protected WebElement phonenumber;

    @FindBy(id = "email")
    protected WebElement email;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div[1]/div/div/div[1]/div/button")
    protected WebElement uploadphoto;

    @FindBy(xpath = "//*[@id=\"portal\"]/div/div/div/div/div/div/div/span")
    protected WebElement uploadbttn;


    @FindBy(xpath = "//*[text() =\"Accept\"]")
    protected WebElement acceptuploadbttn;


    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createuserbttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[1]/ul/li[1]")
    protected WebElement guestdetailbutton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div[2]/div[1]/table/tbody")

    protected WebElement edituser;
    @FindBy(id = "more-buttons")
    protected WebElement usermorebttn;

    @FindBy(xpath = "//*[text() =\"Delete\"]")
    protected WebElement deleteuser;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[2]/div[1]/ul/div/button")
    protected WebElement confirmdeleteuser;

    @FindBy(xpath = "//*[@id=\"portal\"]/div")
    protected WebElement deletecontainer;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[1]")
    protected WebElement userdetailsheader;

    // Package Elements
    @FindBy(xpath = "//*[text() =\"Event Config\"]")
    protected WebElement eventconfig;

    @FindBy(xpath = "//*[text() =\"Packages\"]")
    protected WebElement packages;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")
    protected WebElement newpackagebttn;

    @FindBy(id = "package_title")
    protected WebElement packagetitle;

    @FindBy(id = "package_priority")
    protected WebElement packagepriority;


    @FindBy(xpath = "//*[text() =\"Save\"]")
    protected WebElement savepackagebttn;

    // Create Ticket Elements
    @FindBy(xpath = "//*[text() =\"Ticket Type\"]")
    protected WebElement tickettype;

    @FindBy(xpath = "//*[text() =\"Ticket Types\"]")
    protected WebElement tickettypspage;

    @FindBy(xpath = "//*[text() =\"Add Ticket Type\"]")
    protected WebElement addticketbttn;

    @FindBy(id = "name")
    protected WebElement ticketname;

    @FindBy(id = "selected_packages")
    protected WebElement packagesdropdown;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div[2]/button")
    protected WebElement selectpackage;
    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createticketbttn;

    // create Venue Elements

    @FindBy(xpath = "//*[text() =\"Planning\"]")
    protected WebElement planning;

    @FindBy(xpath = "//*[text() =\"Venues\"]")
    protected WebElement venues;

    @FindBy(xpath = "//*[text() =\"Add Venue\"]")
    protected WebElement addvenue;

    @FindBy(xpath = "//*[text() =\"New Venue\"]")
    protected WebElement addnewvenuepage;

    @FindBy(name = "Venue Type")
    protected WebElement venuetype;

    @FindBy(xpath = "//*[text() =\"All Venues\"]")
    protected WebElement allvenuepage;


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

    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createvenuebttn;


    //Create Session Elements

    @FindBy(xpath = "//*[text() =\"Sessions\"]")
    protected WebElement sessions;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div/a")
    protected WebElement addsessionbttn;

    @FindBy(id = "event_title")
    protected WebElement sessiontitle;


    @FindBy(id = "session_attire")
    protected WebElement sessionattire;

    @FindBy(id = "event_date")
    protected WebElement sessiondate;

    @FindBy(id = "event_from")
    protected WebElement sessionfrom;


    @FindBy(id = "event_till")
    protected WebElement sessiontill;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[8]/div[2]/select")
    protected WebElement sessiontype;

    @FindBy(id = "1")
    protected WebElement sessiontypevalue;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[10]/div[2]/div/div/button")
    protected WebElement venue;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[10]/div[2]/div/ul/ul/li[1]")


    protected WebElement sessionvenuetype;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div/div/div[2]/button")
    protected WebElement sessioncreatebttn;

    @FindBy(xpath = "//*[text() =\"Automated VMS Session\"]")
    protected WebElement newsession;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[1]/button")
    protected WebElement sessionsuccessmsg;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    protected WebElement sessiondesc;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div/div/div[6]/div[2]/div[1]/div[1]/div[1]/button[4]")
    protected WebElement table;

    @FindBy(id = "menu-item_1264442797941702333143369")
    protected WebElement tableid;

    @FindBy(xpath = "//*[@id=\"form-field_53186328929141702332779854\"]")
    protected WebElement insiderow;
    @FindBy(xpath = "//*[text() =\"Save\"]")
    protected WebElement savelinkbttn;
    //Add Ticket to Session


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[1]/ul/li[2]")

    protected WebElement tickets;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div[2]/div/div[2]/button/p")
    protected WebElement sessionaddticket;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[2]/div[2]/input")
    protected WebElement ticketquantity;


    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[6]/div[2]/select")
    protected WebElement sessiontickettype;

    @FindBy(name = "ticket_number")
    protected WebElement ticketnumber;

    @FindBy(id = "NOT_SELECTED")
    protected WebElement sessiontickettypevalue;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[4]/div[2]/input")
    protected WebElement ticketid;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[5]/div[2]/input")
    protected WebElement seat;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[3]/section/div[7]/div[2]/input")
    protected WebElement gate;

    @FindBy(xpath = "//*[text() =\"Save\"]")
    protected WebElement savenewticketbttn;


    // Create Activity Elements

    @FindBy(xpath = "//*[text() =\"Content\"]")
    protected WebElement content;
    @FindBy(xpath = "//*[text() =\"Itinerary\"]")
    protected WebElement itinerary;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div/div[2]/div[2]/div[3]/div[97]/div")
    protected WebElement itinerarycalender;

    @FindBy(id = "activityTitle")
    protected WebElement activitytitle;

    @FindBy(id = "attire")
    protected WebElement activityattire;

    @FindBy(id = "activityDate")
    protected WebElement activitydate;

    @FindBy(id = "startTime")
    protected WebElement activitystarttime;

    @FindBy(id = "endTime")
    protected WebElement activityendtime;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/div/form/div[2]/section[2]/div[11]/div[2]/div[2]")
    protected WebElement activityhtimezone;


    @FindBy(css = "[value=\"(UTC+03:00) Doha\"]")
    protected WebElement activitytimezonevalue;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/div/form/div[2]/section[1]/div[2]/div/button[2]")
    protected WebElement activitysavebutton;


    // Create Room Type
    @FindBy(id = "accommodation")
    protected WebElement accomodation;

    @FindBy(xpath = "//*[text() =\"Room Type\"]")
    protected WebElement roomtype;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]/div/div/a")
    protected WebElement addnewroomtypebttn;

    @FindBy(id = "name")
    protected WebElement roomname;

    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createroomtypebttn;


    @FindBy(id = "packages")
    protected WebElement packagedropdown;

    //Create Stay and Add Room

    @FindBy(xpath = "//*[text() =\"Stay\"]")
    protected WebElement stay;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[1]/div/div[2]/button")
    protected WebElement createnewstaybttn;

    @FindBy(id = "name")
    protected WebElement stayname;

    @FindBy(id = "stars")
    protected WebElement stars;

    @FindBy(id = "1")
    protected WebElement starsvalue;

    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createstaybttn;

    // Add Room inside the stay

    @FindBy(xpath = "//*[text() =\"Add Room\"]")
    protected WebElement addnewroombttn;

    @FindBy(id = "amount")
    protected WebElement roomamount;

    @FindBy(id = "stay_id")
    protected WebElement staytype;
    @FindBy(id = "28")
    protected WebElement staytypvaluee;

    @FindBy(id = "room_type")
    protected WebElement stayroomtype;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div[1]/div/div[5]/div/div[3]/ul/li[1]")
    protected WebElement stayroomtypevalue;
    @FindBy(id = "room_capacity")
    protected WebElement roomcapacity;
    @FindBy(id = "2")
    protected WebElement roomcapacityvalue;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button[15]")
    protected WebElement roomavailabilitystart;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button[21]")
    protected WebElement roomavailabilityend;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section/div[2]/div/div/div[2]/button")
    protected WebElement createnewroombttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/form/section")
    protected WebElement addnewroomtopsection;

    //Add Trip to the Participant

    @FindBy(xpath = "//*[text() =\"Automated\"]")
    protected WebElement firstparticipant;


    @FindBy(xpath = "//*[@id=\"col-5\"]/div/button")
    protected WebElement editfstparticipant;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[1]/ul/li[2]")
    protected WebElement tripinfo;

    @FindBy(xpath = "//*[@id=\"col-4\"]/div/div/button")
    protected WebElement addtripbttn;

    @FindBy(id = "entity")
    protected WebElement trippackages;

    @FindBy(id = "278")   // this value related to the created package ,
    protected WebElement trippackagesvalue;

    // @FindBy(xpath=  "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div")
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div")
    protected WebElement tripcreatedsession;


    @FindBy(xpath = "//*[@id=\"portal\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/strong")

    protected WebElement assignticket;

    @FindBy(xpath = "//*[@id=\"portal\"]/div/div[2]/div[2]/div/div")
    protected WebElement assignguest;

    @FindBy(xpath = "//*[text() =\"Confirm\"]")
    protected WebElement assignticketconfirmbttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/section/div[2]/div/div[3]/button")
    protected WebElement confirmaddtripbttn;

    @FindBy(name = "gate")
    protected WebElement ticketgate;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/aside[2]/form/div[1]/div/div[1]/h1")
    protected WebElement newtickettitle;

    //Add Stay Elements
    @FindBy(xpath = "//*[text() =\"Add Stay\"]")
    protected WebElement addstaybttn;

    //Add Stay Elements

    @FindBy(xpath = "//*[text() =\"Continue\"]")
    protected WebElement staycontinuebttn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/button[15]")
    protected WebElement staystartdate;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/button[19]")
    protected WebElement stayendtdate;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[4]/button")
    protected WebElement firstbookbttn;

    @FindBy(id = "user")
    protected WebElement stayselectuser;


    @FindBy(xpath = "//*[text() =\"Book\"]")
    protected WebElement bookuserbttn;

    @FindBy(xpath = "//*[text() =\"Save\"]")
    protected WebElement savestaybttn;

    //Add Flight to Participant
    @FindBy(xpath = "//*[text() =\"Add Flight\"]")
    protected WebElement addflightbttn;
    @FindBy(id = "outbound_departure_date")
    protected WebElement departuredate;
    @FindBy(id = "outbound_arrival_date")
    protected WebElement arrivaldate;

    @FindBy(id = "outbound_departure_time")
    protected WebElement departuretime;
    @FindBy(id = "outbound_arrival_time")
    protected WebElement arrivaltime;

    @FindBy(id = "search_outbound_departure_airport_code")
    protected WebElement departurefrom;

    @FindBy(xpath = "//*[text() =\"Nadzab  Airport (LAE)\"]")
    protected WebElement departurefromvalue;


    @FindBy(id = "search_outbound_arrival_airport_code")
    protected WebElement arrivalto;

    @FindBy(xpath = "//*[text() =\"Ulukhaktok Holman  Airport (YHI)\"]")
    protected WebElement arrivaltovalue;


    @FindBy(id = "outbound_cabin")
    protected WebElement cabin;

    @FindBy(xpath = "//*[text() =\"Business\"]")
    protected WebElement cabinvalue;
    @FindBy(id = "outbound_flight_number")
    protected WebElement flightnumber;

    @FindBy(id = "outbound_flight_pnr")
    protected WebElement flightpnr;

    @FindBy(xpath = "//*[text() =\"Create\"]")
    protected WebElement createflightbttn;

    @Step
    public void CreateGroup() {
        //createdevent.click();
        //eventconfig.click();

        registration.click();
        participants.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(creatgroupbttn));
        creatgroupbttn.click();
        groupname.sendKeys("AutoGroup 66");
        savebttn.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/div/div[1]")));
        //driver.navigate().refresh();
      /*  WebDriverWait wait45 = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element45 = wait45.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
    sessionsuccessmsg.click();*/
        WebDriverWait wait46 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element46 = wait46.until(ExpectedConditions.elementToBeClickable(createdgroup));
        createdgroup.click();
        adduserbttn.click();


    }

    @Step
    public void CreateUser() throws AWTException {
        // createdevent.click();
        /*registration.click();
        participants.click();
        adduserbttnoutgroup.click();*/
        // the above actions for the separated test
        uploadphoto.click();
        uploadbttn.click();
        StringSelection stringSelection = new StringSelection("D:\\karim\\Automation Projects\\Blink_AutomationFrameWork\\files\\vms.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.delay(3000); // Introduce a delay for the file dialog to appear
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element14 = wait14.until(ExpectedConditions.visibilityOf(acceptuploadbttn));
        acceptuploadbttn.click();
        fname.sendKeys("Automated");
        lname.sendKeys("User");
        title.sendKeys("Mr");
        organization.sendKeys("blink");
        phonenumber.sendKeys("1010101010");
        email.sendKeys("vms.blink@gmail.com");
        createuserbttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        sessionsuccessmsg.click();
        WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element18 = wait18.until(ExpectedConditions.elementToBeClickable(guestdetailbutton));
    }

    @Step
    public void CreateUserWithoutphoto() throws AWTException {
        // createdevent.click();
        /*registration.click();
        participants.click();
        adduserbttnoutgroup.click();*/
        // the above actions for the separated test
       /* uploadphoto.click();
        uploadbttn.click();
        StringSelection stringSelection = new StringSelection("D:\\karim\\Automation Projects\\Blink_AutomationFrameWork\\files\\vms.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.delay(3000); // Introduce a delay for the file dialog to appear
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element14 = wait14.until(ExpectedConditions.visibilityOf(acceptuploadbttn));
        acceptuploadbttn.click();*/
        fname.sendKeys("Automated");
        lname.sendKeys("User");
        title.sendKeys("Mr");
        organization.sendKeys("blink");
        phonenumber.sendKeys("1010101010");
        email.sendKeys("vms.blink@gmail.com");
        createuserbttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        sessionsuccessmsg.click();
        WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element18 = wait18.until(ExpectedConditions.elementToBeClickable(guestdetailbutton));
    }


    @Step
    public void DeleteUser() {
        createdevent.click();
        registration.click();
        participants.click();
        createdgroup.click();
        // WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element18 = wait18.until(ExpectedConditions.visibilityOf(edituser));
        addtripbttn.click();
        WebDriverWait wait25 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element25 = wait25.until(ExpectedConditions.visibilityOf(userdetailsheader));
        usermorebttn.click();
        deleteuser.click();
        WebDriverWait wait26 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element26 = wait26.until(ExpectedConditions.visibilityOf(deletecontainer));
        deleteuser.click();
        WebDriverWait wait27 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element27 = wait27.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();


    }

    @Step
    public void CreatePackage() {
        //createdevent.click();
        eventconfig.click();
        packages.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait1.until(ExpectedConditions.elementToBeClickable(newpackagebttn));
        newpackagebttn.click();
        packagetitle.sendKeys("AutoPackage 2");
        packagepriority.sendKeys("3");
        savepackagebttn.click();
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element13 = wait13.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();
        // driver.navigate().refresh();


    }

    @Step
    public void CreateTicketType() {

        //driver.navigate().refresh();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        /*WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
         Boolean element1 = wait7.until(ExpectedConditions.invisibilityOf(packages));
        Assert.assertTrue(element1);*/
        // driver.navigate().to("https://dev-admin.blink.global/tickets/p/1");
        // WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement element2 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[2]")));
        //eventconfig.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element4 = wait1.until(ExpectedConditions.elementToBeClickable(tickettype));
        tickettype.click();

        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element14 = wait11.until(ExpectedConditions.elementToBeClickable(addticketbttn));
        addticketbttn.click();
        ticketname.sendKeys("VMSType");
        //packagesdropdown.click();
        //selectpackage.click();
        WebDriverWait wait30 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element30 = wait30.until(ExpectedConditions.elementToBeClickable(createticketbttn));
        createticketbttn.click();
        WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element18 = wait18.until(ExpectedConditions.visibilityOf(tickettypspage));
        WebDriverWait wait31 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element31 = wait31.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        sessionsuccessmsg.click();
        WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element17 = wait17.until(ExpectedConditions.elementToBeClickable(eventconfig));
        eventconfig.click();

    }

    @Step
    public void CreateVenue() {
        //driver.navigate().to("https://dev-admin.blink.global/venues/p/1");

        //createdevent.click();
        //driver.navigate().refresh();
        //WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element3 = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() =\"Planning\"]")));
        //sessionsuccessmsg.click();
        //sessionsuccessmsg.isSelected();
       /* WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element22 = wait22.until(ExpectedConditions.visibilityOf(eventconfig));
        eventconfig.click();*/
        //driver.navigate().refresh();
        WebDriverWait wait23 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element23 = wait23.until(ExpectedConditions.visibilityOf(planning));
        planning.click();
        WebDriverWait wait28 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element28 = wait28.until(ExpectedConditions.elementToBeClickable(venues));
        venues.click();
        //venues.isSelected();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait1.until(ExpectedConditions.elementToBeClickable(addvenue));
        addvenue.click();
       /* WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean element14 = wait14.until(ExpectedConditions.invisibilityOf(allvenuepage));
        Assert.assertTrue(element14);*/
        venuetype.click();
        venuetypevalue.click();
        venuename.sendKeys("Automated VMS venue");
        venuecapacity.sendKeys("15");
        createvenuebttn.click();
        WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement element22 = wait22.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();
        /*WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean element15 = wait15.until(ExpectedConditions.invisibilityOf(addnewvenuepage));
        Assert.assertTrue(element15);*/
        //driver.navigate().refresh();

        //WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement element9 = wait10.until(ExpectedConditions.elementToBeClickable( By.xpath("//*[@id=\"root\"]/div[1]/div[5]/main/div[2]/section/div[1]/div")));

        // By SuccessMessageLocator = By.xpath("");

        //locationsection.click();
        //location.sendKeys("Pyramids Gardens, Al Haram, Egypt");
        //placelist.click();
        // chooseplace.click();


    }

    @Step
    public void CreateSession() {

        //createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
        WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element3 = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() =\"Sessions\"]")));
        //driver.navigate().refresh();
        // planning.click();
        sessions.click();
        addsessionbttn.click();
        sessiontitle.sendKeys("Automated VMS Session");
        sessionattire.sendKeys("formal");
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        // Format the current date to a string
        String formattedDate = currentDate.format(formatter);
        sessiondate.sendKeys(formattedDate);
        sessionfrom.sendKeys("10:00 AM");
        sessiontill.sendKeys("10:00 PM");
        sessiontill.click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView();", sessiondesc);
        driver.switchTo().frame("event_description_ifr");
        sessiondesc.sendKeys("Testing If VMS works");
        driver.switchTo().defaultContent();
        sessiontype.click();
        sessiontypevalue.click();
        venue.click();
        sessionvenuetype.click();
        sessioncreatebttn.click();
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element7 = wait12.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        sessionsuccessmsg.click();
        //driver.navigate().refresh();
        newsession.click();

    }


    @Step
    public void CreateNewTicketInsideSession() {
        /*createdevent.click();  // to test separated , Comment if this test will be a part of the whole test
       planning.click();      // to test separated , Comment if this test will be a part of the whole test
        sessions.click();       // to test separated , Comment if this test will be a part of the whole test
        newsession.click();*/      // to test separated , Comment if this test will be a part of the whole test
        //planning.click();
        //sessions.click();
        //newsession.click();
        //sessionsuccessmsg.isSelected();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(tickets));
        //planning.click();
        tickets.click();
        sessionaddticket.click();
        ticketnumber.sendKeys("10");
        ticketid.sendKeys("11");
        seat.sendKeys("12");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", gate);
        gate.sendKeys("1");
        WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element14 = wait14.until(ExpectedConditions.elementToBeClickable(savenewticketbttn));
        // ticketquantity.sendKeys("10");
        //sessiontickettype.click();
        //sessiontickettypevalue.click();
        //WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //  Boolean element22 = wait12.until(ExpectedConditions.attributeToBeNotEmpty(ticketnumber , "name"));
        // Assert.assertTrue(element22);
        //WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(30));
        //WebElement element7 = wait13.until(ExpectedConditions.visibilityOf(savenewticketbttn));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", savenewticketbttn);

        savenewticketbttn.click();
        WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element20 = wait20.until(ExpectedConditions.elementToBeClickable(sessionsuccessmsg));
        sessionsuccessmsg.click();

    }

    @Step

    public void CreateActivityForAnEvent() {

        content.click();
        itinerary.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(itinerarycalender));
        itinerarycalender.click();
        activitytitle.sendKeys("AutoActivity 1");
        activityattire.sendKeys("formal");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", activityhtimezone);
        activityhtimezone.click();
        activitytimezonevalue.click();
        activitysavebutton.click();
        WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element9 = wait16.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();
    }

    @Step
    public void CreateRoomType() {
        // Createdevent element should be comment if you test the full happy path scenario , not commented if you test the method separetly
        //createdevent.click();
        accomodation.click();
        WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element17 = wait16.until(ExpectedConditions.visibilityOf(roomtype));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", roomtype);
        roomtype.click();
        WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element7 = wait15.until(ExpectedConditions.visibilityOf(addnewroomtypebttn));
        addnewroomtypebttn.click();
        roomname.sendKeys("AutoRoom4");
        WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element20 = wait20.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() =\"Create\"]")));

        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element22 = wait13.until(ExpectedConditions.elementToBeClickable(createroomtypebttn));
        createroomtypebttn.click();
        //createroomtypebttn.isSelected();
        WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element19 = wait19.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();


    }

    @Step

    public void CreateStayAndAddRoom() {
        //createdevent.click();
        //accomodation.click();
        // above 2 elements should be comment if you test the full happy path scenario , not commented if you test the method separetly
        stay.click();
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element7 = wait12.until(ExpectedConditions.visibilityOf(createnewstaybttn));
        createnewstaybttn.click();
        stayname.sendKeys("Auto VMS Stay");
        stars.click();
        starsvalue.click();
        createstaybttn.click();

        sessionsuccessmsg.click();

        // Add room inside the stay actions
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element8 = wait13.until(ExpectedConditions.visibilityOf(addnewroomtypebttn));
        addnewroombttn.click();
        roomamount.sendKeys("10");
        stayroomtype.click();
        stayroomtypevalue.click();
        WebElement element9 = wait13.until(ExpectedConditions.visibilityOf(roomcapacity));
        //roomcapacity.click();
        //roomcapacityvalue.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addnewroomtopsection);
        roomavailabilitystart.click();
        roomavailabilityend.click();
        WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element14 = wait14.until(ExpectedConditions.visibilityOf(createnewroombttn));
        createnewroombttn.click();

    }

    @Step

    public void AddTripToTheParticipant() {
        createdevent.click();
        registration.click();
        participants.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(creatgroupbttn));
        createdgroup.click();
        //firstparticipant.click();
        //tripinfo.click();
        addtripbttn.click();
        trippackages.click();
        //trippackagesvalue.click();
        tripcreatedsession.click();
        assignticket.click();
        assignticket.isSelected();
        //WebDriverWait wait22 = new WebDriverWait(driver,Duration.ofSeconds(30));
        //WebElement element22 = wait22.until(ExpectedConditions.ele(assignticket));

        assignguest.click();
        assignguest.isSelected();
        WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element21 = wait21.until(ExpectedConditions.visibilityOf(assignticketconfirmbttn));
        assignticketconfirmbttn.click();

        confirmaddtripbttn.click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();


    }

    @Step
    public void AddStayToParticipant() {
        // The start for the separated test
        // to test this case separetly
        /*createdevent.click();
        WebDriverWait wait18 = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element18 = wait18.until(ExpectedConditions.visibilityOf(registration));
        registration.click();
        participants.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(creatgroupbttn));
        createdgroup.click();*/
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(firstparticipant));
        firstparticipant.click();
       /* WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean element4 = wait4.until(ExpectedConditions.elementToBeSelected(firstparticipant));
        Assert.assertTrue(element4);*/
        tripinfo.click();
        addstaybttn.click();
        staystartdate.click();
        stayendtdate.click();
        staycontinuebttn.click();
        firstbookbttn.click();
        stayselectuser.click();
        bookuserbttn.click();
        savestaybttn.click();
        /*WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(sessionsuccessmsg));
        sessionsuccessmsg.click();*/


        //firstparticipant.click();
        //tripinfo.click();
        //editfstparticipant.click();
        // the end of separated Test

        /*WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element4 = wait4.until(ExpectedConditions.visibilityOf(addtripbttn));
        addtripbttn.click();*/
        //addstsybttn.click();


    }

    @Step
    public void AddFlightToParticipant() {
        // The start for the separated test
        // to test this case separetly
        /*createdevent.click();
        WebDriverWait wait18 = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element18 = wait18.until(ExpectedConditions.visibilityOf(registration));
        registration.click();
        participants.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(creatgroupbttn));
        createdgroup.click();
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(firstparticipant));
        firstparticipant.click();
        tripinfo.click();*/

        addflightbttn.click();
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        // Format the current date to a string
        String formattedDate = currentDate.format(formatter);
        departuredate.sendKeys(formattedDate);
        arrivaldate.sendKeys(formattedDate);
        departuretime.sendKeys("1111AM");
        arrivaltime.sendKeys("1114PM");
        departurefrom.sendKeys("Nadzab");
        departurefromvalue.click();
        arrivalto.sendKeys("Ulukhaktok");
        arrivaltovalue.click();
        cabin.click();
        cabinvalue.click();
        flightnumber.sendKeys("123");
        flightpnr.sendKeys("123");
        createflightbttn.click();






    }
}


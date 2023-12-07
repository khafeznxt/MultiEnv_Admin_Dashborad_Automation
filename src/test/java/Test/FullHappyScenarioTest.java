package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FromScratchEventPage;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

import java.time.Duration;

@Test(priority = 1)
public class FullHappyScenarioTest extends BaseTest {
private WebDriver driver;

    @Test(description = "Create Event From Scratch Test")
public void ShouldBeAbleToCreateFromScratchEvent (){

    FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
    fromScratchEventPage.load();

    LoginPage loginPage = new LoginPage(getDriver());
    loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

    fromScratchEventPage.CreateEventFromScratch();
}
/* @Test(description = "Create Group and Add User")
    public void ShouldBeAbleToCreatePackage (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        // fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
     registrationParticipantsPage.CreateGroup();
     registrationParticipantsPage.CreateUser();

    }

    @Test(description = "Create PackageAndTicket")
    public void ShouldBeAbleToCreatePackageAndTicket (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        // fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreatePackage();
        registrationParticipantsPage.CreateTicketType();



    }

    @Test(description = "Create Venue")
    public void ShouldBeAbleToCreateVenue (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        // fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateVenue();

    }*/


    @Test(description = "Create Group , Add User and Package")
    public void ShouldBeAbleToExecuteFullHappyPathScenario (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        // remove the comment to create new event for the full happypath scenario
        fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateGroup();
        registrationParticipantsPage.CreateUser();
        registrationParticipantsPage.CreatePackage();
        registrationParticipantsPage.CreateTicketType();
        registrationParticipantsPage.CreateVenue();
        registrationParticipantsPage.CreateSession();
        registrationParticipantsPage.CreateNewTicketInsideSession();
        registrationParticipantsPage.CreateActivityForAnEvent();
        registrationParticipantsPage.CreateRoomType();
        registrationParticipantsPage.CreateStayAndAddRoom();

    }

    /* @Test(description = "Create Group and Add User")
    public void ShouldBeAbleToCreatePackage (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        // fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreatePackage();

    }*/


}

package Test;

import Utls.ConfigUtilsProd;
import Utls.ConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FromScratchEventPage;
import pages.LoginProductionPage;
import pages.RegistrationParticipantsPage;

import java.awt.*;

@Test(priority = 1)
public class ProdFullHappyScenarioTest extends BaseTest {
private WebDriver driver;

    @Test(enabled = false)


    //@Test(description = "Create Event From Scratch Test")
public void ShouldBeAbleToCreateFromScratchEvent (){

    FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
    fromScratchEventPage.load();

    LoginProductionPage loginProductionPage = new LoginProductionPage(getDriver());
    loginProductionPage.loadProd().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

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

    @Feature("Full VMS Scenario _ Unity ")
    @Test(description = "Full VMS Scenario _ Unity ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.loadprod();

        LoginProductionPage loginProductionPage = new LoginProductionPage(getDriver());
        loginProductionPage.loadProd().login(ConfigUtilsProd.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

        // remove the comment to create new event for the full happypath scenario
        fromScratchEventPage.CreateEventFromScratch();

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateGroup();
        registrationParticipantsPage.CreateUser();
       //registrationParticipantsPage.CreatePackage();
        //registrationParticipantsPage.CreateTicketType();
        registrationParticipantsPage.CreateVenue();
        registrationParticipantsPage.CreateSession();
        registrationParticipantsPage.CreateNewTicketInsideSession();
       /* registrationParticipantsPage.CreateActivityForAnEvent();
        registrationParticipantsPage.CreateRoomType();
        registrationParticipantsPage.CreateStayAndAddRoom();*/
        registrationParticipantsPage.AddTripToTheParticipant();
        //DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        //deleteEventPage.DeleteEvent();


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

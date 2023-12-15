package TestScenarios;

import Utls.BlinkConfigUtilsDEV;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;

@Test(priority = 1)
public class BlinkDEVFullHappyScenarioTest extends BaseTest {
private WebDriver driver;

   /* @Test(enabled = false)


    //@Test(description = "Create Event From Scratch Test")
public void ShouldBeAbleToCreateFromScratchEvent (){

    FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
    fromScratchEventPage.load();

    UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
    unityLoginSTGPage.load().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

    fromScratchEventPage.CreateEventFromScratch();
}*/
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

    @Feature("Full Scenario on Blink DEV Environment ")
    @Test(description = "Full Scenario on Blink DEV Environment")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        //fromScratchEventPage.loadBlinkDev();

        BlinkLoginDEVPage blinkLoginDEVPage = new BlinkLoginDEVPage(getDriver());
        blinkLoginDEVPage.loadBlinkDev().login(BlinkConfigUtilsDEV.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        // remove the comment to create new event for the full happypath scenario
        fromScratchEventPage.CreateEventFromScratch();
        //fromScratchEventPage.EnableVms();
        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.CreateGroup();
        fullHappyPathPage.CreateUser();
       fullHappyPathPage.CreatePackage();
        fullHappyPathPage.CreateTicketType();
        fullHappyPathPage.CreateVenue();
        fullHappyPathPage.CreateSession();
        fullHappyPathPage.CreateNewTicketInsideSession();
        fullHappyPathPage.CreateActivityForAnEvent();
        fullHappyPathPage.CreateRoomType();
        fullHappyPathPage.CreateStayAndAddRoom();
        fullHappyPathPage.AddTripToTheParticipant();
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

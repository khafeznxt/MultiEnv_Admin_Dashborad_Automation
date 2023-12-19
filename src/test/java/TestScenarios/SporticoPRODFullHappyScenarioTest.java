package TestScenarios;

import Utls.BlinkConfigUtilsProd;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;

@Test(priority = 1)
public class SporticoPRODFullHappyScenarioTest extends BaseTest {
private WebDriver driver;
    @Feature("Full Scenario on Sportico PROD Environment  ")
    @Test(enabled = false)
    //@Test(description = "Full Scenario on Sportico PROD Environment ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        //fromScratchEventPage.load();

       SporticoLoginPRODPage sporticoLoginPRODPage = new SporticoLoginPRODPage(getDriver());
        sporticoLoginPRODPage.loadSporticoPROD().login(BlinkConfigUtilsProd.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        // remove the comment to create new event for the full happypath scenario
        fromScratchEventPage.CreateEventFromScratch();
        //fromScratchEventPage.EnableVms();
        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.CreateGroup();
        fullHappyPathPage.CreateUser();
       //registrationParticipantsPage.CreatePackage();
        //registrationParticipantsPage.CreateTicketType();
        fullHappyPathPage.CreateVenue();
        fullHappyPathPage.CreateSession();
        fullHappyPathPage.CreateNewTicketInsideSession();
       /* registrationParticipantsPage.CreateActivityForAnEvent();
        registrationParticipantsPage.CreateRoomType();
        registrationParticipantsPage.CreateStayAndAddRoom();*/
        fullHappyPathPage.AddTripToTheParticipant();
        fullHappyPathPage.AddFlightToParticipant();
        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();


    }
}

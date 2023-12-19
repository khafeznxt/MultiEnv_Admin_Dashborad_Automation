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
public class BlinkPRODFullHappyScenarioTest extends BaseTest {
private WebDriver driver;

    @Feature("Full Scenario on Blink PROD Environment  ")
    @Test(enabled = false)
    //@Test(description = "Full Scenario on Blink DEV Environment ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        BlinkLoginPRODPage blinkLoginPRODPage = new BlinkLoginPRODPage(getDriver());
        blinkLoginPRODPage.loadBlinkPROD().login(BlinkConfigUtilsProd.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

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

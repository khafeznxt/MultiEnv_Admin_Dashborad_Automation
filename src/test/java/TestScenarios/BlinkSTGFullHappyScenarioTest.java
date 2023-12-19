package TestScenarios;

import Utls.BlinkConfigUtilsSTG;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BlinkLoginSTGPage;
import pages.DeleteEventPage;
import pages.FromScratchEventPage;
import pages.FullHappyPathPage;

import java.awt.*;

@Test(priority = 1)
public class BlinkSTGFullHappyScenarioTest extends BaseTest {
private WebDriver driver;
    @Feature("Full Scenario on Blink STGEnvironment ")
    @Test(description = "Full Scenario on Blink STG Environment ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        // fromScratchEventPage.load();

        BlinkLoginSTGPage blinkLoginSTGPage = new BlinkLoginSTGPage(getDriver());
        blinkLoginSTGPage.loadBlinkSTG().login(BlinkConfigUtilsSTG.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

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
        fullHappyPathPage.AddFlightToParticipant();
        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();


    }
}

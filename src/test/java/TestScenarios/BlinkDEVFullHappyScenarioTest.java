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
    @Feature("Full Scenario on Blink DEV Environment ")
    @Test(description = "Full Scenario on Blink DEV Environment")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        //fromScratchEventPage.loadBlinkDev();

        BlinkLoginDEVPage blinkLoginDEVPage = new BlinkLoginDEVPage(getDriver());
        blinkLoginDEVPage.loadBlinkDev().login(BlinkConfigUtilsDEV.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        // remove the comment to create new event for the full happy path scenario
        fromScratchEventPage.CreateEventFromScratch();
        //VMS Addon only available for Unity Project
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
        fullHappyPathPage.AddStayToParticipant();
        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();


    }


}

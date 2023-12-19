package TestScenarios;

import Utls.SporticoConfigUtilsSTG;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;

@Test(priority = 1)
public class SporticoSTGFullHappyScenarioTest extends BaseTest {
private WebDriver driver;

    @Feature("Full Scenario on Sportico STG Environment ")
    @Test(description = "Full Scenario on Sportico STG Environment ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        // fromScratchEventPage.load();

        SporticoLoginSTGPage sporticoLoginSTGPage = new SporticoLoginSTGPage(getDriver());
        sporticoLoginSTGPage.loadSporticoSTG().login(SporticoConfigUtilsSTG.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

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

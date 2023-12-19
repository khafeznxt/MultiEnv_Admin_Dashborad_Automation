package TestScenarios;

import Utls.UnityConfigUtilsProd;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DeleteEventPage;
import pages.FromScratchEventPage;
import pages.UnityLoginProductionPage;
import pages.FullHappyPathPage;

import java.awt.*;

@Test(priority = 1)
public class UnityProdFullHappyScenarioTest extends BaseTest {
private WebDriver driver;

    @Feature("Full VMS Scenario _ Unity STG")
    @Test(enabled = false)
    //@Test(description = "Full VMS Scenario _ Unity ")
    public void ShouldBeAbleToExecuteFullHappyPathScenario () throws AWTException {

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.loadprod();

        UnityLoginProductionPage unityLoginProductionPage = new UnityLoginProductionPage(getDriver());
        unityLoginProductionPage.loadUnityProd().login(UnityConfigUtilsProd.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        // remove the comment to create new event for the full happypath scenario
        fromScratchEventPage.CreateEventFromScratch();
        fromScratchEventPage.EnableVms();
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

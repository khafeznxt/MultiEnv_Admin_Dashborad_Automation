package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginSTGPage;
import pages.RegistrationParticipantsPage;

public class AddTripTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Add Trip To The Participant")
    public void ShouldBeAbleToAddTripToParticipant (){


        LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());
        loginSTGPage.load().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.AddTripToTheParticipant();

    }

}

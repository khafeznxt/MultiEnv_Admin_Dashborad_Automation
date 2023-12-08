package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

public class AddTripTest extends BaseTest {
    private WebDriver driver;
    @Test(description = "Add Trip To The Participant")
    public void ShouldBeAbleToAddTripToParticipant (){


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.AddTripToTheParticipant();

    }

}

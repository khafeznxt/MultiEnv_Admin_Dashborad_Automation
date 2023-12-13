package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FromScratchEventPage;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

public class VenueTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Create Venue")
    public void ShouldBeAbleToCreateVenue (){


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateVenue();

    }

}

package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContentItineraryPage;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

public class DeleteUserTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)

    //@Test(description = "Delete User")
    public void ShouldBeAbleToDeleteUser() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.DeleteUser();

    }
}

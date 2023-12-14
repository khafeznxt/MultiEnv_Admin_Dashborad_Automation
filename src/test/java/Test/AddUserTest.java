package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginSTGPage;
import pages.RegistrationParticipantsPage;

import java.awt.*;

public class AddUserTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    // @Test(description = "Add User")
    public void ShouldBeAbleToCreateUser () throws AWTException {


        LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());
        loginSTGPage.load().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateUser();

    }

}

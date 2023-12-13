package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

import java.awt.*;

public class AddUserTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    // @Test(description = "Add User")
    public void ShouldBeAbleToCreateUser () throws AWTException {


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateUser();

    }

}

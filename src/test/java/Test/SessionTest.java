package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginSTGPage;
import pages.RegistrationParticipantsPage;


    public class SessionTest extends BaseTest {
        private WebDriver driver;
        @Test(enabled = false)
        //@Test(description = "Create Session")
        public void ShouldBeAbleToCreateSession (){


            LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());
            loginSTGPage.load().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

            RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
            registrationParticipantsPage.CreateSession();

        }

    }


package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationParticipantsPage;

public class AccommodationTest extends BaseTest {
    private WebDriver driver;
    @Test(description = "Create Room Type")
    public void ShouldBeAbleToCreateRoomType (){


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateRoomType();

    }

    @Test(description = "Create Room Stay And Room")
    public void ShouldBeAbleToCreateStayAndRoom (){


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        RegistrationParticipantsPage registrationParticipantsPage = new RegistrationParticipantsPage(getDriver());
        registrationParticipantsPage.CreateStayAndAddRoom();

    }


}

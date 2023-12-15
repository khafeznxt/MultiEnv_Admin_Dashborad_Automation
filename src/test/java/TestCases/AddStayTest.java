package TestCases;

import Utls.BlinkConfigUtilsDEV;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BlinkLoginDEVPage;
import pages.FullHappyPathPage;
import pages.UnityLoginSTGPage;

public class AddStayTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = true)
    // @Test(description = "Add Stay To Participants")
    public void ShouldBeAbleToAddTicketInsideSession (){


        BlinkLoginDEVPage blinkLoginDEVPage = new BlinkLoginDEVPage(getDriver());
        blinkLoginDEVPage.loadBlinkDev().login(BlinkConfigUtilsDEV.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.AddStayToParticipant();

    }
}

package TestCases;

import Utls.BlinkConfigUtilsDEV;
import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BlinkLoginDEVPage;
import pages.FullHappyPathPage;

public class AddFlightTest extends BaseTest {

    private WebDriver driver;
    @Test(enabled = true)
    // @Test(description = "Add Stay To Participants")
    public void ShouldBeAbleToAddFlightToParticipant (){


        BlinkLoginDEVPage blinkLoginDEVPage = new BlinkLoginDEVPage(getDriver());
        blinkLoginDEVPage.loadBlinkDev().login(BlinkConfigUtilsDEV.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.AddFlightToParticipant();

    }
}

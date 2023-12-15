package Test;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UnityLoginSTGPage;
import pages.FullHappyPathPage;

public class AddTripTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Add Trip To The Participant")
    public void ShouldBeAbleToAddTripToParticipant (){


        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.AddTripToTheParticipant();

    }

}

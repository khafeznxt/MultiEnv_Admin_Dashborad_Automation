package Test;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContentItineraryPage;
import pages.UnityLoginSTGPage;

public class ActivityTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Create Activity")
    public void ShouldBeAbleToCreateActivity(){

        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.load().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        ContentItineraryPage contentItineraryPage = new ContentItineraryPage(getDriver());
        contentItineraryPage.CreateItinerary();
    }
}

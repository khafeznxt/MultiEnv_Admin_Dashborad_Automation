package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContentItineraryPage;
import pages.LoginSTGPage;

public class ActivityTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Create Activity")
    public void ShouldBeAbleToCreateActivity(){

        LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());
        loginSTGPage.load().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

        ContentItineraryPage contentItineraryPage = new ContentItineraryPage(getDriver());
        contentItineraryPage.CreateItinerary();
    }
}

package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContentItineraryPage;
import pages.LoginPage;

public class ActivityTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)
    //@Test(description = "Create Activity")
    public void ShouldBeAbleToCreateActivity(){

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        ContentItineraryPage contentItineraryPage = new ContentItineraryPage(getDriver());
        contentItineraryPage.CreateItinerary();
    }
}

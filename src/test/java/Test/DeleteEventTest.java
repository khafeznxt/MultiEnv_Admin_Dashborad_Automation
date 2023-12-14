package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DeleteEventPage;
import pages.LoginSTGPage;


@Test(priority = 2)
public class DeleteEventTest extends BaseTest {

   private WebDriver driver;
    @Test(enabled = true)
    //@Test(description = "Delete Event")
   public void ShouldBeAbleToDeleteEvent () {


        LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());
        loginSTGPage.load().login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());

        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();

   }
}

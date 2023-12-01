package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DeleteEventPage;
import pages.LoginPage;


@Test(priority = 2)
public class DeleteEventTest extends BaseTest {

   private WebDriver driver;
    @Test(description = "Delete Event")
   public void ShouldBeAbleToDeleteEvent () {


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load().login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());

        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();

   }
}

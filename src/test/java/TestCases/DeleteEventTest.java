package TestCases;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DeleteEventPage;
import pages.UnityLoginSTGPage;


@Test(priority = 2)
public class DeleteEventTest extends BaseTest {

   private WebDriver driver;
    @Test(enabled = true)
    //@Test(description = "Delete Event")
   public void ShouldBeAbleToDeleteEvent () {


        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteEvent();

   }
}

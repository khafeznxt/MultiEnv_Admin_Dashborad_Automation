package TestCases;

import Utls.BlinkConfigUtilsSTG;
import Utls.BlinkConfigUtilsSTG;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BlinkLoginSTGPage;
import pages.DeleteEventPage;
import pages.BlinkLoginSTGPage;


@Test(priority = 2)
public class DeleteBulkEventTest extends BaseTest {

   private WebDriver driver;
    @Feature("Delete Bulk Event")
    @Test(description = "Delete Bulk Event")
   public void ShouldBeAbleToDeleteBulkEvents () {


        BlinkLoginSTGPage blinkLoginSTGPage = new BlinkLoginSTGPage(getDriver());
        blinkLoginSTGPage.loadBlinkSTG().login(BlinkConfigUtilsSTG.getInstance().getusername(), BlinkConfigUtilsSTG.getInstance().getPassword());

        DeleteEventPage deleteEventPage = new DeleteEventPage(getDriver());
        deleteEventPage.DeleteBulkEvents();

   }
}

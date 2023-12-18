package TestCases;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FromScratchEventPage;
import pages.UnityLoginSTGPage;

public class CreateEventFromScratchTest extends BaseTest {
    private WebDriver driver;

    @Test(enabled = true)


    //@Test(description = "Create Event From Scratch Test")
    public void ShouldBeAbleToCreateFromScratchEvent (){

        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();

        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        fromScratchEventPage.CreateEventFromScratch();
    }
}

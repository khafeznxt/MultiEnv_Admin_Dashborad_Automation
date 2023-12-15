package TestCases;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UnityLoginSTGPage;
import pages.FullHappyPathPage;

public class AccommodationTest extends BaseTest {
    private WebDriver driver;

    @Test(enabled = false)
    //@Test(description = "Create Room Type")
    public void ShouldBeAbleToCreateRoomType (){


        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.CreateRoomType();

    }

    @Test(enabled = false)
    //@Test(description = "Create Room Stay And Room")
    public void ShouldBeAbleToCreateStayAndRoom (){


        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.CreateStayAndAddRoom();

    }


}

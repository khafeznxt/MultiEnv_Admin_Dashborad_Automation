package Test;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UnityLoginSTGPage;
import pages.FullHappyPathPage;

public class DeleteUserTest extends BaseTest {
    private WebDriver driver;
    @Test(enabled = false)

    //@Test(description = "Delete User")
    public void ShouldBeAbleToDeleteUser() {

        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.load().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

        FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
        fullHappyPathPage.DeleteUser();

    }
}

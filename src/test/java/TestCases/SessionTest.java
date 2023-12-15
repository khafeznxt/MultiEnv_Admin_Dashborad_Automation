package TestCases;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UnityLoginSTGPage;
import pages.FullHappyPathPage;


    public class SessionTest extends BaseTest {
        private WebDriver driver;
        @Test(enabled = false)
        //@Test(description = "Create Session")
        public void ShouldBeAbleToCreateSession (){


            UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
            unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());

            FullHappyPathPage fullHappyPathPage = new FullHappyPathPage(getDriver());
            fullHappyPathPage.CreateSession();

        }

    }


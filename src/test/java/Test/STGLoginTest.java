package Test;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UnityLoginSTGPage;


public class STGLoginTest extends BaseTest {
    private WebDriver driver;
    @Feature("Authentication")
    @Test(enabled = false)
    //@Test(description = "Login Test")
    public void ShouldBeAbleToLoginWthEmailAndPassword(){


        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());

                unityLoginSTGPage
                        .loadUnityStg()
                        .login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());




    }
}


package Test;

import Utls.ConfigUtilsStg;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginSTGPage;


public class STGLoginTest extends BaseTest {
    private WebDriver driver;
    @Feature("Authentication")
    @Test(enabled = false)
    //@Test(description = "Login Test")
    public void ShouldBeAbleToLoginWthEmailAndPassword(){


        LoginSTGPage loginSTGPage = new LoginSTGPage(getDriver());

                loginSTGPage
                        .load()
                        .login(ConfigUtilsStg.getInstance().getusername(), ConfigUtilsStg.getInstance().getPassword());




    }
}


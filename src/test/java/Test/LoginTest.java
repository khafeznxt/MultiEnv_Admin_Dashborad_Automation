package Test;

import Utls.ConfigUtils;
import base.BaseTest;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {
    private WebDriver driver;
    @Feature("Authentication")
    @Test(description = "Login Test")
    public void ShouldBeAbleToLoginWthEmailAndPassword(){


        LoginPage loginPage = new LoginPage(getDriver());

                loginPage
                        .load()
                        .login(ConfigUtils.getInstance().getusername(), ConfigUtils.getInstance().getPassword());




    }
}


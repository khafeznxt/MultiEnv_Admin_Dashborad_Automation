package TestCases;

import Utls.UnityConfigUtilsStg;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FromScratchEventPage;
import pages.UnityLoginSTGPage;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class CreateEventFromScratchTest extends BaseTest {
    private WebDriver driver;

    @Test(enabled = true)


    //@Test(description = "Create Event From Scratch Test")
    public void ShouldBeAbleToCreateFromScratchEvent (){


        FromScratchEventPage fromScratchEventPage = new FromScratchEventPage(getDriver());
        fromScratchEventPage.load();



        UnityLoginSTGPage unityLoginSTGPage = new UnityLoginSTGPage(getDriver());
        unityLoginSTGPage.loadUnityStg().login(UnityConfigUtilsStg.getInstance().getusername(), UnityConfigUtilsStg.getInstance().getPassword());
        //int expectedResponseCode = 200; // Specify the expected response code
       // int actualResponseCode = given().get("https://example.com").statusCode();

        // Assert that the actual response code matches the expected response code
       // assertEquals("Response code is not as expected", expectedResponseCode, actualResponseCode);

        fromScratchEventPage.CreateEventFromScratch();
    }
}

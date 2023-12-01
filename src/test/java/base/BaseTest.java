package base;

import Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public WebDriver getDriver() {
        return this.driver.get();
    }

    @BeforeMethod
    public void Setup() {

        WebDriver driver = new DriverFactory().InitializeDriver();
        setDriver(driver);
    }


  /*  @AfterMethod
    public void quite() {

       getDriver().quit();
    }*/
}

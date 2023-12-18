package Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    public WebDriver driver;

    public WebDriver InitializeDriver() {

        String browser = System.getProperty("browser", "CHROME");
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--remote-allow-origins=*");
                ChromeOptions options = new ChromeOptions();
                //options.setHeadless(false);
                options.addArguments("start-maximized"); // open Browser in maximized mode
                // options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                // Enable headless mode
               /* options.addArguments("--headless");
                options.addArguments("--disable-gpu"); // applicable to Windows os only*/
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
                options.addArguments("--disable-in-process-stack-traces");
                options.addArguments("--disable-logging");
                options.addArguments("--log-level=3");
                options.addArguments("--remote-allow-origins=*");

               //browser = new ChromeDriver(options);
                driver = new ChromeDriver(options);
                break;

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("The Browser is Not Supported");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        return driver;
    }
}
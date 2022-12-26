package helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverContainer {

    private static Logger LOG = Logger.getLogger(WebDriverContainer.class);
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.WINDOWS);

            switch (browser) {
                case chrome:
                    caps.setBrowserName(Browser.CHROME.browserName());
                    LOG.info("Instantiating Chrome driver");
                    break;
                case firefox:
                    caps.setBrowserName(Browser.FIREFOX.browserName());
                    LOG.info("Instantiating Firefox driver");
                    break;
            }

            try {
                driver = new RemoteWebDriver(new URL("https://Vadzim.Zubovich:ace2235b-7c42-4936-b2df-30002174ebd0@ondemand.us-west-1.saucelabs.com:443/wd/hub"), caps);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {

        LOG.debug("Closing driver");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

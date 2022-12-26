package pageobject.object;

import org.openqa.selenium.WebDriver;

import static helpers.Locators.getLocator;

public class HomePage extends PageBase {
    private WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean successMessageIsVisible() throws Exception {
//        LOG.info("Checking success message");
        return driver.findElement(getLocator("HomePage.successMessage")).isDisplayed();
    }

    public boolean hasOpened() {
//        LOG.info("Getting Home Page loaded status");
        return super.hasOpened(driver, "Online Store | My Store1sfgdag");
    }
}

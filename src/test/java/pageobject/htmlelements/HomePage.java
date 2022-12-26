package pageobject.htmlelements;

import org.openqa.selenium.WebDriver;
import pageobject.object.PageBase;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static helpers.Locators.getLocator;

public class HomePage extends PageBase {

    public HeaderMenu headerMenu;
    private WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public boolean successMessageIsVisible() throws Exception {
        return driver.findElement(getLocator("HomePage.successMessage")).isDisplayed();
    }

    public boolean hasOpened() {
        return super.hasOpened(driver, "Online Store | My Storsafge1");
    }
}

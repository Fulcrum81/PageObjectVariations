package pageobject.htmlelements;

import org.openqa.selenium.WebDriver;
import pageobject.object.PageBase;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static helpers.Locators.getLocator;

public class LoginPage extends PageBase {

    public HeaderMenu headerMenu;
    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void setEmail(String email) throws Exception {
        driver.findElement(getLocator("LoginPage.emailInput")).sendKeys(email);
    }

    public void setPassword(String password) throws Exception {
        driver.findElement(getLocator("LoginPage.passwordInput")).sendKeys(password);
    }

    public void clickLoginButton() throws Exception {
        driver.findElement(getLocator("LoginPage.loginButton")).click();
    }

    public void attemptLogin(String email, String password) throws Exception {
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public boolean loginErrorMessageIsVisible() throws Exception {
        return driver.findElement(getLocator("LoginPage.errorMessage")).isDisplayed();
    }

    public boolean hasOpened() {
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}

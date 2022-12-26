package pageobject.object;

import io.qameta.allure.Step;
import helpers.WebDriverContainer;

import static helpers.Locators.getLocator;

public class LoginPage extends PageBase {

    public void setEmail(String email) throws Exception {
//        LOG.debug("Setting email");
        WebDriverContainer.getDriver().findElement(getLocator("LoginPage.emailInput")).sendKeys(email);
    }

    public void setPassword(String password) throws Exception {
//        LOG.debug("Setting password");
        WebDriverContainer.getDriver().findElement(getLocator("LoginPage.passwordInput")).sendKeys(password);
    }

    public void clickLoginButton() throws Exception {
//        LOG.debug("Clicking login button");
        WebDriverContainer.getDriver().findElement(getLocator("LoginPage.loginButton")).click();
    }

    @Step("Attempt login")
    public void attemptLogin(String email, String password) throws Exception {
//        LOG.info("Attempting login");
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public boolean loginErrorMessageIsVisible() throws Exception {
//        LOG.info("Ckecking login error message visibility");
        return WebDriverContainer.getDriver().findElement(getLocator("LoginPage.errorMessage")).isDisplayed();
    }

    public boolean hasOpened() {
//        LOG.info("Getting Login Page loaded status");
        return super.hasOpened(WebDriverContainer.getDriver(), "Online Store | My Store1");
    }
}

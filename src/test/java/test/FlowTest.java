package test;

import org.testng.annotations.Test;
import pageobject.flow.LoginPage;
import helpers.WebDriverContainer;

public class FlowTest extends TestBase {

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(WebDriverContainer.getDriver());

        loginPage
                .loginWithCorrectCreds()
                .assertThatSuccessMessageIsVisible();
    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(WebDriverContainer.getDriver());

        loginPage
                .loginWithIncorrectCreds()
                .assertThatLoginErrorMessageIsVisible();
    }
}

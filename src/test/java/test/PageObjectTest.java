package test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import helpers.WebDriverContainer;
import pageobject.object.HomePage;
import pageobject.object.LoginPage;

public class PageObjectTest extends TestBase {

    @Story("Login")
    @Test
    public void successfulLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage(WebDriverContainer.getDriver());

        loginPage.attemptLogin("vadim.zubovich@gmail.com", "Test1234!");
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessful");
    }

    @Story("Login")
    @Test
    public void unsuccessfulLoginTest() throws Exception {

        LoginPage loginPage = new LoginPage();

        loginPage.attemptLogin("vadim.zubovich@gmail.com", "123");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Logged in with incorrect creds");
    }

    @Description("Test for homepage loading status")
    @Story("")
    @Test
    public void homePageLoadedTest() throws Exception {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage(WebDriverContainer.getDriver());

        loginPage.attemptLogin("vadim.zubovich@gmail.com", "Test1234!");
        Assert.assertTrue(homePage.hasOpened(), "Home page hasn't opened");
    }
}

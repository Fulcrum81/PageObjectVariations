package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import helpers.WebDriverContainer;
import pageobject.pagefactory.HomePage;
import pageobject.pagefactory.LoginPage;

public class PageFactoryTest extends TestBase {

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(WebDriverContainer.getDriver(), LoginPage.class);
        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(), HomePage.class);

        loginPage.attemptLogin("vadim.zubovich@gmail.com", "Test1234!");
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessful");
    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(WebDriverContainer.getDriver(), LoginPage.class);

        loginPage.attemptLogin("vadim.zubovich@gmail.com", "123");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Login was unsuccessful");
    }
}

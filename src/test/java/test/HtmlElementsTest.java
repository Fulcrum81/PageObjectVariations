package test;

import org.testng.annotations.Test;
import static helpers.WebDriverContainer.getDriver;
import pageobject.htmlelements.HomePage;
import pageobject.htmlelements.LoginPage;

public class HtmlElementsTest extends TestBase {

    @Test
    public void htmlelementsTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.headerMenu.clickHomeButton();

        homePage.headerMenu.clickSubcategory();
    }
}

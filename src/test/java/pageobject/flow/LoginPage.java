package pageobject.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");
    private By errorMessage = By.cssSelector(".notice.errors");

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);

        return this;
    }

    public LoginPage setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);

        return this;
    }

    private void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public HomePage loginWithCorrectCreds() {
        setEmail("vadim.zubovich@gmail.com");
        setPassword("Test1234!");
        clickLoginButton();

        return new HomePage(driver);
    }

    public LoginPage loginWithIncorrectCreds() {
        setEmail("2245");
        setPassword("154");
        clickLoginButton();

        return this;
    }

    public LoginPage assertThatLoginErrorMessageIsVisible() {
        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(), "Error message not displayed");

        return this;
    }
}

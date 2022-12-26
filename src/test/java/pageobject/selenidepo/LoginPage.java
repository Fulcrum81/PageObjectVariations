package pageobject.selenidepo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static By emailInputLocator = By.name("email");
    private static By passwordInputLocator = By.name("password");
    private static By loginButtonLocator = By.name("login");
    private static By errorMessageLocator = By.cssSelector(".notice.errors");


    public static void setEmail(String email) {
        $(emailInputLocator).sendKeys(email);
    }

    public static void setPassword(String password) {
        $(passwordInputLocator).sendKeys(password);
    }

    public static void clickLoginButton() {
        $(loginButtonLocator).click();
    }

    public static void attemptLogin(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public static SelenideElement loginErrorMessage() {
        return $(errorMessageLocator);
    }
}

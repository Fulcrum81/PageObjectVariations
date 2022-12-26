package pageobject.selenidepo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static By successMessageLocator = By.cssSelector(".notice.success");

    public static SelenideElement successMessage() {
        return $(successMessageLocator);
    }
}


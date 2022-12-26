package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import helpers.ScreenshotListener;
import helpers.WebDriverContainer;

@Listeners(ScreenshotListener.class)
public class TestBase {

    @BeforeMethod
    public void setup() {
        WebDriverContainer.getDriver().get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void teardown() {
        WebDriverContainer.closeDriver();
    }
}

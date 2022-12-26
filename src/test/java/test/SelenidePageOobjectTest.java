package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.selenidepo.HomePage;
import pageobject.selenidepo.LoginPage;

import static com.codeborne.selenide.Condition.visible;

public class SelenidePageOobjectTest {
    @Test
    public static void successfulLoginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");

        LoginPage.attemptLogin("vadim.zubovich@gmail.com", "Test1234!");
        HomePage.successMessage().shouldBe(visible);

        driver.quit();
    }

    @Test
    public static void unsuccessfulLoginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");

        LoginPage.attemptLogin("vadim.zubovich@gmail.com", "123");
        LoginPage.loginErrorMessage().shouldBe(visible);

        driver.quit();
    }
}

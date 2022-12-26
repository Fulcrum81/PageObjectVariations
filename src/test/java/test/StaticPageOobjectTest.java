package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.staticpo.HomePage;
import pageobject.staticpo.LoginPage;

public class StaticPageOobjectTest {
    @Test
    public static void successfulLoginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");

        LoginPage.attemptLogin(driver, "vadim.zubovich@gmail.com", "Test1234!");
        Assert.assertTrue(HomePage.successMessageIsVisible(driver), "Login was unsuccessful");

        driver.quit();
    }

    @Test
    public static void unsuccessfulLoginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");

        LoginPage.attemptLogin(driver, "vadim.zubovich@gmail.com", "123");
//        Assert.assertTrue(LoginPage.loginErrorMessageIsVisible(), "Login was unsuccessful");

        driver.quit();
    }
}

package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    public void searchPageShown() {
        homePage.goToHomePage(url);
        assertTrue (homePage.searchButton().isDisplayed());
        driver.quit();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    static WebDriver driver;

    private final By searchButtonLocator = By.cssSelector(".FPdoLc.lJ9FBc");

    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    public void goToHomePage(String url) {
        driver.get(url);
    }
    public WebElement searchButton() {
        return driver.findElement(searchButtonLocator);
    }
}

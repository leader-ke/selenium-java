package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import io.github.cdimascio.dotenv.Dotenv;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected final String url;

    public BaseTest() {
        String envUrl = System.getenv("BASE_URL");

        if (envUrl != null && !envUrl.isEmpty()) {
            url = envUrl;
        } else {
            Dotenv dotenv = Dotenv.load();
            url = dotenv.get("BASE_URL");
        }
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

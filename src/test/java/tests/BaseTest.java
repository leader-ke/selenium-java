package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
            Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
            url = dotenv.get("BASE_URL", "https://demoqa.com");
        }
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--user-data-dir=/tmp/chrome_" + System.currentTimeMillis());

        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

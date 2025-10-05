package tests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    public void searchPageShown() {
        homePage.goToHomePage(url + "/text-box");
        assertTrue (homePage.searchButton().isDisplayed());
        driver.quit();
    }
}

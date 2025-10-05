package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HomePageTest extends BaseTest {

  @Test
  public void searchPageShown() {
    homePage.goToHomePage(url + "/text-box");
    assertTrue(homePage.searchButton().isDisplayed());
  }
}

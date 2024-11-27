package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FormalShoeListPage;
import pages.LandingPage;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;


public class TestFormalShoeListScenario {
    WebDriver driver = BrowserDriver.driver;
    LandingPage landingPage;
    FormalShoeListPage formalShoeListPage;

    @Given("^User is already logged in$")
    public void navigateToLandingPage() {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/ShoeTypes.html");
        landingPage = new LandingPage(driver);
    }

    @When("^User tries to view the formal shoe collection$")
    public void clickOnFormalShoeCollectionButton() {
        formalShoeListPage = landingPage.clickFormalShoeCollection();
    }

    @Then("^User should be able to see the formal shoe list page$")
    public void isFormalShoeListVisible() {
        String actual = formalShoeListPage.getFormalShoeHeader();
        String expected = "Formal Shoes";
        assertEquals(expected,actual);
    }
}

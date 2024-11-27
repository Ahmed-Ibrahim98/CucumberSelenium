package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddedToCartSuccessfullyPage;
import pages.FormalShoeListPage;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class TestAddedToCartScenario {

    WebDriver driver = BrowserDriver.driver;
    FormalShoeListPage formalShoeListPage;
    AddedToCartSuccessfullyPage addedToCartSuccessfullyPage;

    @Given("^A logged in user is already on the formal shoe list page$")
    public void navigateToFormalShoeListPage() {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/FormalShoeslist.html");
        formalShoeListPage = new FormalShoeListPage(driver);
    }


    @When("User adds Classic Cheltenham shoe to cart")
    public void userAddsClassicCheltenhamShoeToCart() {
        addedToCartSuccessfullyPage = formalShoeListPage.clickClassicCheltenhamAddToCart();
    }

    @Then("User should be able to see a success message")
    public void userShouldBeAbleToSeeASuccessMessage() {
        String actual = addedToCartSuccessfullyPage.getSuccessMessage();
        String expected = "Added to Cart Successfully !!!";
        assertEquals(expected, actual);
    }
}

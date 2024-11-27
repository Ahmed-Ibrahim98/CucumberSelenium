package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.OnlineProduct;

import static org.junit.Assert.assertEquals;

public class TestGeneralUserViewScenario {

    HomePage home = new HomePage();
    OnlineProduct onlineProduct;

    @Given("^User navigates to the Online Products page$")
    public void navigateToOnlineProductsPage() throws InterruptedException {
        home.clickMenu();
        onlineProduct = home.clickOnlineProductsLink();
    }

    @When("^User clicks on all of the shoes dropdowns$")
    public void click_formal_shoes_dropdown(){
        onlineProduct.clickFormalShoes();
        onlineProduct.clickSportsShoes();
        onlineProduct.clickSneakersShoes();
    }

    @Then("^User should be able to view the products$")
    public void validateProductsVisibility(){
        onlineProduct.visibilityOfFormalShoes();
        onlineProduct.visibilityOfSportsShoes();
        onlineProduct.visibilityOfSneakersShoes();

    }
}

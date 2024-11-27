package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class TestLoggedInUserScenario {
    pages.SignInPortal signIn = Base.signIn;
    pages.LandingPage landingPage;


    @When("user enters a valid {string} and {string}")
    public void user_logging_in(String username, String password){
        signIn.sendKeys_username(username);
        signIn.sendKeys_password(password);
        landingPage = signIn.Click_submitButton();
    }

    @Then("^user should be able to view the product category page$")
    public void product_section_validation(){
        landingPage.visibilityOfFormalShoes();
        landingPage.visibilityOfSportsShoes();
        landingPage.visibilityOfSneakersShoes();
    }

//    // Data Table Approach
//    @When("user enters a valid credentials")
//    public void user_logging_in(DataTable table){
//        List<String> loginInfo = table.asList();
//
//        signIn.sendKeys_username(loginInfo.get(0));
//        signIn.sendKeys_password(loginInfo.get(1));
//        landingPage = signIn.Click_submitButton();
//    }
}

package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPortal;

import static org.junit.Assert.assertEquals;

public class TestNewUserRegistrationScenario {
    SignInPortal signIn = Base.signIn;
    pages.RegistrationPage registrationPage;

    @When("^user tries to register as a new user$")
    public void go_to_registration_page(){
        registrationPage = signIn.click_registerButton();

    }

    @Then("^user should be able to view registration page$")
    public void validate_registration_heading(){
        registrationPage.visibilityOfRegistrationHeading();
    }
}

package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import pages.RegistrationSuccessfulMessagePage;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class TestSuccessfulRegistrationScenario {

    WebDriver driver = BrowserDriver.driver;
    RegistrationPage registrationPage;
    RegistrationSuccessfulMessagePage successfulMessagePage;

    @Given("^User is on the register page$")
    public void navigateToRegistrationPage(){
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/Registration.html");
        registrationPage = new RegistrationPage(driver);
    }

    @When("User submits valid credentials")
    public void userSubmitsValidCredentials() {
        successfulMessagePage = registrationPage.interactWithDropdown("Mr")
                .interactWithFirstNameField("Ahmed")
                .interactWithLastNameField("Awad")
                .interactWithEmailField("dumbemail@gmail.com")
                .interactWithContactNumberField("01000200010")
                .interactWithUsernameField("firstUser")
                .interactWithPasswordField("password")
                .clickSubmitButton();
    }

    @Then("User should be ale to see Registration Successful view")
    public void assertRegistrationSuccessfulView() {
        String actual = successfulMessagePage.getSuccessMessage();
        String expected = "User Registered Successfully !!!";
        assertEquals(expected,actual);
    }
}

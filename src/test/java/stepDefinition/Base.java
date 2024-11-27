package stepDefinition;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.SignInPortal;

public class Base {
    HomePage home = new HomePage();
    public static SignInPortal signIn;

    @Given("^user navigate to the login page$")
    public void navigateToLoginPage() throws InterruptedException {
        home.clickMenu();
        signIn = home.clickSignInLink();
    }
}

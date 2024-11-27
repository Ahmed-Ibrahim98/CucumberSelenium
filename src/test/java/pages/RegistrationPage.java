package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class RegistrationPage {
    public static String registrationHeading_xpath = "(// h1)[2]";
    By dropdownElement = By.id("Salutation");
    By firstNameField = By.id("firstname");
    By lastNameField = By.id("lastname");
    By emailField = By.id("emailId");
    By contactNumberField = By.id("contactNumber");
    By usernameField = By.id("usr");
    By passwordField = By.id("pwd");
    By submitButton = By.cssSelector("input[type=\"submit\"]");
    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void visibilityOfRegistrationHeading(){
        String heading= driver.findElement(By.xpath(registrationHeading_xpath)).getText();
        assertEquals("User Registration Page", heading);
    }

    public RegistrationPage interactWithDropdown(String option){
        Select dropdown = new Select(driver.findElement(dropdownElement));
        dropdown.selectByValue(option);
        return this;
    }

    public RegistrationPage interactWithFirstNameField(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public RegistrationPage interactWithLastNameField(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegistrationPage interactWithEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegistrationPage interactWithContactNumberField(String contact){
        driver.findElement(contactNumberField).sendKeys(contact);
        return this;
    }

    public RegistrationPage interactWithUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public RegistrationPage interactWithPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public RegistrationSuccessfulMessagePage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new RegistrationSuccessfulMessagePage(driver);
    }

}

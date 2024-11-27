package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class SignInPortal {
    public static String menu_CSSSelector = "#menuToggle > input";
    public By homeLink = By.linkText("Home");
    public By userRegistrationButton = By.id("NewRegistration");
    public By username = By.id("usr");
    public By password = By.id("pwd");
    public static String submitButton_CSSSelector = "input[type='submit']";
    WebDriver driver;

    public SignInPortal(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeys_username(String usrname) {
        driver.findElement(username).sendKeys(usrname);
    }

    public void sendKeys_password(String pswrd) {
        driver.findElement(password).sendKeys(pswrd);
    }

    public LandingPage Click_submitButton() {
        driver.findElement(By.cssSelector(submitButton_CSSSelector)).click();
        return new LandingPage(driver);
    }

    public RegistrationPage click_registerButton() {
        driver.findElement(userRegistrationButton).click();
        return new RegistrationPage(driver);
    }

    public void goHome() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(menu_CSSSelector)).click();
        driver.findElement(homeLink).click();
    }
}

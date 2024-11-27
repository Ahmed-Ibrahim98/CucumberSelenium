package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSuccessfulMessagePage {

    WebDriver driver;
    By successfulMessage = By.cssSelector("center h1");

    public RegistrationSuccessfulMessagePage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(successfulMessage).getText();
    }
}

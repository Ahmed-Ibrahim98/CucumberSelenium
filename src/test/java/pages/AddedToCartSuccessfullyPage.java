package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedToCartSuccessfullyPage {

    WebDriver driver;
    By successMessage = By.cssSelector("center h1");

    public AddedToCartSuccessfullyPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
}

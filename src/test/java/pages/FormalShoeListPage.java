package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormalShoeListPage {

    WebDriver driver;
    By formalShoeHeader = By.tagName("h2");
    By classicCheltenhamAddToCart = By.xpath("(//button)[1]");

    public FormalShoeListPage(WebDriver driver){
        this.driver = driver;
    }

    public String getFormalShoeHeader(){
        return driver.findElement(formalShoeHeader).getText();
    }

    public AddedToCartSuccessfullyPage clickClassicCheltenhamAddToCart(){
        driver.findElement(classicCheltenhamAddToCart).click();
        return new AddedToCartSuccessfullyPage(driver);
    }
}

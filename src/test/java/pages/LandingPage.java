package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LandingPage {
    public By formalShoes = By.xpath("(//h3[@id='ShoeType'])[1]");
    public By sportsShoes = By.xpath("(//h3[@id='ShoeType'])[2]");
    public By sneakersShoes = By.xpath("(//h3[@id='ShoeType'])[3]");
    By formalShoeButton = By.cssSelector("button.FormalShoes ");
    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void visibilityOfFormalShoes(){
        String formalShoeText =
                driver.findElement(formalShoes).getText();
        assertEquals("Formal Shoes", formalShoeText);
    }

    public void visibilityOfSportsShoes(){
        String sportsShoeText =
                driver.findElement(sportsShoes).getText();
        assertEquals("Sports", sportsShoeText);
    }

    public void visibilityOfSneakersShoes(){
        String sneakersShoeText =
                driver.findElement(sneakersShoes).getText();
        assertEquals("Sneakers", sneakersShoeText);
    }

    public FormalShoeListPage clickFormalShoeCollection(){
        driver.findElement(formalShoeButton).click();
        return new FormalShoeListPage(driver);
    }
}

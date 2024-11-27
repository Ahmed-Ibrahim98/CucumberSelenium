package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProduct {
    WebDriver driver;
    By formalShoeDropdown = By.cssSelector(".formalshoedropdown");
    By sportsShoeDropdown = By.cssSelector(".sportsshoedropdown");
    By sneakersShoeDropdown = By.cssSelector(".sneakershoedropdown");
    By formalShoeTableText = By.xpath("(//table)[1]//tbody/tr[1]/td[1]");
    By sportsShoesTableText = By.xpath("(//table)[2]//tbody/tr[1]/td[1]");
    By sneakersShoeTableText = By.xpath("(//table)[3]//tbody/tr[1]/td[1]");

    public OnlineProduct(WebDriver driver){
        this.driver = driver;
    }

    public void clickFormalShoes() {
        driver.findElement(formalShoeDropdown).click();
    }

    public void clickSportsShoes() {
        driver.findElement(sportsShoeDropdown).click();
    }

    public void clickSneakersShoes() {
        driver.findElement(sneakersShoeDropdown).click();
    }

    public void visibilityOfFormalShoes(){
        String formalShoeTest = driver.findElement(formalShoeTableText).getText();
        assertEquals("   Classic Cheltenham", formalShoeTest);
    }
    
    public void visibilityOfSportsShoes(){
        String sportsShoeTest = driver.findElement(sportsShoesTableText).getText();
        assertEquals("   Ultimate", sportsShoeTest);
    }
    
    public void visibilityOfSneakersShoes(){
        String sneakersShoeTest = driver.findElement(sneakersShoeTableText).getText();
        assertEquals("   Archivo", sneakersShoeTest);
    }
}

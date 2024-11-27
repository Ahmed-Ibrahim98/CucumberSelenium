package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class HomePage {
    public static String menu_CSSSelector = "#menuToggle > input";
    public static By signLink = By.linkText("Sign In Portal");
    public static By onlineProductsLink = By.linkText("Online Products");
    public WebDriver driver = BrowserDriver.driver;

    public void clickMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(menu_CSSSelector)).click();
    }

    public SignInPortal clickSignInLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(signLink).click();
        return new SignInPortal(driver);
    }

    public OnlineProduct clickOnlineProductsLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(onlineProductsLink).click();
        return new OnlineProduct(driver);
    }
}

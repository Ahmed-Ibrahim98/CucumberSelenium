package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public WebDriver setUp() {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        return driver;
    }

    public void close(){
        driver.close();
    }
}

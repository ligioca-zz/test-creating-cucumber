package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtil {

    static public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setup(String driver) {
        if(driver.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            this.driver = new ChromeDriver();
        }
        if(driver.equals("firefox")) {
            System.setProperty("???", "src/test/resources/geckodriver");
            this.driver = new FirefoxDriver();
        }
    }
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

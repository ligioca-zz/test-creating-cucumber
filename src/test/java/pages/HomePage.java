package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(BaseUtil base) {
        driver = base.getDriver();
    }
}

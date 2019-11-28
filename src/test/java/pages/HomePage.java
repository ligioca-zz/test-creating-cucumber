package pages;

import base.Controller;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(Controller controller) {
        driver = controller.getDriver();
    }
}

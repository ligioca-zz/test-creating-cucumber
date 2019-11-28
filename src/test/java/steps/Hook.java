package steps;

import base.BaseUtil;
import base.Controller;
import com.sun.xml.internal.rngom.parse.host.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook {

    private BaseUtil baseUtil;
    private Controller controller;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void initializeTest(){
        System.out.println("\n Open browser Google Chrome \n");
        controller.setupController();
    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("scenario failed");
        }
        System.out.println("\n Close browser\n ");
    }
}

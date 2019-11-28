package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{

    @Before
    public void initializeTest(){
        setup("chrome");
    }

    @After
    public void tearDownTest(Scenario scenario){
        teardown();
    }
}

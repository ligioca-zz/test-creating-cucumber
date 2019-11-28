package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class ExampleLoginSteps extends BaseUtil{

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
    }

    @Given("^I navigate to the ExecuteAutomation website$")
    public void iNavigateToTheExecuteAutomationWebsite() throws Throwable {
        System.out.println("Open GOOGLE");
        driver.get("https://www.google.com/");
    }


    @Then("^I should see the UserDetails page$")
    public void iShouldSeeTheUserDetailsPage() throws Throwable {
    }

    @And("^I enter the user following data$")
    public void iEnterTheUserFollowingData(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        System.out.println(data.get(0).get(1) + "\n");
    }

    @And("^I enter the user ([^\"]*) and pass ([^\"]*)$")
    public void iEnterTheUserUserNameAndPassPassword(String username, String password) throws Throwable {
        System.out.println("user: " + username + "\n");
        System.out.println("pass: " + password + "\n");

    }
}

package steps;

import base.BaseUtil;
import base.Controller;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;

import java.util.List;

public class LoginSteps {

    private BaseUtil baseUtil;
    Controller controller;
    HomePage homepage;

    public LoginSteps(Controller controller) {
        this.controller = controller;
        homepage = new HomePage(this.controller);
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
    }

    @Given("^I navigate to the ExecuteAutomation website$")
    public void iNavigateToTheExecuteAutomationWebsite() throws Throwable {
        controller.getDriver().get("http://www.google.com");
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

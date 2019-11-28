package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FaqSupport extends BaseUtil {

    @Given("^I navigate to the wire website$")
    public void iNavigateToTheWireWebsite() {
        getDriver().get("https://wire.com/en/");
    }

    @And("^I click SUPPORT in the footer of the page$")
    public void iClickSUPPORTInTheHeaderOfThePage() {
        WebElement faqSupportElement = driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > footer > div.css-1pbpwwl > div > div:nth-child(4) > a:nth-child(3)"));
        faqSupportElement.click();
    }

    @Then("^I should see FAQ and Support page$")
    public void iShouldSeeFAQAndSupportPage() {
        System.out.println("slkdfjklasf");
        List<WebElement> categoriesBoxes = driver.findElements(By.className("blocks-item-link"));
        WebElement titleText = driver.findElement(By.cssSelector("h1"));
        WebElement searchKeyWordPanel = driver.findElement(By.id("query"));
        Assert.assertEquals(categoriesBoxes.size(), 7);
        Assert.assertEquals(titleText.getText(), "We're here to help.");
        Assert.assertTrue(searchKeyWordPanel.isDisplayed());
    }
}

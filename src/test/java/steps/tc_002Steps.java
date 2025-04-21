package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page jiraPage = new tc_002Page();

    @Given("I am on the integration page")
    public void i_am_on_the_integration_page() {
        jiraPage.navigateToIntegrationPage();
    }

    @When("I create a new ticket in JIRA")
    public void i_create_a_new_ticket_in_JIRA() {
        jiraPage.createJiraTicket();
    }

    @Then("The ticket should be created and JIRA URL should be displayed correctly")
    public void the_ticket_should_be_created_and_JIRA_URL_should_be_displayed_correctly() {
        Assert.assertTrue(jiraPage.isJiraTicketCreated());
        Assert.assertTrue(jiraPage.isJiraURLDisplayedCorrectly());
    }
}
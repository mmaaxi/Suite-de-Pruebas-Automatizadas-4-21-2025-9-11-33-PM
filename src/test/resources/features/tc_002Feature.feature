Feature: Verify JIRA Integration

  Scenario: Create a ticket in JIRA using the integration
    Given I am on the integration page
    When I create a new ticket in JIRA
    Then The ticket should be created and JIRA URL should be displayed correctly
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By integrationPageLink = By.id("integrationPageLink");
    By createTicketButton = By.id("createTicketButton");
    By jiraUrlDisplayed = By.xpath("//span[@id='jiraUrl']");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToIntegrationPage() {
        driver.findElement(integrationPageLink).click();
        // Additional wait logic if necessary
    }

    public void createJiraTicket() {
        driver.findElement(createTicketButton).click();
        // Additional wait logic if necessary
    }

    public boolean isJiraTicketCreated() {
        // Logic to verify ticket creation success message
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        return successMessage.isDisplayed();
    }

    public boolean isJiraURLDisplayedCorrectly() {
        WebElement jiraUrlElement = driver.findElement(jiraUrlDisplayed);
        String jiraUrl = jiraUrlElement.getText();
        return jiraUrl != null && jiraUrl.startsWith("https://jira.example.com/");
    }
}
package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    
    private WebDriver driver;
    private tc_001Page googleSheetsPage;

    @Given("^el usuario abre el enlace de Google Sheets$")
    public void abrirGoogleSheets() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        googleSheetsPage = new tc_001Page(driver);
        googleSheetsPage.navigateToGoogleSheets("proporcionado_link_de_google_sheets");
    }

    @Then("^el documento de Google Sheets se carga correctamente$")
    public void verificarCargaCorrecta() {
        assert googleSheetsPage.isSheetLoaded();
        driver.quit();
    }
}
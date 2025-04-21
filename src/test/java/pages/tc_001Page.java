package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    
    private WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToGoogleSheets(String url) {
        driver.get(url);
    }

    public boolean isSheetLoaded() {
        // Espera a que el elemento visible al cargar un documento de Google Sheets esté presente
        // Por lo general, podríamos verificar un elemento único de la barra superior o el menú
        boolean isLoaded = driver.findElement(By.cssSelector("div.docs-title-toolbar")).isDisplayed();
        return isLoaded;
    }
}
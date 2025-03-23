import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.MainPage;

public class OpenMeinPage extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Success open Cryptocurrencies")
    public void successOpenCryptocurrencies(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickDexScanButton();
        try {mainPage.clickCryptocurrenciesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickCryptocurrenciesButton();
        }
        try {mainPage.checkH1MainTitleText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1MainTitleText();
        }
    }

}

import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.main.MainPage;
import page.main.Header;

public class OpenMeinPage extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Success open Cryptocurrencies")
    public void successOpenCryptocurrencies(){
        Header header = new Header(driver);
        try {header.clickDexScanButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.clickDexScanButton();
        }
        try {header.dexClickCryptocurrenciesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.dexClickCryptocurrenciesButton();
        }
        try {header.checkH1MainTitleText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.checkH1MainTitleText();
        }
    }

}

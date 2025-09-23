package UI;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.main.MainPage;
import page.main.Header;

public class OpenMeinPageTest extends DriverRule {

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Success open Cryptocurrencies")
    public void successOpenCryptocurrencies(){
        Header header = new Header(driver);
        header.clickDexScanButton();
        header.dexClickCryptocurrenciesButton();
        header.checkH1MainTitleText();
    }

}

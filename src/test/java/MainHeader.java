import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.main.Header;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.main.MainPage;

import java.time.Duration;

public class MainHeader extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Check text on Cryptocurrencies button")
    public void checkTextOnCryptocurrenciesButton(){
        Header header = new Header(driver);
        header.checkCryptocurrenciesButtonText();
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

    @Test
    @DisplayName("Check text on DexScan button")
    public void checkTextOnDexScanButton(){
        Header header = new Header(driver);
        header.checkDexScanButtonText();
    }


    @Test
    @DisplayName("Success open DexScan")
    public void successOpenDexScan(){
        Header header = new Header(driver);
        try {header.clickDexScanButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.clickDexScanButton();
        }
    }

    @Test
    @DisplayName("Check text on Exchanges button")
    public void checkTextOnExchangesButton(){
        Header header = new Header(driver);
        header.checkExchangesButtonText();
    }

    @Test
    @DisplayName("Success open Exchanges")
    public void successOpenExchanges(){
        Header header = new Header(driver);
        try {header.clickExchangesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.clickExchangesButton();
        }
    }

    @Test
    @DisplayName("Check text on Community button")
    public void checkTextOnCommunityButton(){
        Header header = new Header(driver);
        header.checkCommunityButtonText();
    }

    @Test
    @DisplayName("Success open Community")
    public void successOpenCommunity(){
        Header header = new Header(driver);
        try {header.clickCommunityButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.clickCommunityButton();
        }
    }

    @Test
    @DisplayName("Check text on Products button")
    public void checkTextOnProductsButton(){
        Header header = new Header(driver);
        header.checkProductsButtonText();
    }

    @Test
    @DisplayName("Success open Products")
    public void successOpenProducts(){
        Header header = new Header(driver);
        header.clickProductsButton();
    }

    @Test
    @DisplayName("Check text on Portfolio button")
    public void checkTextOnPortfolioButton(){
        Header header = new Header(driver);
        header.checkPortfolioButtonText();
    }

    @Test
    @DisplayName("Success open Portfolio")
    public void successOpenPortfolio(){
        Header header = new Header(driver);
        header.clickPortfolioButton();
    }

    @Test
    @DisplayName("Check text on Watchlist button")
    public void checkTextOnWatchlistButton(){
        Header header = new Header(driver);
        header.checkWatchlistButtonText();
    }

    @Test
    @DisplayName("Success open Watchlist")
    public void successOpenWatchlist(){
        Header header = new Header(driver);
        header.clickWatchlistButton();
    }

    @Test
    @DisplayName("Check text on Search string")
    public void checkTextOnSearchString(){
        Header header = new Header(driver);
        header.checkSearchStringText();
    }

    @Test
    @DisplayName("Success open Search string")
    public void successOpenSearchString(){
        Header header = new Header(driver);
        header.clickSearchString();
        header.checkOpeningSearchStringForm();
    }

    @Test
    @DisplayName("Success open App QR Code")
    public void successOpenAppQrCode(){
        Header header = new Header(driver);
        header.clickAppQrCode();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(header.getAppQrCodeText()));
        header.checkAppQrCodeText();
    }

    @Test
    @DisplayName("Success open LogIn Modal")
    public void successOpenLogInModal(){
        Header header = new Header(driver);
        header.clickLogInButton();
        header.checkTextInLogInModal();
    }

    @Test
    @DisplayName("Success open user dropdown")
    public void successOpenUserDropdown(){
        Header header = new Header(driver);
        header.clickUserMenu();
        header.clickLightButtonInUserMenu();
    }

    @Test
    @DisplayName("Count left side menu")
    public void countLeftMenuButtonSize(){
        Header header = new Header(driver);
        header.checkMenuButtonSize();
    }
}

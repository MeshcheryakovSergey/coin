import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import page.MainPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        MainPage mainPage = new MainPage(driver);
        mainPage.checkCryptocurrenciesButtonText();
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

    @Test
    @DisplayName("Check text on DexScan button")
    public void checkTextOnDexScanButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkDexScanButtonText();
    }
    @Test
    @DisplayName("Success open DexScan")
    public void successOpenDexScan(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickDexScanButton();
    }

    @Test
    @DisplayName("Check text on Exchanges button")
    public void checkTextOnExchangesButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkExchangesButtonText();
    }
    @Test
    @DisplayName("Success open Exchanges")
    public void successOpenExchanges(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickExchangesButton();
    }

    @Test
    @DisplayName("Check text on Community button")
    public void checkTextOnCommunityButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkCommunityButtonText();
    }
    @Test
    @DisplayName("Success open Community")
    public void successOpenCommunity(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCommunityButton();
    }

    @Test
    @DisplayName("Check text on Products button")
    public void checkTextOnProductsButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkProductsButtonText();
    }
    @Test
    @DisplayName("Success open Products")
    public void successOpenProducts(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickProductsButton();
    }

    @Test
    @DisplayName("Check text on Portfolio button")
    public void checkTextOnPortfolioButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkPortfolioButtonText();
    }

    @Test
    @DisplayName("Success open Portfolio")
    public void successOpenPortfolio(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickPortfolioButton();
    }

    @Test
    @DisplayName("Check text on Watchlist button")
    public void checkTextOnWatchlistButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkWatchlistButtonText();
    }
    @Test
    @DisplayName("Success open Watchlist")
    public void successOpenWatchlist(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickWatchlistButton();
    }

    @Test
    @DisplayName("Check text on Search string")
    public void checkTextOnSearchString(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkSearchStringText();
    }

    @Test
    @DisplayName("Success open Search string")
    public void successOpenSearchString(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSearchString();
        mainPage.checkOpeningSearchStringForm();
    }

    @Test
    @DisplayName("Success open App QR Code")
    public void successOpenAppQrCode(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAppQrCode();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getAppQrCodeText()));
        mainPage.checkAppQrCodeText();
    }

    @Test
    @DisplayName("Success open LogIn Modal")
    public void successOpenLogInModal(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogInButton();
        mainPage.checkTextInLogInModal();
    }

    @Test
    @DisplayName("Success open user dropdown")
    public void successOpenUserDropdown(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickUserMenu();
        mainPage.clickLightButtonInUserMenu();
    }

    @Test
    @DisplayName("Success open user dropdown")
    public void checkMenuButtonSize(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkMenuButtonSize();
    }
}

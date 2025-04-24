import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.MainPage;

public class MainHeaderLeftPart extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Check text on Cryptocurrencies Section on left menu")
    public void checkTextOnCryptocurrenciesButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesSectionText();
    }

    @Test
    @DisplayName("Count item in Cryptocurrencies Section on left menu")
    public void countCryptocurrenciesMenuListSize(){
        MainPage mainPage = new MainPage(driver);
        try {mainPage.hoverCryptocurrenciesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.hoverCryptocurrenciesButton();
        }
        mainPage.checkCryptocurrenciesMenuListSize();
    }

    @Test
    @DisplayName("Check text on Ranking link")
    public void checkTextOnRankingLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesRankingText();
    }

    @Test
    @DisplayName("Success follow the Ranking link ")
    public void successFollowRankingLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickDexScanButton();
        mainPage.hoverCryptocurrenciesButton();
        try {mainPage.clickRankingLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickRankingLink();
        }
        try {mainPage.checkH1MainTitleText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1MainTitleText();
        }
    }

    @Test
    @DisplayName("Check text on Categories link")
    public void checkTextOnCategoriesLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesCategoriesText();
    }

    @Test
    @DisplayName("Success follow the Categories link ")
    public void successOpenCryptocurrencies(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {mainPage.clickCategoriesLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickCategoriesLink();
        }
        try {mainPage.checkH1CryptocurrencyCategoryText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1CryptocurrencyCategoryText();
        }
    }

    @Test
    @DisplayName("Check text on Historical Snapshots link")
    public void checkTextOnHistoricalSnapshotsLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesHistoricalSnapshotsText();
    }

    @Test
    @DisplayName("Success follow the Historical Snapshots link ")
    public void successOpenHistoricalSnapshots(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {mainPage.clickHistoricalSnapshotsLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickHistoricalSnapshotsLink();
        }
        try {mainPage.checkH1CryptocurrencyHistoricalSnapshotsText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1CryptocurrencyHistoricalSnapshotsText();
        }
    }

    @Test
    @DisplayName("Check text on Token Unlocks link")
    public void checkTextOnTokenUnlocksLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesTokenUnlocksText();
    }

    @Test
    @DisplayName("Success follow the Token Unlocks link ")
    public void successOpenTokenUnlocks(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {mainPage.clickTokenUnlocksLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickTokenUnlocksLink();
        }
        try {mainPage.checkH1CryptocurrencyTokenUnlocksText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1CryptocurrencyTokenUnlocksText();
        }
    }

    @Test
    @DisplayName("Check text on Yield link")
    public void checkTextOnYieldLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesYieldText();
    }

    @Test
    @DisplayName("Success follow the Yield link ")
    public void successOpenYield(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {mainPage.clickYieldLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickYieldLink();
        }
        try {mainPage.checkH1CryptocurrencyYieldText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1CryptocurrencyYieldText();
        }
    }


    // тесты для секции Leaderboards в выпадающем меню Cryptocurrencies
    @Test
    @DisplayName("Check text on Leaderboards Section on left menu")
    public void checkTextOnLeaderboardsSection(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsSectionText();
    }

    @Test
    @DisplayName("Count item in Leaderboards Section on left menu")
    public void countLeaderboardsSectionListSize(){
        MainPage mainPage = new MainPage(driver);
        try {mainPage.hoverCryptocurrenciesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.hoverCryptocurrenciesButton();
        }
        mainPage.checkLeaderboardsSectionMenuListSize();
    }

}

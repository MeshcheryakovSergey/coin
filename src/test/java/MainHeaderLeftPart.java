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

    @Test
    @DisplayName("Check text on Trending link")
    public void checkTextOnTrendingLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsTrendingText();
    }

    @Test
    @DisplayName("Success follow the Trending link ")
    public void successOpenTrending() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickTrendingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickTrendingLink();
        }
        try {
            mainPage.checkH1LeaderboardsTrendingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsTrendingText();
        }
    }

    @Test
    @DisplayName("Check text on Upcoming link")
    public void checkTextOnUpcomingLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsUpcomingText();
    }

    @Test
    @DisplayName("Success follow the Upcoming link ")
    public void successOpenUpcoming() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickUpcomingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickUpcomingLink();
        }
        try {
            mainPage.checkH1LeaderboardsUpcomingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsUpcomingText();
        }
    }

    @Test
    @DisplayName("Check text on Recently Added link")
    public void checkTextOnRecentlyAddedLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsRecentlyAddedText();
    }

    @Test
    @DisplayName("Success follow the Recently Added link ")
    public void successOpenRecentlyAdded() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickRecentlyAddedLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickRecentlyAddedLink();
        }
        try {
            mainPage.checkH1LeaderboardsRecentlyAddedText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsRecentlyAddedText();
        }
    }

    @Test
    @DisplayName("Check text on Gainers Losers link")
    public void checkTextOnGainersLosersLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsGainersLosersText();
    }

    @Test
    @DisplayName("Success follow the Gainers Losers link ")
    public void successOpenGainersLosers() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickGainersLosersLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickGainersLosersLink();
        }
        try {
            mainPage.checkH1LeaderboardsGainersLosersText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsGainersLosersText();
        }
    }

    @Test
    @DisplayName("Check text on Most Visited link")
    public void checkTextOnMostVisitedLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsMostVisitedText();
    }

    @Test
    @DisplayName("Success follow the Most Visited link ")
    public void successOpenMostVisited() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickMostVisitedLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickMostVisitedLink();
        }
        try {
            mainPage.checkH1LeaderboardsMostVisitedText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsMostVisitedText();
        }
    }

    @Test
    @DisplayName("Check text on Community Sentiment link")
    public void checkTextOnCommunitySentimentLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsCommunitySentimentText();
    }

    @Test
    @DisplayName("Success follow the Community Sentiment link ")
    public void successOpenCommunitySentiment() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickCommunitySentimentLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickCommunitySentimentLink();
        }
        try {
            mainPage.checkH1LeaderboardsCommunitySentimentText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsCommunitySentimentText();
        }
    }

    @Test
    @DisplayName("Check text on Chain Ranking link")
    public void checkTextOnChainRankingLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkLeaderboardsChainRankingText();
    }

    @Test
    @DisplayName("Success follow the Chain Ranking link ")
    public void successOpenChainRanking() {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickChainRankingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickChainRankingLink();
        }
        try {
            mainPage.checkH1LeaderboardsChainRankingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1LeaderboardsChainRankingText();
        }
    }


    // тесты для секции Market Overview в выпадающем меню Cryptocurrencies
    @Test
    @DisplayName("Check text on Market Overview Section on left menu")
    public void checkTextOnMarketOverviewSection(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkMarketOverviewSectionText();
    }

    @Test
    @DisplayName("Count item in Market Overview Section on left menu")
    public void countMarketOverviewListSize(){
        MainPage mainPage = new MainPage(driver);
        try {mainPage.hoverCryptocurrenciesButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.hoverCryptocurrenciesButton();
        }
        mainPage.checkMarketOverviewSectionSize();
    }

    @Test
    @DisplayName("Check text on Market Overview link")
    public void checkTextOnMarketOverviewLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkMarketOverviewMarketOverviewText();
    }

    @Test
    @DisplayName("Success follow the Market Overview link ")
    public void successOpenMarketOverview () {
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        try {
            mainPage.clickMarketOverviewLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.clickMarketOverviewLink();
        }
        try {
            mainPage.checkH1MarketOverviewMarketOverviewText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            mainPage.checkH1MarketOverviewMarketOverviewText();
        }
    }


}

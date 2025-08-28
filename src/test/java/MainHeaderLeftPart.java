import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.main.Header;
import page.main.HeaderLeftMenu;

public class MainHeaderLeftPart extends DriverRule{

    @Before
    public void openMain(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.open();
    }

    @Test
    @DisplayName("Check text on Cryptocurrencies Section on left menu")
    public void checkTextOnCryptocurrenciesButton(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesSectionText();
    }

    @Test
    @DisplayName("Count item in Cryptocurrencies Section on left menu")
    public void countCryptocurrenciesMenuListSize(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesMenuListSize();
    }

    @Test
    @DisplayName("Check text on Ranking link")
    public void checkTextOnRankingLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesRankingText();
    }

    @Test
    @DisplayName("Success follow the Ranking link ")
    public void successFollowRankingLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        Header header = new Header(driver);
        try {header.clickDexScanButton();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.clickDexScanButton();
        }
        leftMenu.hoverCryptocurrenciesButton();
        try {leftMenu.clickRankingLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickRankingLink();
        }
        try {header.checkH1MainTitleText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            header.checkH1MainTitleText();
        }
    }

    @Test
    @DisplayName("Check text on Categories link")
    public void checkTextOnCategoriesLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesCategoriesText();
    }

    @Test
    @DisplayName("Success follow the Categories link ")
    public void successOpenCryptocurrencies(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {leftMenu.clickCategoriesLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickCategoriesLink();
        }
        try {leftMenu.checkH1CryptocurrencyCategoryText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1CryptocurrencyCategoryText();
        }
    }

    @Test
    @DisplayName("Check text on Historical Snapshots link")
    public void checkTextOnHistoricalSnapshotsLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesHistoricalSnapshotsText();
    }

    @Test
    @DisplayName("Success follow the Historical Snapshots link ")
    public void successOpenHistoricalSnapshots(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {leftMenu.clickHistoricalSnapshotsLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickHistoricalSnapshotsLink();
        }
        try {leftMenu.checkH1CryptocurrencyHistoricalSnapshotsText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1CryptocurrencyHistoricalSnapshotsText();
        }
    }

    @Test
    @DisplayName("Check text on Token Unlocks link")
    public void checkTextOnTokenUnlocksLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesTokenUnlocksText();
    }

    @Test
    @DisplayName("Success follow the Token Unlocks link ")
    public void successOpenTokenUnlocks(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {leftMenu.clickTokenUnlocksLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickTokenUnlocksLink();
        }
        try {leftMenu.checkH1CryptocurrencyTokenUnlocksText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1CryptocurrencyTokenUnlocksText();
        }
    }

    @Test
    @DisplayName("Check text on Yield link")
    public void checkTextOnYieldLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkCryptocurrenciesYieldText();
    }

    @Test
    @DisplayName("Success follow the Yield link ")
    public void successOpenYield(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {leftMenu.clickYieldLink();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickYieldLink();
        }
        try {leftMenu.checkH1CryptocurrencyYieldText();}
        catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1CryptocurrencyYieldText();
        }
    }


    // тесты для секции Leaderboards в выпадающем меню Cryptocurrencies
    @Test
    @DisplayName("Check text on Leaderboards Section on left menu")
    public void checkTextOnLeaderboardsSection(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsSectionText();
    }

    @Test
    @DisplayName("Count item in Leaderboards Section on left menu")
    public void countLeaderboardsSectionListSize(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsSectionMenuListSize();
    }

    @Test
    @DisplayName("Check text on Trending link")
    public void checkTextOnTrendingLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsTrendingText();
    }

    @Test
    @DisplayName("Success follow the Trending link ")
    public void successOpenTrending() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickTrendingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickTrendingLink();
        }
        try {
            leftMenu.checkH1LeaderboardsTrendingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsTrendingText();
        }
    }

    @Test
    @DisplayName("Check text on Upcoming link")
    public void checkTextOnUpcomingLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsUpcomingText();
    }

    @Test
    @DisplayName("Success follow the Upcoming link ")
    public void successOpenUpcoming() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickUpcomingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickUpcomingLink();
        }
        try {
            leftMenu.checkH1LeaderboardsUpcomingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsUpcomingText();
        }
    }

    @Test
    @DisplayName("Check text on Recently Added link")
    public void checkTextOnRecentlyAddedLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsRecentlyAddedText();
    }

    @Test
    @DisplayName("Success follow the Recently Added link ")
    public void successOpenRecentlyAdded() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickRecentlyAddedLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickRecentlyAddedLink();
        }
        try {
            leftMenu.checkH1LeaderboardsRecentlyAddedText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsRecentlyAddedText();
        }
    }

    @Test
    @DisplayName("Check text on Gainers Losers link")
    public void checkTextOnGainersLosersLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsGainersLosersText();
    }

    @Test
    @DisplayName("Success follow the Gainers Losers link ")
    public void successOpenGainersLosers() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickGainersLosersLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickGainersLosersLink();
        }
        try {
            leftMenu.checkH1LeaderboardsGainersLosersText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsGainersLosersText();
        }
    }

    @Test
    @DisplayName("Check text on Most Visited link")
    public void checkTextOnMostVisitedLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsMostVisitedText();
    }

    @Test
    @DisplayName("Success follow the Most Visited link ")
    public void successOpenMostVisited() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickMostVisitedLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickMostVisitedLink();
        }
        try {
            leftMenu.checkH1LeaderboardsMostVisitedText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsMostVisitedText();
        }
    }

    @Test
    @DisplayName("Check text on Community Sentiment link")
    public void checkTextOnCommunitySentimentLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsCommunitySentimentText();
    }

    @Test
    @DisplayName("Success follow the Community Sentiment link ")
    public void successOpenCommunitySentiment() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickCommunitySentimentLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickCommunitySentimentLink();
        }
        try {
            leftMenu.checkH1LeaderboardsCommunitySentimentText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsCommunitySentimentText();
        }
    }

    @Test
    @DisplayName("Check text on Chain Ranking link")
    public void checkTextOnChainRankingLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkLeaderboardsChainRankingText();
    }

    @Test
    @DisplayName("Success follow the Chain Ranking link ")
    public void successOpenChainRanking() {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickChainRankingLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickChainRankingLink();
        }
        try {
            leftMenu.checkH1LeaderboardsChainRankingText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1LeaderboardsChainRankingText();
        }
    }


    // тесты для секции Market Overview в выпадающем меню Cryptocurrencies
    @Test
    @DisplayName("Check text on Market Overview Section on left menu")
    public void checkTextOnMarketOverviewSection(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkMarketOverviewSectionText();
    }

    @Test
    @DisplayName("Count item in Market Overview Section on left menu")
    public void countMarketOverviewListSize(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkMarketOverviewSectionSize();
    }

    @Test
    @DisplayName("Check text on Market Overview link")
    public void checkTextOnMarketOverviewLink(){
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        leftMenu.checkMarketOverviewMarketOverviewText();
    }

    @Test
    @DisplayName("Success follow the Market Overview link ")
    public void successOpenMarketOverview () {
        HeaderLeftMenu leftMenu = new HeaderLeftMenu(driver);
        leftMenu.hoverCryptocurrenciesButton();
        try {
            leftMenu.clickMarketOverviewLink();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.clickMarketOverviewLink();
        }
        try {
            leftMenu.checkH1MarketOverviewMarketOverviewText();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            leftMenu.checkH1MarketOverviewMarketOverviewText();
        }
    }


}

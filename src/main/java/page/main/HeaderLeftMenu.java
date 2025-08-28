package page.main;

import org.openqa.selenium.By;
import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.ApiSpecBuilder;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;

public class HeaderLeftMenu {

    //h1 для leaderboards
    public final static By h1LeaderboardsTrending = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsUpcoming = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsRecentlyAdded = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsGainersLosers = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsMostVisited = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsCommunitySentiment = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1LeaderboardsChainRanking = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");

    //h1 для Market Overview
    public final static By h1MarketOverviewMarketOverview = By.cssSelector("h1[class*='base-text']");
    public final static By h1MarketOverviewCoinMarketCap100Index = By.cssSelector("h1[class*='base-text']");
    public final static By h1MarketOverviewFearGreedIndex = By.cssSelector("h1[class*='base-text']");
    public final static By h1MarketOverviewAltcoinSeasonIndex = By.cssSelector("h1[class*='base-text']");
    public final static By h1MarketOverviewBitcoinDominance = By.cssSelector("h1[class*='base-text']");
    public final static By h1MarketOverviewCryptoETFs = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");


    public final static By cryptocurrenciesSectionText = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:first-child");
    public final static By cryptocurrenciesSectionMenuListSize = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a");
    public final static By leaderboardsSectionText = By.cssSelector("div[class='section leaderboards-section']>div:first-child");
    public final static By leaderboardsSectionMenuListSize = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a");
    public final static By marketOverviewText = By.cssSelector("div[class='section market-overview-section']>div:first-child");
    public final static By marketOverviewMenuListSize = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a");

    //пункты меню в cryptocurrencies в столбце cryptocurrencies
    public final static By cryptocurrenciesRanking = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:first-child");
    public final static By cryptocurrenciesCategories = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(2)");
    public final static By cryptocurrenciesHistoricalSnapshots = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(3)");
    public final static By cryptocurrenciesTokenUnlocks = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(4)");
    public final static By cryptocurrenciesYield = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(5)");

    //пункты меню в cryptocurrencies в столбце leaderboards
    public final static By leaderboardsTrending = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:first-child");
    public final static By leaderboardsUpcoming = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(2)");
    public final static By leaderboardsRecentlyAdded = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(3)");
    public final static By leaderboardsGainersLosers = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(4)");
    public final static By leaderboardsMostVisited = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(5)");
    public final static By leaderboardsCommunitySentiment = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(6)");
    public final static By leaderboardsChainRanking = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(7)");

    //пункты меню в cryptocurrencies в столбце Market Overview
    public final static By marketOverviewMarketOverview = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:first-child");
    public final static By marketOverviewCoinMarketCap100Index = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:nth-child(2)");
    public final static By marketOverviewFearGreedIndex = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:nth-child(3)");
    public final static By marketOverviewAltcoinSeasonIndex = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:nth-child(4)");
    public final static By marketOverviewBitcoinDominance = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:nth-child(5)");
    public final static By marketOverviewCryptoETFs = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a:nth-child(6)");

    private final WebDriver driver;

    public HeaderLeftMenu(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void checkH1CryptocurrencyCategoryText() {
        String text = driver.findElement(Header.h1CryptocurrencyCategory).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrency Sectors by 24h Price Change"));
    }

    @Step
    public void checkH1CryptocurrencyHistoricalSnapshotsText() {
        String text = driver.findElement(Header.h1CryptocurrencyHistoricalSnapshots).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrency Historical Data Snapshot"));
    }

    @Step
    public void checkH1CryptocurrencyTokenUnlocksText() {
        String text = driver.findElement(Header.h1CryptocurrencyTokenUnlocks).getText();
        MatcherAssert.assertThat(text, equalTo("Token Unlock And Vesting Schedules"));
    }

    @Step
    public void checkH1CryptocurrencyYieldText() {
        String text = driver.findElement(Header.h1CryptocurrencyYield).getText();
        MatcherAssert.assertThat(text, equalTo("Explore Yield Products"));
    }

    @Step
    public void checkH1LeaderboardsTrendingText() {
        String text = driver.findElement(h1LeaderboardsTrending).getText();
        MatcherAssert.assertThat(text, equalTo("What Are The Trending Cryptocurrencies On CoinMarketCap?"));
    }

    @Step
    public void checkH1LeaderboardsUpcomingText() {
        String text = driver.findElement(h1LeaderboardsUpcoming).getText();
        MatcherAssert.assertThat(text, equalTo("Best Upcoming Cryptocurrencies"));
    }

    @Step
    public void checkH1LeaderboardsRecentlyAddedText() {
        String text = driver.findElement(h1LeaderboardsRecentlyAdded).getText();
        MatcherAssert.assertThat(text, equalTo("New Cryptocurrencies"));
    }

    @Step
    public void checkH1LeaderboardsGainersLosersText() {
        String text = driver.findElement(h1LeaderboardsGainersLosers).getText();
        MatcherAssert.assertThat(text, equalTo("Top Crypto Gainers And Losers Today"));
    }

    @Step
    public void checkH1LeaderboardsMostVisitedText() {
        String text = driver.findElement(h1LeaderboardsMostVisited).getText();
        MatcherAssert.assertThat(text, equalTo("What Are The Most Viewed Cryptocurrencies on CoinMarketCap?"));
    }

    @Step
    public void checkH1LeaderboardsCommunitySentimentText() {
        String text = driver.findElement(h1LeaderboardsCommunitySentiment).getText();
        MatcherAssert.assertThat(text, equalTo("Crypto Community Sentiment"));
    }

    @Step
    public void checkH1LeaderboardsChainRankingText() {
        String text = driver.findElement(h1LeaderboardsChainRanking).getText();
        MatcherAssert.assertThat(text, equalTo("Largest Blockchains in Crypto Ranked by TVL"));
    }

    @Step
    public void checkH1MarketOverviewMarketOverviewText() {
        String text = driver.findElement(h1MarketOverviewMarketOverview).getText();
        MatcherAssert.assertThat(text, equalTo("Crypto Market Overview"));
    }

    @Step
    public void checkH1MarketOverviewCoinMarketCap100IndexText() {
        String text = driver.findElement(h1MarketOverviewCoinMarketCap100Index).getText();
        MatcherAssert.assertThat(text, equalTo("TVL"));
    }

    @Step
    public void checkH1MarketOverviewFearGreedIndexText() {
        String text = driver.findElement(h1MarketOverviewFearGreedIndex).getText();
        MatcherAssert.assertThat(text, equalTo("TVL"));
    }

    @Step
    public void checkH1MarketOverviewAltcoinSeasonText() {
        String text = driver.findElement(h1MarketOverviewAltcoinSeasonIndex).getText();
        MatcherAssert.assertThat(text, equalTo("TVL"));
    }

    @Step
    public void checkH1MarketOverviewBitcoinDominanceText() {
        String text = driver.findElement(h1MarketOverviewBitcoinDominance).getText();
        MatcherAssert.assertThat(text, equalTo("TVL"));
    }

    @Step
    public void checkH1MarketOverviewCryptoETFsText() {
        String text = driver.findElement(h1MarketOverviewCryptoETFs).getText();
        MatcherAssert.assertThat(text, equalTo("TVL"));
    }

    @Step
    public void checkCryptocurrenciesSectionText() {
        String text = driver.findElement(cryptocurrenciesSectionText).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrencies"));
    }

    //наведение на элемент
//    @Step
//    public void hoverCryptocurrenciesButton() {
//        WebElement menuButton = driver.findElement(Header.cryptocurrenciesButton);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(menuButton).perform();
//    }

    @Step
    public void hoverCryptocurrenciesButton(){
        try { WebElement menuButton = driver.findElement(Header.cryptocurrenciesButton);
            Actions actions = new Actions(driver);
            actions.moveToElement(menuButton).perform();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            WebElement menuButton = driver.findElement(Header.cryptocurrenciesButton);
            Actions actions = new Actions(driver);
            actions.moveToElement(menuButton).perform();
        }
    }

    @Step
    public void checkCryptocurrenciesMenuListSize() {
        List<WebElement> cryptocurrenciesMenuList = (List<WebElement>) driver.findElements(cryptocurrenciesSectionMenuListSize);
        int listSize = cryptocurrenciesMenuList.size();
        MatcherAssert.assertThat(listSize, equalTo(5));
    }

    @Step
    public void checkCryptocurrenciesRankingText() {
        String text = driver.findElement(cryptocurrenciesRanking).getText();
        MatcherAssert.assertThat(text, equalTo("Ranking"));
    }

    @Step
    public void clickRankingLink() {
        driver.findElement(cryptocurrenciesRanking).click();
    }

    @Step
    public void checkCryptocurrenciesCategoriesText() {
        String text = driver.findElement(cryptocurrenciesCategories).getText();
        MatcherAssert.assertThat(text, equalTo("Categories"));
    }

    @Step
    public void clickCategoriesLink() {
        driver.findElement(cryptocurrenciesCategories).click();
    }

    @Step
    public void checkCryptocurrenciesHistoricalSnapshotsText() {
        String text = driver.findElement(cryptocurrenciesHistoricalSnapshots).getText();
        MatcherAssert.assertThat(text, equalTo("Historical Snapshots"));
    }

    @Step
    public void clickHistoricalSnapshotsLink() {
        driver.findElement(cryptocurrenciesHistoricalSnapshots).click();
    }

    @Step
    public void checkCryptocurrenciesTokenUnlocksText() {
        String text = driver.findElement(cryptocurrenciesTokenUnlocks).getText();
        MatcherAssert.assertThat(text, equalTo("Token unlocks"));
    }

    @Step
    public void clickTokenUnlocksLink() {
        driver.findElement(cryptocurrenciesTokenUnlocks).click();
    }

    @Step
    public void checkCryptocurrenciesYieldText() {
        String text = driver.findElement(cryptocurrenciesYield).getText();
        MatcherAssert.assertThat(text, equalTo("Yield"));
    }

    @Step
    public void clickYieldLink() {
        driver.findElement(cryptocurrenciesYield).click();
    }


    @Step
    public void checkLeaderboardsSectionText() {
        String text = driver.findElement(leaderboardsSectionText).getText();
        MatcherAssert.assertThat(text, equalTo("Leaderboards"));
    }

    @Step
    public void checkLeaderboardsSectionMenuListSize() {
        List<WebElement> cryptocurrenciesMenuList = (List<WebElement>) driver.findElements(leaderboardsSectionMenuListSize);
        int listSize = cryptocurrenciesMenuList.size();
        MatcherAssert.assertThat(listSize, equalTo(7));
    }

    public void checkLeaderboardsTrendingText() {
        String text = driver.findElement(leaderboardsTrending).getText();
        MatcherAssert.assertThat(text, equalTo("Trending"));
    }

    public void checkLeaderboardsUpcomingText() {
        String text = driver.findElement(leaderboardsUpcoming).getText();
        MatcherAssert.assertThat(text, equalTo("Upcoming"));
    }

    public void checkLeaderboardsRecentlyAddedText() {
        String text = driver.findElement(leaderboardsRecentlyAdded).getText();
        MatcherAssert.assertThat(text, equalTo("Recently Added"));
    }

    public void checkLeaderboardsGainersLosersText() {
        String text = driver.findElement(leaderboardsGainersLosers).getText();
        MatcherAssert.assertThat(text, equalTo("Gainers & Losers"));
    }

    public void checkLeaderboardsMostVisitedText() {
        String text = driver.findElement(leaderboardsMostVisited).getText();
        MatcherAssert.assertThat(text, equalTo("Most Visited"));
    }

    public void checkLeaderboardsCommunitySentimentText() {
        String text = driver.findElement(leaderboardsCommunitySentiment).getText();
        MatcherAssert.assertThat(text, equalTo("Community Sentiment"));
    }

    public void checkLeaderboardsChainRankingText() {
        String text = driver.findElement(leaderboardsChainRanking).getText();
        MatcherAssert.assertThat(text, equalTo("Chain Ranking"));
    }

    @Step
    public void clickTrendingLink() {
        driver.findElement(leaderboardsTrending).click();
    }

    @Step
    public void clickUpcomingLink() {
        driver.findElement(leaderboardsUpcoming).click();
    }

    @Step
    public void clickRecentlyAddedLink() {
        driver.findElement(leaderboardsRecentlyAdded).click();
    }

    @Step
    public void clickGainersLosersLink() {
        driver.findElement(leaderboardsGainersLosers).click();
    }

    @Step
    public void clickMostVisitedLink() {
        driver.findElement(leaderboardsMostVisited).click();
    }

    @Step
    public void clickCommunitySentimentLink() {
        driver.findElement(leaderboardsCommunitySentiment).click();
    }

    @Step
    public void clickChainRankingLink() {
        driver.findElement(leaderboardsChainRanking).click();
    }


    @Step
    public void checkMarketOverviewSectionText() {
        String text = driver.findElement(marketOverviewText).getText();
        MatcherAssert.assertThat(text, equalTo("Market Overview"));
    }

    @Step
    public void checkMarketOverviewSectionSize() {
        List<WebElement> cryptocurrenciesMenuList = (List<WebElement>) driver.findElements(marketOverviewMenuListSize);
        int listSize = cryptocurrenciesMenuList.size();
        MatcherAssert.assertThat(listSize, equalTo(7));
    }

    public void checkMarketOverviewMarketOverviewText() {
        String text = driver.findElement(marketOverviewMarketOverview).getText();
        MatcherAssert.assertThat(text, equalTo("Market Overview"));
    }

    public void checkMarketOverviewCoinMarketCap100IndexText() {
        String text = driver.findElement(marketOverviewCoinMarketCap100Index).getText();
        MatcherAssert.assertThat(text, equalTo("CoinMarketCap 100 Index"));
    }

    public void checkMarketOverviewFearGreedIndexText() {
        String text = driver.findElement(marketOverviewFearGreedIndex).getText();
        MatcherAssert.assertThat(text, equalTo("Fear and Greed Index"));
    }

    public void checkMarketOverviewAltcoinSeasonIndexText() {
        String text = driver.findElement(marketOverviewAltcoinSeasonIndex).getText();
        MatcherAssert.assertThat(text, equalTo("Altcoin Season Index"));
    }

    public void checkMarketOverviewBitcoinDominanceText() {
        String text = driver.findElement(marketOverviewBitcoinDominance).getText();
        MatcherAssert.assertThat(text, equalTo("Bitcoin Dominance"));
    }

    public void checkMarketOverviewCryptoETFsText() {
        String text = driver.findElement(marketOverviewCryptoETFs).getText();
        MatcherAssert.assertThat(text, equalTo("Crypto ETFs"));
    }

    @Step
    public void clickMarketOverviewLink() {
        driver.findElement(marketOverviewMarketOverview).click();
    }

    @Step
    public void clickCoinMarketCap100IndexLink() {
        driver.findElement(marketOverviewCoinMarketCap100Index).click();
    }

    @Step
    public void clickFearGreedLink() {
        driver.findElement(marketOverviewFearGreedIndex).click();
    }

    @Step
    public void clickAltcoinSeasonIndexLink() {
        driver.findElement(marketOverviewAltcoinSeasonIndex).click();
    }

    @Step
    public void clickBitcoinDominanceLink() {
        driver.findElement(marketOverviewBitcoinDominance).click();
    }

    @Step
    public void clickCryptoETFsLink() {
        driver.findElement(marketOverviewCryptoETFs).click();
    }




}

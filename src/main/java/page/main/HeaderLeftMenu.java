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
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(Header.h1CryptocurrencyCategory).getText();
                MatcherAssert.assertThat(text, equalTo("Cryptocurrency Sectors by 24h Price Change"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1CryptocurrencyHistoricalSnapshotsText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(Header.h1CryptocurrencyHistoricalSnapshots).getText();
                MatcherAssert.assertThat(text, equalTo("Cryptocurrency Historical Data Snapshot"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1CryptocurrencyTokenUnlocksText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(Header.h1CryptocurrencyTokenUnlocks).getText();
                MatcherAssert.assertThat(text, equalTo("Token Unlock And Vesting Schedules"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1CryptocurrencyYieldText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(Header.h1CryptocurrencyYield).getText();
                MatcherAssert.assertThat(text, equalTo("Explore Yield Products"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsTrendingText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsTrending).getText();
                MatcherAssert.assertThat(text, equalTo("What Are The Trending Cryptocurrencies On CoinMarketCap?"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
       }

    @Step
    public void checkH1LeaderboardsUpcomingText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsUpcoming).getText();
                MatcherAssert.assertThat(text, equalTo("Best Upcoming Cryptocurrencies"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsRecentlyAddedText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsRecentlyAdded).getText();
                MatcherAssert.assertThat(text, equalTo("New Cryptocurrencies"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsGainersLosersText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsGainersLosers).getText();
                MatcherAssert.assertThat(text, equalTo("Top Crypto Gainers And Losers Today"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsMostVisitedText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsMostVisited).getText();
                MatcherAssert.assertThat(text, equalTo("What Are The Most Viewed Cryptocurrencies on CoinMarketCap?"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsCommunitySentimentText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsCommunitySentiment).getText();
                MatcherAssert.assertThat(text, equalTo("Crypto Community Sentiment"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1LeaderboardsChainRankingText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1LeaderboardsChainRanking).getText();
                MatcherAssert.assertThat(text, equalTo("Largest Blockchains in Crypto Ranked by TVL"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkH1MarketOverviewMarketOverviewText() {
        for (int i = 0; i < 3; i++) {
            try {
                String text = driver.findElement(h1MarketOverviewMarketOverview).getText();
                MatcherAssert.assertThat(text, equalTo("Crypto Market Overview"));
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
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
        for (int i = 0; i < 3; i++) {
            try {
                WebElement menuButton = driver.findElement(Header.cryptocurrenciesButton);
                Actions actions = new Actions(driver);
                actions.moveToElement(menuButton).perform();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkCryptocurrenciesMenuListSize() {
        List<WebElement> cryptocurrenciesMenuList = (List<WebElement>) driver.findElements(cryptocurrenciesSectionMenuListSize);
        int listSize = cryptocurrenciesMenuList.size();
        MatcherAssert.assertThat(listSize, equalTo(6));
    }

    @Step
    public void checkCryptocurrenciesRankingText() {
        String text = driver.findElement(cryptocurrenciesRanking).getText();
        MatcherAssert.assertThat(text, equalTo("Ranking"));
    }

    @Step
    public void clickRankingLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(cryptocurrenciesRanking).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkCryptocurrenciesCategoriesText() {
        String text = driver.findElement(cryptocurrenciesCategories).getText();
        MatcherAssert.assertThat(text, equalTo("Categories"));
    }

    @Step
    public void clickCategoriesLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(cryptocurrenciesCategories).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkCryptocurrenciesHistoricalSnapshotsText() {
        String text = driver.findElement(cryptocurrenciesHistoricalSnapshots).getText();
        MatcherAssert.assertThat(text, equalTo("Historical Snapshots"));
    }

    @Step
    public void clickHistoricalSnapshotsLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(cryptocurrenciesHistoricalSnapshots).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkCryptocurrenciesTokenUnlocksText() {
        String text = driver.findElement(cryptocurrenciesTokenUnlocks).getText();
        MatcherAssert.assertThat(text, equalTo("Token unlocks"));
    }

    @Step
    public void clickTokenUnlocksLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(cryptocurrenciesTokenUnlocks).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkCryptocurrenciesYieldText() {
        String text = driver.findElement(cryptocurrenciesYield).getText();
        MatcherAssert.assertThat(text, equalTo("Yield"));
    }

    @Step
    public void clickYieldLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(cryptocurrenciesYield).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
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
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsTrending).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickUpcomingLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsUpcoming).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickRecentlyAddedLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsRecentlyAdded).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickGainersLosersLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsGainersLosers).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickMostVisitedLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsMostVisited).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickCommunitySentimentLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsCommunitySentiment).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickChainRankingLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(leaderboardsChainRanking).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
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
        MatcherAssert.assertThat(listSize, equalTo(9));
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
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewMarketOverview).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickCoinMarketCap100IndexLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewCoinMarketCap100Index).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickFearGreedLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewFearGreedIndex).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickAltcoinSeasonIndexLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewAltcoinSeasonIndex).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickBitcoinDominanceLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewBitcoinDominance).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickCryptoETFsLink() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(marketOverviewCryptoETFs).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }




}

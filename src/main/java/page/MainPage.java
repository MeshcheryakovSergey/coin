package page;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.ApiSpecBuilder;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringStartsWith.startsWith;


public class MainPage {

    private final By logo = By.cssSelector("a[title='Go to homepage']");

    private final By userMenu = By.cssSelector("div[class*='UserDropdown_user-section-wrapper']>div[class*='BasePopover_base']");
    private final By lightButtonInUserMenu = By.cssSelector("li[data-index='tab-light']");

    private final By h1MainTitle = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1CryptocurrencyCategory = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1CryptocurrencyHistoricalSnapshots = By.cssSelector("div[class='cmc-main-section__content']>h1");
    private final By h1CryptocurrencyTokenUnlocks = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1CryptocurrencyYield = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");

    //h1 для leaderboards
    private final By h1LeaderboardsTrending = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsUpcoming = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsRecentlyAdded = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsGainersLosers = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsMostVisited = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsCommunitySentiment = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    private final By h1LeaderboardsChainRanking = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");

    //h1 для Market Overview
    private final By h1MarketOverviewMarketOverview = By.cssSelector("h1[class*='base-text']");
    private final By h1MarketOverviewCoinMarketCap100Index = By.cssSelector("h1[class*='base-text']");
    private final By h1MarketOverviewFearGreedIndex = By.cssSelector("h1[class*='base-text']");
    private final By h1MarketOverviewAltcoinSeasonIndex = By.cssSelector("h1[class*='base-text']");
    private final By h1MarketOverviewBitcoinDominance = By.cssSelector("h1[class*='base-text']");
    private final By h1MarketOverviewCryptoETFs = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");


    private final By cryptocurrenciesButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:first-child");
    private final By dexScanButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(2)");
    private final By exchangesButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(3)");
    private final By communityButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(4)");
    private final By productsButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(5)");

    private final By cryptocurrenciesButtonText = By.cssSelector("a[href='/']>div");
    private final By dexScanButtonText = By.cssSelector("div[data-role]>a[href='/dexscan/trending/all/']>div");
    private final By exchangesButtonText = By.cssSelector("div[data-role]>a[href='/rankings/exchanges/']>div");
    private final By communityButtonText = By.cssSelector("div[data-role]>a[href='/community/']>div");
    private final By productsButtonText = By.cssSelector("section>:nth-child(5)");
    private final By menuButtonSize = By.cssSelector("div[data-role='menu-item']");

    private final By cryptocurrenciesSectionText = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:first-child");
    private final By cryptocurrenciesSectionMenuListSize = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a");
    private final By leaderboardsSectionText = By.cssSelector("div[class='section leaderboards-section']>div:first-child");
    private final By leaderboardsSectionMenuListSize = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a");
    private final By marketOverviewText = By.cssSelector("div[class='section market-overview-section']>div:first-child");
    private final By marketOverviewMenuListSize = By.cssSelector("div[class='section market-overview-section']>div:nth-child(2)>a");

    //пункты меню в cryptocurrencies в столбце cryptocurrencies
    private final By cryptocurrenciesRanking = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:first-child");
    private final By cryptocurrenciesCategories = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(2)");
    private final By cryptocurrenciesHistoricalSnapshots = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(3)");
    private final By cryptocurrenciesTokenUnlocks = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(4)");
    private final By cryptocurrenciesYield = By.cssSelector("div[data-role='menu-item']:first-child div[class='section']:first-child>div:nth-child(2)>a:nth-child(5)");

    //пункты меню в cryptocurrencies в столбце leaderboards
    private final By leaderboardsTrending = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:first-child");
    private final By leaderboardsUpcoming = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(2)");
    private final By leaderboardsRecentlyAdded = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(3)");
    private final By leaderboardsGainersLosers = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(4)");
    private final By leaderboardsMostVisited = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(5)");
    private final By leaderboardsCommunitySentiment = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(6)");
    private final By leaderboardsChainRanking = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(7)");

    //пункты меню в cryptocurrencies в столбце Market Overview
    private final By marketOverviewMarketOverview = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:first-child");
    private final By marketOverviewCoinMarketCap100Index = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(2)");
    private final By marketOverviewFearGreedIndex = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(3)");
    private final By marketOverviewAltcoinSeasonIndex = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(4)");
    private final By marketOverviewBitcoinDominance = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(5)");
    private final By marketOverviewCryptoETFs = By.cssSelector("div[class='section leaderboards-section']>div:nth-child(2)>a:nth-child(6)");



    private final By portfolioButton = By.cssSelector("div>a[href='/portfolio-tracker/']");
    private final By watchlistButton = By.cssSelector("div>a[href='/watchlist/']");

    private final By searchString = By.cssSelector("div[class*='search-input-static']>:nth-child(2)");
    private final By textInSearchForm = By.cssSelector("div[class*='TrendingList_container']>div[class*='TrendingList_section']:not([class*='TrendingList_section-recent-search'])>div[class*='TrendingList_section-header_']");

    private final By appQrCode = By.cssSelector("div[class*='AppQRCodeBtn_app-download']");

    public By getAppQrCodeText() {
        return appQrCodeText;
    }

    private final By appQrCodeText = By.cssSelector("span[class*='AppQRCodeBtn_app-download__dropdown_text1']");

    private final By logInButton = By.cssSelector("button[data-btnname='Log In']");

    private final By forgotPasswordText = By.cssSelector("span[class='label-pwd']");




    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void clickUserMenu() {
        driver.findElement(userMenu).click();
    }

    @Step
    public void clickLightButtonInUserMenu() {
        driver.findElement(lightButtonInUserMenu).click();
    }

    @Step
    public void clickLogo() {
        driver.findElement(logo).click();
    }

    @Step
    public void checkCryptocurrenciesButtonText() {
        String text = driver.findElement(cryptocurrenciesButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrencies"));
    }

    @Step
    public void checkH1MainTitleText() {
        String text = driver.findElement(h1MainTitle).getText();
        MatcherAssert.assertThat(text, equalTo("Today's Cryptocurrency Prices by Market Cap"));
    }

    @Step
    public void checkH1CryptocurrencyCategoryText() {
        String text = driver.findElement(h1CryptocurrencyCategory).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrency Sectors by 24h Price Change"));
    }

    @Step
    public void checkH1CryptocurrencyHistoricalSnapshotsText() {
        String text = driver.findElement(h1CryptocurrencyHistoricalSnapshots).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrency Historical Data Snapshot"));
    }

    @Step
    public void checkH1CryptocurrencyTokenUnlocksText() {
        String text = driver.findElement(h1CryptocurrencyTokenUnlocks).getText();
        MatcherAssert.assertThat(text, equalTo("Token Unlock And Vesting Schedules"));
    }

    @Step
    public void checkH1CryptocurrencyYieldText() {
        String text = driver.findElement(h1CryptocurrencyYield).getText();
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
        MatcherAssert.assertThat(text, equalTo("TVL"));
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
    public void checkDexScanButtonText() {
        String text = driver.findElement(dexScanButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("DexScan"));
    }

    @Step
    public void checkCommunityButtonText() {
        String text = driver.findElement(communityButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("Community"));
    }

    @Step
    public void checkExchangesButtonText() {
        String text = driver.findElement(exchangesButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("Exchanges"));
    }

    @Step
    public void checkProductsButtonText() {
        String text = driver.findElement(productsButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("Products"));
    }

    @Step
    public void checkPortfolioButtonText() {
        String text = driver.findElement(portfolioButton).getText();
        MatcherAssert.assertThat(text, equalTo("Portfolio"));
    }

    @Step
    public void checkWatchlistButtonText() {
        String text = driver.findElement(watchlistButton).getText();
        MatcherAssert.assertThat(text, equalTo("Watchlist"));
    }

    @Step
    public void checkSearchStringText() {
        String text = driver.findElement(searchString).getText();
        MatcherAssert.assertThat(text, equalTo("Search"));
    }

    @Step
    public void checkOpeningSearchStringForm() {
        String text = driver.findElement(textInSearchForm).getText();
        MatcherAssert.assertThat(text, equalTo("Trending Crypto"));
    }

    @Step
    public void checkAppQrCodeText() {
        String text = driver.findElement(appQrCodeText).getText();
        MatcherAssert.assertThat(text, equalTo("Scan to Download CoinMarketCap App"));
    }

    @Step
    public void checkTextInLogInModal() {
        String text = driver.findElement(forgotPasswordText).getText();
        MatcherAssert.assertThat(text, equalTo("Forgot password?"));
    }

    @Step
    public void clickCryptocurrenciesButton() {
        driver.findElement(cryptocurrenciesButtonText).click();
    }

    @Step
    public void clickDexScanButton() {
        driver.findElement(dexScanButtonText).click();
    }

    @Step
    public void clickExchangesButton() {
        driver.findElement(exchangesButtonText).click();
    }

    @Step
    public void clickCommunityButton() {
        driver.findElement(communityButtonText).click();
    }

    @Step
    public void clickProductsButton() {driver.findElement(productsButtonText).click();}

    @Step
    public void clickPortfolioButton() {
        driver.findElement(portfolioButton).click();
    }

    @Step
    public void clickWatchlistButton() {
        driver.findElement(watchlistButton).click();
    }

    @Step
    public void clickSearchString() {
        driver.findElement(searchString).click();
    }

    @Step
    public void clickAppQrCode() {
        driver.findElement(appQrCode).click();
    }

    @Step
    public void clickLogInButton() {
        driver.findElement(logInButton).click();
    }

    @Step
    public void checkMenuButtonSize() {
        //findElements - с s на конце так как элементов больше 1
        List<WebElement> menuButtonElement = (List<WebElement>) driver.findElements(menuButtonSize);
        int menuSize = menuButtonElement.size();
        MatcherAssert.assertThat(menuSize, equalTo(5));
    }

    @Step
    public void checkCryptocurrenciesSectionText() {
        String text = driver.findElement(cryptocurrenciesSectionText).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrencies"));
    }

    //наведение на элемент
    @Step
    public void hoverCryptocurrenciesButton() {
        WebElement menuButton = driver.findElement(cryptocurrenciesButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuButton).perform();
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
        MatcherAssert.assertThat(listSize, equalTo(6));
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

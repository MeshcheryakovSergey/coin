package page.main;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.ApiSpecBuilder;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;

public class Header {

    public final static By h1MainTitle = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");


    public final static By h1CryptocurrencyCategory = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1CryptocurrencyHistoricalSnapshots = By.cssSelector("div[class='cmc-main-section__content']>h1");
    public final static By h1CryptocurrencyTokenUnlocks = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");
    public final static By h1CryptocurrencyYield = By.cssSelector("h1[class*='SummaryHeader_main-title']>span");

    public final static By cryptocurrenciesButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:first-child");
    public final static By dexScanButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(2)");
    public final static By exchangesButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(3)");
    public final static By communityButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(4)");
    public final static By productsButton = By.cssSelector("section[data-hydration-on-demand]>div[data-role]:nth-child(5)");

    public final static By mainCryptocurrenciesButtonText = By.cssSelector("a[href='/']>div");
    public final static By dexScanButtonText = By.cssSelector("div[data-role]>a[href='https://dex.coinmarketcap.com/token/all/']>div");
    public final static By exchangesButtonText = By.cssSelector("div[data-role]>a[href='/rankings/exchanges/']>div");
    public final static By communityButtonText = By.cssSelector("div[data-role]>a[href='/community/']>div");
    public final static By productsButtonText = By.cssSelector("section>:nth-child(5)");
    public final static By menuButtonSize = By.cssSelector("div[data-role='menu-item']");

    public final static By portfolioButton = By.cssSelector("div>a[href='//coinmarketcap.com/portfolio-tracker/']");
    public final static By watchlistButton = By.cssSelector("div>a[href='//coinmarketcap.com/watchlist/']");

    public final static By searchString = By.cssSelector("div[class*='search-input-static']>:nth-child(2)");
    public final static By textInSearchForm = By.cssSelector("div[class*='TrendingList_container']>div[class*='TrendingList_section']:not([class*='TrendingList_section-recent-search'])>div[class*='TrendingList_section-header_']");
    public final static By searchInput = By.cssSelector("div[class*='search-box'] input");


    public final static By appQrCode = By.cssSelector("div[class*='AppQRCodeBtn_app-download']");
    public By getAppQrCodeText() {return appQrCodeText;}
    public final static By appQrCodeText = By.cssSelector("span[class*='AppQRCodeBtn_app-download__dropdown_text1']");
    public final static By logInButton = By.cssSelector("button[data-btnname='Log In']");
    public final static By forgotPasswordText = By.cssSelector("span[class='label-pwd']");

    public final static By userMenu = By.cssSelector("div[class*='UserDropdown_user-section-wrapper']>div[class*='BasePopover_base']");
    public final static By lightButtonInUserMenu = By.cssSelector("li[data-index='tab-light']");

    public final static By dexCryptocurrenciesButtonText = By.cssSelector("a[href='https://coinmarketcap.com/']>div");



    private final WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void checkCryptocurrenciesButtonText() {
        String text = driver.findElement(mainCryptocurrenciesButtonText).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrencies"));
    }

    @Step
    public void checkH1MainTitleText() {
        String text = driver.findElement(h1MainTitle).getText();
        MatcherAssert.assertThat(text, equalTo("Today's Cryptocurrency Prices by Market Cap"));
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
    public void mainClickCryptocurrenciesButton() {
        driver.findElement(mainCryptocurrenciesButtonText).click();
    }

    @Step
    public void dexClickCryptocurrenciesButton() {
        driver.findElement(dexCryptocurrenciesButtonText).click();
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
    public void clickUserMenu() {
        driver.findElement(userMenu).click();
    }

    @Step
    public void clickLightButtonInUserMenu() {
        driver.findElement(lightButtonInUserMenu).click();
    }

    @Step
    public void checkMenuButtonSize() {
        //findElements - с s на конце так как элементов больше 1
        List<WebElement> menuButtonElement = (List<WebElement>) driver.findElements(menuButtonSize);
        int menuSize = menuButtonElement.size();
        MatcherAssert.assertThat(menuSize, equalTo(5));
    }

    @Step
    public void pasteInSearchInput() {
        driver.findElement(searchInput).click();
        Actions actions = new Actions(driver);
        // Нажимаем Ctrl + V для Windows/Linux или Cmd + V для macOS
        actions.keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    @Step
    public void checkSearchInputValue() {
        WebElement input = driver.findElement(searchInput);
        String inputValue = input.getAttribute("value");
        String actualValue = "https://coinmarketcap.com/currencies/bitcoin/";
        MatcherAssert.assertThat(inputValue, equalTo(actualValue));
    }


}

package page;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    private final By cryptocurrenciesButton = By.cssSelector("a[href='/']>div");
    private final By dexScanButton = By.cssSelector("div[data-role]>a[href='/dexscan/trending/all/']>div");
    private final By exchangesButton = By.cssSelector("div[data-role]>a[href='/rankings/exchanges/']>div");
    private final By communityButton = By.cssSelector("div[data-role]>a[href='/community/']>div");
    private final By productsButton = By.cssSelector("section>:nth-child(5)");
    private final By menuButtonSize = By.cssSelector("div[data-role='menu-item']");

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
        String text = driver.findElement(cryptocurrenciesButton).getText();
        MatcherAssert.assertThat(text, equalTo("Cryptocurrencies"));
    }

    @Step
    public void checkH1MainTitleText() {
        String text = driver.findElement(h1MainTitle).getText();
        MatcherAssert.assertThat(text, equalTo("Today's Cryptocurrency Prices by Market Cap"));
    }

    @Step
    public void checkDexScanButtonText() {
        String text = driver.findElement(dexScanButton).getText();
        MatcherAssert.assertThat(text, equalTo("DexScan"));
    }

    @Step
    public void checkCommunityButtonText() {
        String text = driver.findElement(communityButton).getText();
        MatcherAssert.assertThat(text, equalTo("Community"));
    }

    @Step
    public void checkExchangesButtonText() {
        String text = driver.findElement(exchangesButton).getText();
        MatcherAssert.assertThat(text, equalTo("Exchanges"));
    }

    @Step
    public void checkProductsButtonText() {
        String text = driver.findElement(productsButton).getText();
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
        driver.findElement(cryptocurrenciesButton).click();
    }

    @Step
    public void clickDexScanButton() {
        driver.findElement(dexScanButton).click();
    }

    @Step
    public void clickExchangesButton() {
        driver.findElement(exchangesButton).click();
    }

    @Step
    public void clickCommunityButton() {
        driver.findElement(communityButton).click();
    }

    @Step
    public void clickProductsButton() {driver.findElement(productsButton).click();}

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
        //findElements - с s на конце так как элементов не сколько
        List<WebElement> menuButtonElement = (List<WebElement>) driver.findElements(menuButtonSize);
        int menuSize = menuButtonElement.size();
        MatcherAssert.assertThat(menuSize, equalTo(5));
    }

}

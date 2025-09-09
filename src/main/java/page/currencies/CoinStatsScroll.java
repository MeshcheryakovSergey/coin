package page.currencies;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.ApiSpecBuilder;

import java.time.Duration;

import static org.hamcrest.Matchers.*;

public class CoinStatsScroll {

    public final static By coinLogo = By.cssSelector("div[data-role*='coin-logo']>img");
    public final static By coinName = By.cssSelector("h1>span[data-role*='coin-name']");
    public final static By coinSymbol = By.cssSelector("span[data-role*='coin-symbol']");
    public final static By coinNum = By.cssSelector("div[data-role*='chip-content-item']>span");
    public final static By coinNumAria = By.cssSelector("h1>div[class*='popover-base']");
    public final static By coinWatchlistLink = By.cssSelector("div[data-role='btn-content-item']>svg>use[href='#star']");
    public final static By coinWatchlistNum = By.cssSelector("div[class*='coin-stats-header'] div[data-role='btn-content-item']>span[class*='base-text']");
    public final static By coinWatchlistPlace = By.cssSelector("div[class*='coin-stats-header']>div>div[class*='popover-base']");
    public final static By coinShareURL = By.cssSelector("button svg>use[href='#share']");
    public final static By coinShareButton = By.cssSelector("div[data-role='el']>button");

    //Share modal
    public final static By shareImg = By.cssSelector("div[class*='cmc-modal-body'] img[src='https://s2.coinmarketcap.com/static/img/coins/64x64/1.png']");
    public final static By shareBoldText = By.cssSelector("div[class*='cmc-modal-body'] h2");
    public final static By shareSmallText = By.cssSelector("div[class*='cmc-modal-body'] p[class='sub']");
    public final static By shareLinkText = By.cssSelector("div[class*='cmc-modal-body'] p[class='font_size_12']");
    public final static By shareLink = By.cssSelector("div[class*='cmc-modal-body'] p[class='input'] input");
    public final static By shareCopyButton = By.cssSelector("div[class*='cmc-modal-body'] p[class='input'] button");
    public final static By shareCloseButton = By.cssSelector("div[class*='cmc-modal']>svg");


    public final static By coinPrice = By.cssSelector("span[data-test='text-cdp-price-display']");
    public final static By coinPricePercent = By.cssSelector("div[class*='alignBaseline'] div[data-role='percentage-value']");

    //coin-metrics-table
    public final static By coinMarketCap = By.cssSelector("div[data-role='group-item']:first-child dt>div>div>div");
    public final static By coinMarketCapPopover = By.cssSelector("div[data-role='group-item']:first-child span[data-role='explainer']");
    public final static By coinVolume24 = By.cssSelector("div[data-role='group-item']:nth-child(2) dt>div>div>div");
    public final static By coinVolume24Popover = By.cssSelector("div[data-role='group-item']:nth-child(2) span[data-role='explainer']");
    public final static By coinFDV = By.cssSelector("div[data-role='group-item']:nth-child(3) dt>div>div div");
    public final static By coinFDVPopover = By.cssSelector("div[data-role='group-item']:nth-child(3) span[data-role='explainer']");
    public final static By coinVolMktCap24 = By.cssSelector("div[data-role='group-item']:nth-child(4) dt>div>div div");
    public final static By coinVolMktCap24Popover = By.cssSelector("div[data-role='group-item']:nth-child(4) span[data-role='explainer']");
    public final static By coinTotalSupply = By.cssSelector("div[data-role='group-item']:nth-child(5) dt>div>div>div");
    public final static By coinTotalSupplyPopover = By.cssSelector("div[data-role='group-item']:nth-child(5) span[data-role='explainer']");
    public final static By coinMaxSupply = By.cssSelector("div[data-role='group-item']:nth-child(6) div>div>div>div>div");
    public final static By coinMaxSupplyPopover = By.cssSelector("div[data-role='group-item']:nth-child(6) span[data-role='explainer']");
    public final static By coinCirculatingSupply = By.cssSelector("div[data-role='group-item']:nth-child(7) dt>div>div div");
    public final static By coinCirculatingSupplyPopover = By.cssSelector("div[data-role='group-item']:nth-child(7) span[data-role='explainer']");
    public final static By coinCirculatingSupplyVerIcon = By.cssSelector("div[data-role='group-item']:nth-child(7) span[data-test='icon-verified-circulating-supply-explainer'] use");
    public final static By coinCirculatingSupplyVerIconPopover = By.cssSelector("div[data-role='group-item']:nth-child(7) span[data-test='icon-verified-circulating-supply-explainer']");
    public final static By coinProfileScore = By.cssSelector("div[data-role='group-item']:nth-child(8)>div>div:first-child>div:first-child");
    public final static By coinProfileScorePopover = By.cssSelector("div[data-role='group-item']:nth-child(8) div[class*='popover-base']");

    //coin-info-links
    public final static By coinWebsite = By.cssSelector("div[data-test='section-coin-stats-website']>div:first-child>div>div");
    public final static By coinSocials = By.cssSelector("div[data-test='section-coin-stats-socials']>div:first-child>div>div");
    public final static By coinRatings = By.cssSelector("div[data-test='section-coin-stats-ratings']>div:first-child>div>div");
    public final static By coinExplorers = By.cssSelector("div[data-test='section-coin-stats-explorers']>div:first-child>div>div");
    public final static By coinWallets = By.cssSelector("div[data-test='section-coin-stats-wallets']>div:first-child>div>div");
    public final static By coinUcid = By.cssSelector("div[data-test='section-coin-stats-ucid']>div>div>div");
    public final static By coinUcidPopover = By.cssSelector("div[data-test='section-coin-stats-ucid'] span[data-test='icon-ucid-explainer']");

    public final static By coinCoinConverter = By.cssSelector("div[class*='coin-converter'] span");

    //nav-wrapper
    public final static By coinNavChart = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:first-child span");
    public final static By coinNavChartHelp = By.cssSelector("div[data-test='section-chart'] div[class*='fadestyle-gradient']:first-child li[data-index='tab-marketCap']>div>div>h5");
    public final static By coinNavMarkets = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:nth-child(2)  span");
    public final static By coinNavMarketsHelp = By.cssSelector("li[data-index='tab-cex'] div[class*='tab-inner-label']>div>h5");
    public final static By coinNavNews = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:nth-child(3)  span");
    public final static By coinNavNewsHelp = By.cssSelector("li[data-index='tab-latest'] div[class*='tab-inner-label']>div>h5");
    public final static By coinNavYield = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:nth-child(4)  span");
    public final static By coinNavYieldHelp = By.cssSelector("li[data-index='tab-defi'] div[class*='tab-inner-label']>div>h5");
    public final static By coinNavMarketCycles = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:nth-child(5)  span");
    public final static By coinNavMarketCyclesHelp = By.cssSelector("div[data-test='section-market-cycles']>div>div>a");
    public final static By pageCryptoMarketCycleIndicatorsTitle = By.cssSelector("div[class='grid']>div>div:nth-child(2)>div>div>div>div");

    public final static By coinNavAbout = By.cssSelector("div[class*='cdp-navbar-scroll-container']>div:nth-child(6)  span");
    public final static By coinNavAboutHelp = By.cssSelector("div[class='mobile-coin-video-wrapper']>section>div>div:first-child div[class*='top']>div[class*='right']");





    private final WebDriver driver;

    public CoinStatsScroll(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void checkСoinLogo() {
        WebElement imglogo = driver.findElement(coinLogo);
        String imgUrl = imglogo.getAttribute("src");
        String actualLogoURL = "https://s2.coinmarketcap.com/static/img/coins/64x64/1.png";
        MatcherAssert.assertThat(imgUrl, equalTo(actualLogoURL));
    }

    public void checkCoinName() {
        String text = driver.findElement(coinName).getText();
        MatcherAssert.assertThat(text, equalTo("Bitcoin"));
    }

    public void checkCoinSymbol() {
        String text = driver.findElement(coinSymbol).getText();
        MatcherAssert.assertThat(text, equalTo("BTC"));
    }

    public void checkCoinNumber() {
        String text = driver.findElement(coinNum).getText();
//        System.out.println("text: "+text);
        MatcherAssert.assertThat(text, equalTo("#1"));
    }

    @Step
    public void checkCoinNumToolTipText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement coinNumText = driver.findElement(coinNumAria);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(coinNumText).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(coinNumText, "aria-describedby"));
                    String styleAttribute = coinNumText.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElement = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"']>div>div>div"));
                        String text = descriptionElement.getText();
                        String regexPattern = "^Ranked 1st out of all \\d{1,3}(?:,\\d{3})* active cryptocurrencies listed on CoinMarketCap\\.$";
                        MatcherAssert.assertThat(text, matchesPattern(regexPattern));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkWatchlistLink() {
        WebElement watchlist = driver.findElement(coinWatchlistLink);
        String link = watchlist.getAttribute("href");
        String actualLink = "#star";
        MatcherAssert.assertThat(link, equalTo(actualLink));
    }

    public void checkWatchlistNum() {
        String text = driver.findElement(coinWatchlistNum).getText();
        String regexPattern = "^\\dM$";
        MatcherAssert.assertThat(text, matchesPattern(regexPattern));
    }

    @Step
    public void checkWatchlistToolTipText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement watchlistText = driver.findElement(coinWatchlistPlace);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(watchlistText).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(watchlistText, "aria-describedby"));
                    String styleAttribute = watchlistText.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"']>div>div>div>div span:first-child "));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("Add Bitcoin to your watchlist."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"']>div>div>div>div span:nth-child(2)"));
                        String textP2 = descriptionElementP2.getText();
                        String regexPattern = "^\\dM watchlists on CoinMarketCap include Bitcoin\\.$";
                        MatcherAssert.assertThat(textP2, matchesPattern(regexPattern));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkShareLinkImg() {
        WebElement imgShare = driver.findElement(coinShareURL);
        String imgUrl = imgShare.getAttribute("href");
        String actualImgURL = "#share";
        MatcherAssert.assertThat(imgUrl, equalTo(actualImgURL));
    }

    @Step
    public void clickCoinShareButton() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinShareButton).click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }


    @Step
    public void checkShareImg() {
        WebElement imgShare = driver.findElement(shareImg);
        String imgSrc = imgShare.getAttribute("src");
        String actualImgSrc = "https://s2.coinmarketcap.com/static/img/coins/64x64/1.png";
        MatcherAssert.assertThat(actualImgSrc, equalTo(imgSrc));
    }

    public void checkShareBoltText() {
        String text = driver.findElement(shareBoldText).getText();
        MatcherAssert.assertThat(text, equalTo("Share it with your friends"));
    }

    @Step
    public void checkShareSmallText() {
        String text = driver.findElement(shareSmallText).getText();
        String regexPattern = "^The price of Bitcoin is \\$\\d{1,3}(?:,\\d{3})*(?:\\.\\d+)?!$";
        MatcherAssert.assertThat(text, matchesPattern(regexPattern));
    }

    @Step
    public void checkShareLinkText() {
        String text = driver.findElement(shareLinkText).getText();
        MatcherAssert.assertThat(text, equalTo("Or copy link"));
    }

    @Step
    public void checkShareLinkValue() {
        WebElement link = driver.findElement(shareLink);
        String linkValue = link.getAttribute("value");
        String actualLink = "https://coinmarketcap.com/currencies/bitcoin/";
        MatcherAssert.assertThat(linkValue, equalTo(actualLink));
    }

    @Step
    public void clickShareCopyButton() {
        driver.findElement(shareCopyButton).click();
    }

    @Step
    public void clickShareCloseButton() {
        driver.findElement(shareCloseButton).click();
    }

    @Step
    public void checkCoinPrice() {
        String text = driver.findElement(coinPrice).getText();
        String regexPattern = "^\\$\\d{1,3}(?:,\\d{3})*(?:\\.\\d+)?$";
        MatcherAssert.assertThat(text, matchesPattern(regexPattern));
    }

    @Step
    public void checkCoinPercentage() {
        String text = driver.findElement(coinPricePercent).getText();
        String regexPattern = "^\\d+(?:\\.\\d+)?%.*$";
        MatcherAssert.assertThat(text, matchesPattern(regexPattern));
    }

    @Step
    public void checkGroupItemMarketCapText() {
        String text = driver.findElement(coinMarketCap).getText();
//      System.out.println("text: "+text);
        MatcherAssert.assertThat(text, equalTo("Market cap"));
    }

    //проверил сразу 3 элемента
    @Step
    public void checkGroupItemMarketCapPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement marketCapPopover = driver.findElement(coinMarketCapPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(marketCapPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(marketCapPopover, "aria-describedby"));
                    String styleAttribute = marketCapPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-market-cap-explainer']>div:first-child"));
                        System.out.println("text: "+descriptionElementP1);
                        String textP1 = descriptionElementP1.getText();
                        System.out.println("text: "+textP1);
                        MatcherAssert.assertThat(textP1, equalTo("The total market value of a cryptocurrency's circulating supply. It is analogous to the free-float capitalization in the stock market."));
                        //хз почему nth-child(3), но так находит нужный элемент
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-market-cap-explainer']>div:nth-child(3)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("Market cap = Current price x Circulating supply"));
                        WebElement descriptionElementP3 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-market-cap-explainer'] a"));
                        String textP3 = descriptionElementP3.getText();
                        MatcherAssert.assertThat(textP3, equalTo("More about market cap"));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemVolumeText() {
        String text = driver.findElement(coinVolume24).getText();
        MatcherAssert.assertThat(text, equalTo("Volume (24h)"));
    }

    @Step
    public void checkGroupItemVolumePopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement volumeCapPopover = driver.findElement(coinVolume24Popover);                    Actions actions = new Actions(driver);
                    actions.moveToElement(volumeCapPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(volumeCapPopover, "aria-describedby"));
                    String styleAttribute = volumeCapPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-volume-explainer'] div"));
                        System.out.println("text: "+descriptionElementP1);
                        String textP1 = descriptionElementP1.getText();
                        System.out.println("text: "+textP1);
                        MatcherAssert.assertThat(textP1, equalTo("A measure of how much of a cryptocurrency was traded in the last 24 hours."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-volume-explainer'] a"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("Read More"));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemFDVText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinFDV));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("FDV"));
    }

    @Step
    public void checkGroupItemFDVPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement fdvPopover = driver.findElement(coinFDVPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(fdvPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(fdvPopover, "aria-describedby"));
                    String styleAttribute = fdvPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-fully-diluted-mcap-explainer'] div:first-child"));
                        System.out.println("text: "+descriptionElementP1);
                        String textP1 = descriptionElementP1.getText();
                        System.out.println("text: "+textP1);
                        MatcherAssert.assertThat(textP1, equalTo("The market cap if the max supply was in circulation."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-volume-explainer'] div:nth-child(3)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("Fully-diluted value (FDV) = price x max supply. If max supply is null, FDV = price x total supply. if max supply and total supply are infinite or not available, fully-diluted market cap shows - -."));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemVolMktCapText() {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinVolMktCap24));
                String text = element.getText();
                MatcherAssert.assertThat(text, equalTo("Vol/Mkt Cap (24h)"));
    }

    @Step
    public void checkGroupItemVolMktCapPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement volMktCapPopover = driver.findElement(coinVolMktCap24Popover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(volMktCapPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(volMktCapPopover, "aria-describedby"));
                    String styleAttribute = volMktCapPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-volume-mcap-explainer'] div:first-child"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("Indicator of liquidity. The higher the ratio, the more liquid the cryptocurrency is, which should make it easier for it to be bought/sold on an exchange close to its value."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-volume-mcap-explainer'] div:nth-child(2)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("Cryptocurrencies with a low ratio are less liquid and most likely present less stable markets."));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemTotalSupplyText() {
        //не получается найти элемент на странице, пришлось использовать ожидание
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinTotalSupply));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Total supply"));
    }

    @Step
    public void checkGroupItemTotalSupplyPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement totalSupplyPopover = driver.findElement(coinTotalSupplyPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(totalSupplyPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(totalSupplyPopover, "aria-describedby"));
                    String styleAttribute = totalSupplyPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='" + styleAttribute + "'] div[data-test='tooltip-total-supply-explainer'] div:first-child"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("Total supply = Total coins created - coins that have been burned (if any) It is comparable to outstanding shares in the stock market."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='" + styleAttribute + "'] div[data-test='tooltip-total-supply-explainer'] div:nth-child(3)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("If the project did not submit this data nor was it verified by CoinMarketCap, total supply shows “--”."));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }


    @Step
    public void checkGroupItemMaxSupplyText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinMaxSupply));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Max. supply"));
    }

    @Step
    public void checkGroupItemMaxSupplyPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement maxSupplyPopover = driver.findElement(coinMaxSupplyPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(maxSupplyPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(maxSupplyPopover, "aria-describedby"));
                    String styleAttribute = maxSupplyPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-max-supply-explainer'] div:first-child"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("The best approximation of the maximum amount of coins that will exist in the forthcoming lifespan of the cryptocurrency, minus any coins that have been verifiably burned. This is also known as the theoretical max number of coins that can be minted, minus any coins that have been verifiably burned."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-max-supply-explainer'] div:nth-child(3)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("If the project did not submit this data nor was it verified by CoinMarketCap, max. supply shows \"--\"."));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemCirculatingSupplyText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinCirculatingSupply));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Circulating supply"));
    }

    @Step
    public void checkGroupItemCirculatingSupplyPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement circulatingSupplyPopover = driver.findElement(coinCirculatingSupplyPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(circulatingSupplyPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(circulatingSupplyPopover, "aria-describedby"));
                    String styleAttribute = circulatingSupplyPopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-circulating-supply-explainer'] div"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("The amount of coins that are circulating in the market and are in public hands. It is analogous to the flowing shares in the stock market."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-circulating-supply-explainer'] a"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("Read More"));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemCirculatingSupplyVerIcon() {
        WebElement verIcon = driver.findElement(coinCirculatingSupplyVerIcon);
        String verIconHref = verIcon.getAttribute("href");
        String actualImgURL = "#verified";
        MatcherAssert.assertThat(verIconHref, equalTo(actualImgURL));
    }

    @Step
    public void checkGroupItemCirculatingSupplyVerIconPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement circulatingSupplyVerIconPopover = driver.findElement(coinCirculatingSupplyVerIconPopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(circulatingSupplyVerIconPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(circulatingSupplyVerIconPopover, "aria-describedby"));
                    String styleAttribute = circulatingSupplyVerIconPopover.getAttribute("aria-describedby");

                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-verified-circulating-supply-explainer']>div span"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("Verified Data"));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-test='tooltip-verified-circulating-supply-explainer']>span"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("The CoinMarketCap team has verified the project's circulating supply."));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkGroupItemProfileScoreText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinProfileScore));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Profile score"));
    }

    @Step
    public void checkGroupItemProfileScorePopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement profileScorePopover = driver.findElement(coinProfileScorePopover);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(profileScorePopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(profileScorePopover, "aria-describedby"));
                    String styleAttribute = profileScorePopover.getAttribute("aria-describedby");
                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block'] div[data-role='pp-item']"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("The profile score is a measure of the completeness and freshness of the data provided by the project to CoinMarketCap. Information that is missing or incomplete, for example missing token unlocks or project description, will lower the profile score of the cryptocurrency.\n\nProjects that want to sign up for the Self Reporting Dashboard (SRD) to add missing information can do so here." ));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block'] div[data-role='pp-item'] a"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("here"));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                }
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void checkInfoLinkWebsiteText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinWebsite));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Website"));
    }

    @Step
    public void checkInfoLinkSocialsText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinSocials));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Socials"));
    }

    @Step
    public void checkInfoLinkRatingText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinRatings));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Rating"));
    }

    @Step
    public void checkInfoLinkExplorersText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinExplorers));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Explorers"));
    }

    @Step
    public void checkInfoLinkWalletsText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinWallets));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("Wallets"));
    }

    @Step
    public void checkInfoLinkUCIDText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(coinUcid));
        String text = element.getText();
        MatcherAssert.assertThat(text, equalTo("UCID"));
    }

    @Step
    public void checkInfoLinkUCIDPopoverText(){
        try {
            for (int i = 0; i < 3; i++) {
                try {
                    WebElement ucidPopover = driver.findElement(coinUcidPopover);
                    WebElement converter = driver.findElement(coinCoinConverter);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(converter).perform();
                    actions.moveToElement(ucidPopover).perform();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.attributeToBeNotEmpty(ucidPopover, "aria-describedby"));
                    String styleAttribute = ucidPopover.getAttribute("aria-describedby");
                    System.out.println("styleAttribute: "+styleAttribute);

                    if (styleAttribute != null) {
                        WebElement descriptionElementP1 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block'] div div:first-child"));
                        String textP1 = descriptionElementP1.getText();
                        MatcherAssert.assertThat(textP1, equalTo("The Unified Cryptoasset ID (UCID) assigns a unique ID to each cryptoasset to minimize any confusion that may arise from assets that share identical tickers/symbols. The goal is to build a unified registry so as to work towards harmonized API standards and interoperability within this space."));
                        WebElement descriptionElementP2 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block'] div div:nth-child(3)"));
                        String textP2 = descriptionElementP2.getText();
                        MatcherAssert.assertThat(textP2, equalTo("The UCID is equivalent to the CoinMarketCap ID in our API."));
                        WebElement descriptionElementP3 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block']>div span:nth-child(5) a"));
                        String textP3 = descriptionElementP3.getText();
                        MatcherAssert.assertThat(textP3, equalTo("More info about UCID"));
                        WebElement descriptionElementP4 = driver.findElement(By.cssSelector("div[id*='"+styleAttribute+"'] div[data-role='pp-modal-block']>div span:nth-child(8) a"));
                        String textP4 = descriptionElementP4.getText();
                        MatcherAssert.assertThat(textP4, equalTo("More about the CoinMarketCap API"));
                        break;
                    }
                } catch (org.openqa.selenium.StaleElementReferenceException e) {}
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка, не связанная с StaleElement: " + e.getMessage());
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickChartTab() {
        driver.findElement(coinNavChart).click();
    }

    @Step
    public void checkOpenChartTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavChartHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickMarketsTab() {
        driver.findElement(coinNavMarkets).click();
    }

    @Step
    public void checkOpenMarketsTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavMarketsHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickNewsTab() {
        driver.findElement(coinNavNews).click();
    }

    @Step
    public void checkOpenNewsTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavNewsHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickYieldTab() {
        driver.findElement(coinNavYield).click();
    }

    @Step
    public void checkOpenYieldTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavYieldHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickMarketCyclesTab() {
        driver.findElement(coinNavMarketCycles).click();
    }

    @Step
    public void checkOpenMarketCyclesTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavMarketCyclesHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        String text = driver.findElement(pageCryptoMarketCycleIndicatorsTitle).getText();
        MatcherAssert.assertThat(text, containsString("Crypto Market Cycle Indicators"));
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }

    @Step
    public void clickAboutTab() {
        driver.findElement(coinNavAbout).click();
    }

    @Step
    public void checkOpenAboutTab() {
        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(coinNavAboutHelp).click();
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {}
        }
        throw new IllegalStateException("Не удалось выполнить проверку после нескольких попыток.");
    }


}

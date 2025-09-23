package UI;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.currencies.CoinStatsScroll;
import page.main.Header;
import page.main.MainPage;

public class CurrenciesCoinStatsScrollTest extends DriverRule {

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Check coin logo img URL")
    public void checkLogoURL(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkСoinLogo();
    }

    @Test
    @DisplayName("Check coin name")
    public void checkCoinName(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinName();
    }

    @Test
    @DisplayName("Check coin symbol")
    public void checkCoinSymbol(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinSymbol();
    }

    @Test
    @DisplayName("Check coin number")
    public void checkCoinNumber(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinNumber();
    }

    @Test
    @DisplayName("Check text on Coin number tooltip ")
    public void checkTextOnCoinNumToolTip(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinNumToolTipText();
    }

    @Test
    @DisplayName("Check watchlist link")
    public void checkWatchlistLink(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkWatchlistLink();
    }

    @Test
    @DisplayName("Check watchlist num")
    public void checkWatchlistNum(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkWatchlistNum();
    }

    @Test
    @DisplayName("Check text on Coin watchlist tooltip")
    public void checkTextOnCoinWatchlistToolTipPart1(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkWatchlistToolTipText();
    }

    @Test
    @DisplayName("Check share link img")
    public void checkShareLinkImg(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkShareLinkImg();
    }

    @Test
    @DisplayName("Check share img")
    public void checkShareImg(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.checkShareImg();
    }

    @Test
    @DisplayName("Check share bolt text")
    public void checkShareBoltText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.checkShareBoltText();
    }

    @Test
    @DisplayName("Check share small text")
    public void checkShareSmallText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.checkShareSmallText();
    }

    @Test
    @DisplayName("Check share link text")
    public void checkShareLinkText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.checkShareLinkText();
    }

    @Test
    @DisplayName("Check share link value")
    public void checkShareLinkValue(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.checkShareLinkValue();
    }

    @Test
    @DisplayName("Check share copy button")
    public void checkShareCopyButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickCoinShareButton();
        coinStats.clickShareCopyButton();
        coinStats.clickShareCloseButton();
        Header header = new Header(driver);
        header.clickSearchString();
        header.pasteInSearchInput();
        header.checkSearchInputValue();
    }

    @Test
    @DisplayName("Check coin price")
    public void checkCoinPriceNum(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinPrice();
    }

    @Test
    @DisplayName("Check coin percentage")
    public void checkCoinPercentageValue(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkCoinPercentage();
    }

    @Test
    @DisplayName("Check Market cap text")
    public void checkMarketCapText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemMarketCapText();
    }

    @Test
    @DisplayName("Check Market cap popover text")
    public void checkMarketCapPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemMarketCapPopoverText();
    }

    @Test
    @DisplayName("Check Volume text")
    public void checkVolumeText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemVolumeText();
    }

    @Test
    @DisplayName("Check Volume popover text")
    public void checkVolumePopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemVolumePopoverText();
    }

    @Test
    @DisplayName("Check FDV text")
    public void checkFDVText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemFDVText();
    }

    @Test
    @DisplayName("Check FDV popover text")
    public void checkFDVPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemFDVPopoverText();
    }

    @Test
    @DisplayName("Check VolMktCap24 text")
    public void checkVolMktCap24Text(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemVolMktCapText();
    }

    @Test
    @DisplayName("Check VolMktCap24 popover text")
    public void checkVolMktCap24PopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemVolMktCapPopoverText();
    }

    @Test
    @DisplayName("Check Total Supply text")
    public void checkTotalSupplyText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemTotalSupplyText();
    }

    @Test
    @DisplayName("Check Total Supply popover text")
    public void checkTotalSupplyPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemTotalSupplyPopoverText();
    }

    @Test
    @DisplayName("Check Max Supply text")
    public void checkMaxSupplyText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemMaxSupplyText();
    }

    @Test
    @DisplayName("Check Max Supply popover text")
    public void checkMaxSupplyPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemMaxSupplyPopoverText();
    }

    @Test
    @DisplayName("Check Circulating Supply text")
    public void checkCirculatingSupplyText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemCirculatingSupplyText();
    }

    @Test
    @DisplayName("Check Circulating Supply popover text")
    public void checkCirculatingSupplyPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemCirculatingSupplyPopoverText();
    }

    @Test
    @DisplayName("Check Circulating Supply Ver Icon")
    public void checkCirculatingSupplyVerIcon(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemCirculatingSupplyVerIcon();
    }

    @Test
    @DisplayName("Check Circulating Supply Ver Icon popover text")
    public void checkCirculatingSupplyVerIconPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemCirculatingSupplyVerIconPopoverText();
    }

    @Test
    @DisplayName("Check Profile Score text")
    public void checkProfileScoreText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemProfileScoreText();
    }

    @Test
    @DisplayName("Check Profile Score popover text")
    public void checkProfileScorePopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkGroupItemProfileScorePopoverText();
    }

    @Test
    @DisplayName("Check Website text")
    public void checkWebsiteText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkWebsiteText();
    }

    @Test
    @DisplayName("Check Socials text")
    public void checkSocialsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkSocialsText();
    }

    @Test
    @DisplayName("Check Rating text")
    public void checkRatingText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkRatingText();
    }

    @Test
    @DisplayName("Check Explorers text")
    public void checkExplorersText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkExplorersText();
    }

    @Test
    @DisplayName("Check Wallets text")
    public void checkWalletsText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkWalletsText();
    }

    @Test
    @DisplayName("Check UCID text")
    public void checkUCIDText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkUCIDText();
    }

    @Test
    @DisplayName("Check UCID popover text")
    public void checkUCIDPopoverText(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.checkInfoLinkUCIDPopoverText();
    }

    @Test
    @DisplayName("Check open Chart Tab")
    public void checkOpenChartTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickMarketCyclesTab();
        coinStats.clickChartTab();
        coinStats.checkOpenChartTab();
    }

    @Test
    @DisplayName("Check open Markets Tab")
    public void checkOpenMarketsTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickMarketsTab();
        coinStats.checkOpenMarketsTab();
    }

    @Test
    @DisplayName("Check open News Tab")
    public void checkOpenNewsTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickNewsTab();
        coinStats.checkOpenNewsTab();
    }

    @Test
    @DisplayName("Check open Yield Tab")
    public void checkOpenYieldTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickYieldTab();
        coinStats.checkOpenYieldTab();
    }

    @Test
    @DisplayName("Check open Market Cycles Tab")
    public void checkOpenMarketCyclesTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickMarketCyclesTab();
        coinStats.checkOpenMarketCyclesTab();
    }

    @Test
    @DisplayName("Check open About Tab")
    public void checkOpenAboutTab(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstCoin();
        CoinStatsScroll coinStats = new CoinStatsScroll(driver);
        coinStats.clickAboutTab();
        coinStats.checkOpenAboutTab();
    }

}

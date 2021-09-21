import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestAbstract{
    @BeforeMethod
    public void settingUp() {
        openSite();
    }

    @Test
    public void searchBagAndClickOnThirdItem(){
        POMHeader headerPage = new POMHeader(driver);
        POMSearchResultPage searchResultPage = new POMSearchResultPage(driver);
        POMMainPage mainPage = new POMMainPage(driver);

        mainPage.closeCouponPopupButtonClick();
        mainPage.closeWebPushPopupButtonClick();

        headerPage.searchBarInputSetText("nylon shoulder bag");
        headerPage.searchBarButtonClick();

        searchResultPage.closeCouponButtonClick();
        searchResultPage.freeShippingCheckboxClick();
        searchResultPage.searchResultItemClickByNumber(3);

        takeScreenshot();
    }

    @AfterMethod
    public void endTest() {
        closeDriver();
    }
}

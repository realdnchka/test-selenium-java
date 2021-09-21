import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class SearchTest extends TestAbstract{
    @BeforeMethod
    public void settingUp() {
        openSite();
    }

    @Test
    public void searchBagAndClickOnThirdItem() throws IOException {
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

        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));

        takeScreenshot();
    }

    @AfterMethod
    public void endTest() {
        closeDriver();
    }
}

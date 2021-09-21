import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMMainPage {
    //selectors
    private By closeCouponPopupButton = By.xpath("//button[contains(@class, 'close')]");
    private By closeWebPushPopupButton = By.xpath("//img[contains(@class, 'webpushClose')]");

    //init
    WebDriver driver;
    POMMainPage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void closeCouponPopupButtonClick() {
        driver.findElement(closeCouponPopupButton).click();
    }
    public void closeWebPushPopupButtonClick() {
        driver.findElement(closeWebPushPopupButton).click();
    }
}

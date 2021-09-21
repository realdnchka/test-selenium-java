import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class POMSearchResultPage {
    //selectors
    private By freeShippingCheckbox = By.xpath("//span[@class = 'feature-wrap']/span[2]//input");;
    private By searchResultItemsList = By.xpath("//li[@class = 'list-item']");
    private By closeCouponButton = By.xpath("//a[@class = 'next-dialog-close']");
    private By overlay = By.xpath("//div[contains(@class, 'next-overlay')]");

    //init
    WebDriver driver;
    WebDriverWait wait;
    POMSearchResultPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    //methods
    public void searchResultItemClickByNumber(int number) {
        waitForOverlayDisappear();
        List<WebElement> elements = driver.findElements(searchResultItemsList);
        elements.get(number - 1).click();
    }
    public void freeShippingCheckboxClick() {
        WebElement element = driver.findElement(freeShippingCheckbox);
        element.click();
    }
    public void closeCouponButtonClick(){
        List<WebElement> element = driver.findElements(closeCouponButton);
        if (!element.isEmpty()) {
            element.get(0).click();
        }
    }
    public void waitForOverlayDisappear() {
        wait.until(ExpectedConditions.presenceOfElementLocated(overlay));
        WebElement overlayElement = driver.findElement(overlay);
        wait.until(ExpectedConditions.invisibilityOf(overlayElement));
    }
}

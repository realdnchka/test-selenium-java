import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMHeader {
    //elements
    private By searchBarInput = By.xpath("//input[contains(@class, 'Header_SearchInput')]");
    private By searchBarButton = By.xpath("//button[contains(@class, 'Header_SearchSection')]");

    //init
    WebDriver driver;
    POMHeader(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void searchBarInputSetText(String text) {
        driver.findElement(searchBarInput).sendKeys(text);
    }
    public void searchBarButtonClick() {
        driver.findElement(searchBarButton).click();
    }
}

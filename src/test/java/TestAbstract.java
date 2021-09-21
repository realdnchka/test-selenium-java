import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;


public abstract class TestAbstract {
    protected WebDriver driver = new ChromeDriver();
    protected String url = "https://www.aliexpress.com/";

    public void openSite() {
        driver.get(url);
    }

    public void closeDriver() {
        driver.quit();
    }

    public void takeScreenshot() {
        new AShot().takeScreenshot(driver);
    }
}

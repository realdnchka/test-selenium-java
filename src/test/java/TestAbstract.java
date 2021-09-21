import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public abstract class TestAbstract {
    protected WebDriver driver = new ChromeDriver();
    protected String url = "https://www.aliexpress.com/";

    public void openSite() {
        driver.get(url);
    }

    public void closeDriver() {
        driver.quit();
    }

    public void takeScreenshot() throws IOException {
        Screenshot screenshot = new AShot().takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "png", new File("./screenshot.png"));
    }
}

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class SeleniumTest1 {

    @Test

    void openChrome(){
        System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.de/");
    }
}

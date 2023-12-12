package basisDatei;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class basis {
    public static WebDriver driver;
    public String baseUrl;

    @BeforeSuite
    public void setUp() {
        if (driver == null) {
            System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://www.ebay.de/";

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
            driver.get(baseUrl);
        }
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}
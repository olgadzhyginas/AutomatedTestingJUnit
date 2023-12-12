import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorEbay {

    public static void main(String[] args) {

        System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.de/");

        driver.findElement(By.id("gh-ac")).sendKeys("Hose");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        driver.findElement(By.xpath("//a[@aria-label='Ihr Warenkorb']")).click();
        driver.findElement(By.xpath("//a[contains(@aria-label,'Ihr Warenkorb')]")).click();


    }
}

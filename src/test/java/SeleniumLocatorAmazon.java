import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorAmazon {

    public static void main(String[] args) {

        System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Handy");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

    }
}
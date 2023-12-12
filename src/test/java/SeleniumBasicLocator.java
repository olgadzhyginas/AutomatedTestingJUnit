import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicLocator {

    public static void main(String[] args) {

        //System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.crome.driver", "C:\\Program Files\\Chrome_for_testing\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.de");

        driver.findElement(By.id("L2AGLb")).click();
        //driver.findElement(By.id("APjFqb")).sendKeys("Hallo Welt");
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Über G")).click();
        //driver.findElement(By.xpath("//a[text()='Über Google']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Über G')]")).click();

        driver.navigate().back();

        String title = driver.getTitle();
        System.out.println("Titel der Seite ist:" + title);
        String url1 = driver.getCurrentUrl();
        System.out.println("Url ist:" + url1);
    }
    }



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.id;

public class TestNGAnnotation {
    private WebDriver driver;
    private String url;

    @BeforeClass
    public void TestNG () {
        System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://fmp-test.eureka5.de/home/login.xhtml?faces-redirect=true";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);

    }


    @Test(priority = 1)
    public void login(){
        driver.findElement(id("login:username")).sendKeys("AST3_1");
        driver.findElement(id("login:password")).sendKeys("testen99x*");
        driver.findElement(id("login:anmelden")).click();
    }


    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(3000);
    }

}

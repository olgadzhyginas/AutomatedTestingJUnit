import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.reporters.JUnitXMLReporter;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.*;

public class Testfall_Ebay {
    private WebDriver driver;
    private String url;

    @BeforeClass
    public void TestNG () {
        System.setProperty("webdriver.crome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://www.ebay.de/";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test (priority = 1)
    public void TMQA_T13() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("Hose");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

//        WebElement radioButtonBlau = driver.findElement(By.xpath("//input[@aria-label='Blau']"));
//        radioButtonBlau.click();
//        Thread.sleep(3000);
        //Assert.assertTrue(radioButtonBlau.isSelected());     //Überprüfen, ob radioButton angeklickt wurde

    }
    @Test (priority = 2)
            public void Select() {
        Select Kategorie = new Select(driver.findElement(xpath("//*[contains(@id,'gh-cat') and contains(@name,'_sacat')]")));
        Kategorie.selectByValue("260");

        // Überprüfen, ob die ausgewählte Option mit einem erwarteten Wert übereinstimmt
        String expectedValue = "260";
        String selectedOptionValue = Kategorie.getFirstSelectedOption().getAttribute("value");

        // Überprüfen und Ausgabe auf der Konsole
        if (expectedValue.equals(selectedOptionValue)) {
            System.out.println("Die erwartete Option wurde ausgewählt.");
        } else {
            System.out.println("Die erwartete Option wurde nicht ausgewählt.");
        }
    }

    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}

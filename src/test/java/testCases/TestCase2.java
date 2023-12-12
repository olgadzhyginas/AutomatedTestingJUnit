package testCases;

import basisDatei.basis;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class TestCase2 extends basis {


    @Test (priority = 1)
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

    @Test (priority = 2)
    public void print2(){
        System.out.println("Es ist TestCase2");
    }

}


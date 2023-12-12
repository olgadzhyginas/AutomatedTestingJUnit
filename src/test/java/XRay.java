import org.testng.Assert;
import org.testng.annotations.Test;


public class XRay {

    @Test
    public void testAddition() {
        // Testfall für die Addition von Zahlen
        int a = 5;
        int b = 10;
        int expectedResult = 16;

        int result = a + b;
        Assert.assertEquals(result, expectedResult, "Fehler beim Addiren von Zahlen");
    }

    @Test
    public void testMultiplication() {
        // Testfall für die Multiplikation von Zahlen
        int a = 3;
        int b = 7;
        int expectedResult = 21;

        int result = a*b;
        Assert.assertEquals(result, expectedResult, "Fehler beim Multiplizieren von Zahlen");
    }

}
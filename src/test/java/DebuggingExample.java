import org.testng.annotations.Test;

public class DebuggingExample {

    @Test
    public void Summe() {
        int a = 5;
        int b = 7;

        int sum = a + b;

        System.out.println("Die Summe ist: " + sum);

//        if (sum == 12) {
//            System.out.println("Die Summe ist korrekt.");
//        } else {
//            System.out.println("Die Summe ist falsch.");
//        }

        // Überprüfen Sie, ob die Summe gleich 12 ist und lösen Sie eine Ausnahme aus, wenn nicht
        assert sum == 12 : "Die Summe ist nicht gleich 12.";
    }
}


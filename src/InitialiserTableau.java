import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import static java.lang.Long.SIZE;

public class InitialiserTableau {
    private static int[] tableau = new int[SIZE];

    public static void initialiserTableau() {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");

        int[] tableauSelection = new int[SIZE];
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);
    }
}

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


public class Main {
    private static int SIZE = Integer.MAX_VALUE / 1000 ;;
    private static int[] tableau = new int[SIZE];
    public static void main(String[] args) {
        long temps = 0;
        InitialiserTableau.initialiserTableau();
        int[] tri = copierTableaux();
        Instant start = Instant.now();
        for (int k = 4; k < 5; k++){
            //Selection.triSelection(tri); // marche pas
            Insertion.triInsertion(tri);
            Bulles.triBulles(tri);
            QuickSort.quicksort(tri,0,SIZE-1);
            triJava(tri);
        }

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        temps = duration/5;
        System.out.println("Le temps moyen pour les tris est de " + temps + " ms.");
    }


    public static int[] copierTableaux(){
        int[] tri = new int[SIZE];
        System.arraycopy(tableau, 0, tri, 0, SIZE);
        return tri;
    }



    public static void triJava(int[] tableau){

        Arrays.sort(tableau);

    }

}
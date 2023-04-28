public class Bulles {
    public static void triBulles(int[] tableau) {

        boolean estTrie = false;
        while (!estTrie) {
            estTrie = true;
            for (int i = 1; i < tableau.length; i++) {
                if (tableau[i - 1] > tableau[i]) {
                    int swap = tableau[i - 1];
                    tableau[i - 1] = tableau[i];
                    tableau[i] = swap;
                    estTrie = false;
                }
            }
        }
    }
}



public class Insertion {
    public static void triInsertion(int[] tableau) {

        for (int i = 1; i < tableau.length; i++) {
            int value = tableau[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (tableau[j] > value) {
                    tableau[j + 1] = tableau[j];
                    index = j;
                } else {
                    break;
                }
            }
            tableau[index] = value;
        }
    }
}

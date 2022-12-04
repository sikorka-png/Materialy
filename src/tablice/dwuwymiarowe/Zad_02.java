package tablice.dwuwymiarowe;

/**
 * Utwórz program, który odczyta wartości idąc zygzakiem. Spodziewany efekt:
 * 1, 5, 9, 13, 14, 10, 6, 2, 3, 7, 11, 15, 16, 12, 8, 4
 * int[][] arr = {
 *             {1, 2, 3, 4},
 *             {5, 6, 7, 8},
 *             {9, 10, 11, 12},
 *             {13, 14, 15, 16}
 *     };
 */
public class Zad_02 {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(array[j][i] + " ");
                } else {
                    System.out.print(array[array.length - j - 1][i] + " ");
                }
            }
            System.out.println();
        }

    }
}

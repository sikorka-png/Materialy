package tablice.dwuwymiarowe;

/**
 * Zdefiniuj w programie dwuwymiarową tablice intów, na przykład:
 *
 * int[][] arr = {
 * {1,3},
 * {3,4,5,8},
 * {6,8},
 * {1,9,6}
 * };
 *
 * a następnie utwórz tablice o wymiarze arr.length której elementy będą równe największym elementom
 * poszczególnych „wierszy” tablicy arr (oczywiście, program powinien działać niezależnie od tego,
 * jak te tablice zdefiniujemy).
 */
public class Zad_03 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {3, 4, 5, 8},
                {6, 8},
                {1, 9, 6},
        };
        int[] resultTab = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            resultTab[i] = max;
        }

        System.out.println("Rezultat");
        for (int i = 0; i < resultTab.length; i++) {
            System.out.print(resultTab[i] + " ");
        }
    }
}

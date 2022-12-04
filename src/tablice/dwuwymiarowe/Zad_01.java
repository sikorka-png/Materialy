package tablice.dwuwymiarowe;

/**
 * Utwórz tablicę 2 wymiarową kwadratową (taka sama ilość kolumn i wierszy),
 * następnie napisz program, który wypisze wartości znajdujące się na obu przekątnych tej tablicy.
 */
public class Zad_01 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 32, 33},
        };

        System.out.println("Pierwszy sposob");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Drugi sposob");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length-i-1] + " ");
        }
    }
}

package tablice.dwuwymiarowe;

/**
 * Dana jest dwuwymiarowa tablica rozmiaru n x n, gdzie n jest liczbą parzystą, np.
 * int[ ][ ] tab = {
 * { 1 , 2 , 3 , 4 },
 * { 5 , 6 , 7 , 8 },
 * { 9 , 10 , 11 , 12 },
 * { 13 , 14 , 15 , 16 }
 * };
 *
 * Napisz program zamieniający tablicę tab na postać podaną jak poniżej.
 * {
 * { 16 , 15 , 14 , 13 },
 * { 12 , 11 , 10 , 9 } ,
 * { 8 , 7 , 6 , 5 },
 *        { 4 , 3 , 2 , 1 }
 * };
 */
public class Zad_06 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < tab.length / 2; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int tmp = tab[i][j];
                tab[i][j] = tab[tab.length - 1 - i][tab.length - 1 - j];
                tab[tab.length - 1 - i][tab.length - 1 - j] = tmp;
            }
        }

        System.out.println("Rezultat");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}

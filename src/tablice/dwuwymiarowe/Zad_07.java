package tablice.dwuwymiarowe;

/**
 * Dana jest dwuwymiarowa tablica elementów typu int, w której wiersze mają różne długości, np.
 * int[ ][ ] tab = {
 * { 4 , 6 , 5 },
 * { 7 , 9 , 10 , 8 },
 * { 3 , 2 },
 * { 1 }
 * };
 *
 * Napisz program zamieniający tablicę tab na postać podaną jak poniżej (wiersze są posortowane względem liczby elementów).
 *
 * {
 * { 1 },
 * { 3 , 2 },
 * { 4 , 6 , 5},
 * { 7 , 9 , 10 , 8 }
 * };
 */
public class Zad_07 {
    public static void main(String[] args) {
        int[][] tab = {
                {4, 6, 5},
                {7, 9, 10, 8},
                {3, 2},
                {1}
        };

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j].length > tab[j+1].length) {
                    int [] tmpTab = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmpTab;
                }
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

package tablice.dwuwymiarowe;

/**
 * Dana jest dwuwymiarowa kwadratowa tablica jak w poniższym przykładzie.
 *
 * int[ ][ ] tab = {
 * { 1 , 2 , 3 , 4 },
 * { 5 , 6 , 7 , 8 },
 * { 9 , 10 , 11 , 12 },
 * { 13 , 14 , 15 , 16 }
 * };
 * Napisz program wyświetlający wartości minimalne z wszystkich wierszy, kolumn oraz dwóch przekątnych tablicy tab.
 */
public class Zad_05 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Minimalna wartosc z przekatnej (od gornej, lewej strony)");
        int min = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][i] < min) {
                min = tab[i][i];
            }
        }
        System.out.println(min);

        System.out.println("Minimalna wartosc z przekatnej (od dolnej, lewej strony)");
        min = tab[tab.length - 1][0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[tab.length - 1 - i][i] < min) {
                min = tab[tab.length - 1 - i][i];
            }
        }
        System.out.println(min);

        int [] minRows = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {

            }
        }
    }
}

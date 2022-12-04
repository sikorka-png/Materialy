package metody.rekurencyjne;

/**
 * Stwórz rekurencyjną metodę, której zadaniem będzie wypisanie całej zawartości tablicy.
 */
public class Zad_02 {
    public static void main(String[] args) {
        int tab[] = new int[]{1, 8, 11, 997, 991};
        System.out.println("Pierwszy sposob");
        wyswietlTabliceRekurencyjnie(tab, tab.length - 1);

        System.out.println();

        System.out.println("Drugi sposob");
        wyswietlTabliceRekurencyjnie2(tab, 0);
    }

    public static void wyswietlTabliceRekurencyjnie(int tab[], int x) {
        System.out.print(tab[x] + " ");
        if (x >= 1) {
            wyswietlTabliceRekurencyjnie(tab, x - 1);
        }
    }

    public static void wyswietlTabliceRekurencyjnie2(int tab[], int x) {
        System.out.print(tab[x] + " ");
        if (x < tab.length - 1) {
            wyswietlTabliceRekurencyjnie2(tab, x + 1);
        }
    }
}

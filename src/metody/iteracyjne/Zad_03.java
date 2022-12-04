package metody.iteracyjne;

/**
 * Utwórz metodę convertFromBinary, która przyjmę jako tablice typu int wypełnioną zerami i jedynkami,
 * a rezultatem metody będzie zwrócenie wartości w systemie dziesiętnym.
 */
public class Zad_03 {
    public static void main(String[] args) {
        int tab[] = {0, 1, 0, 1, 1};
        System.out.println(converFromBinary(tab));
    }

    public static int converFromBinary(int tab[]) {
        int liczba = 0;
        for (int i = tab.length - 1, j = 1; i >= 0; i--, j *= 2) {
            liczba += tab[i] * j;
        }
        return liczba;
    }
}

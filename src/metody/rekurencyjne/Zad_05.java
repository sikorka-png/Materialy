package metody.rekurencyjne;

/**
 * Utwórz metodę rekurencyjną, która przy wprowadzeniu liczby parzystej wyświetli wszystkie liczby parzyste mniejsze
 * od niej i analogicznie zadziała w przypadku liczby nieparzystej.
 */
public class Zad_05 {
    public static void main(String[] args) {
        wyswietlMniejszeLiczby(7);
    }

    public static void wyswietlMniejszeLiczby(int a) {
        if (a == 1 || a == 2) {
            System.out.println(a);
        } else {
            System.out.println(a);
            wyswietlMniejszeLiczby(a - 2);
        }
    }
}

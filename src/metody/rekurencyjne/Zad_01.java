package metody.rekurencyjne;

/**
 * Stwórz metodę, która w sposób rekurencyjny, wyświetli wszystkie liczby całkowite, od podanego argumentu do 0
 */
public class Zad_01 {
    public static void main(String[] args) {
        wyswietLiczbeRekurencyjnie(10);
    }

    public static void wyswietLiczbeRekurencyjnie(int liczba) {
        System.out.println("Zaczynam metode dla liczba = " + liczba);
        if (liczba > 1) {
            wyswietLiczbeRekurencyjnie(liczba - 1);
        }
        System.out.println(liczba);
        System.out.println("Koncze metode dla liczba = " + liczba);
    }
}

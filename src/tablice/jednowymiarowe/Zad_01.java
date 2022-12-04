package tablice.jednowymiarowe;

/**
 * Zadeklaruj tablicę zmiennych typu double o rozmiarze 10 elementów, następnie:
 * -	wypełnił tablicę losowymi liczbami
 * -	wyświetl na ekranie zawartość całej tablicy
 * -	wyświetl na ekranie tylko liczby o parzystym indeksie
 * -	wyświetl na ekranie tylko elementy tablicy, których przekonwertowane na int wartości są nieparzyste
 */
public class Zad_01 {
    public static void main(String[] args) {
        double[] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = Math.random() * 101;
        }

        System.out.println("Cała tablica");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + array[i]);
        }

        System.out.println("Parzyste indeksy");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i + " " + array[i]);
        }

        System.out.println("Wartości nieparzyste");
        for (int i = 0; i < 10; i++) {
            if ((int) (array[i]) % 2 != 0) {
                System.out.println(i + " " + array[i]);
            }
        }
    }
}

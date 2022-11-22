package bity.zamiany_systemów;

/**
 * Przedstaw program, który dokona przesunięcia bitowego wartości 14:
 * -o zero pozycji w prawo,
 * -rezultat poprzedniego punktu o dwie pozycje w lewo,
 * -rezultat poprzedniego punktu o 4 pozycje w prawo.
 */
public class Zad_06 {
    public static void main(String[] args) {
        int x = 14;
        //o zero pozycji w prawo
        x = x >> 0;
        System.out.println("x >> 0 = " + x);

        //rezultat poprzedniego punktu o dwie pozycje w lewo
        x = x << 2;
        System.out.println("x << 2 = " + x);

        //rezultat poprzedniego punktu o 4 pozycje w prawo
        x = x >> 4;
        System.out.println("x >> 4 = " + x);
    }
}

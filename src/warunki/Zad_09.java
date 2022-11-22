package warunki;

/**
 * Wynikiem działania polecenia Math.random() jest pseudolosowa wartość z zakresu 0 do 1 typu double.
 * Utwórz program wykonujący 5 losowań, za każdym razem sprawdzając czy w puli ostatnich 3 losowań wszystkie wartości były większe od 0.2.
 * Zadanie zrealizuj nie wykorzystując pętli.
 */
public class Zad_09 {
    public static void main(String[] args) {
        double w1, w2, w3, w4, w5;
        w1 = Math.random();
        w2 = Math.random();
        w3 = Math.random();
        System.out.println(
                (w1 > 0.2 && w2 > 0.2 && w3 > 0.2) ? "Trzy ostatnie liczby byly wieksze od 0.2" : "Nie byly wieksze od 0.2"
        );
        w4 = Math.random();
        System.out.println(
                (w2 > 0.2 && w3 > 0.2 && w4 > 0.2) ? "Trzy ostatnie liczby byly wieksze od 0.2" : "Nie byly wieksze od 0.2"
        );
        w5 = Math.random();
        System.out.println(
                (w3 > 0.2 && w4 > 0.2 && w5 > 0.2)  ? "Trzy ostatnie liczby byly wieksze od 0.2" : "Nie byly wieksze od 0.2"
        );
        System.out.println("Wartosc w1 " + w1);
        System.out.println("Wartosc w2 " + w2);
        System.out.println("Wartosc w3 " + w3);
        System.out.println("Wartosc w4 " + w4);
        System.out.println("Wartosc w5 " + w5);
    }
}

package bity.zmienne;

/**
 * Dane jest wyrażenie:
 * int x = 2 * 5 + 3 * 4 - 8;
 * Jaki jest rezultat tych operacji?
 * Zmodyfikuj kolejność działań (dodając nawiasy) tak, aby rezultatem była wartość 48.
 */
public class Zad_03 {
    public static void main(String[] args) {
        int x = 2 * 5 + 3 * 4 - 8;
        System.out.println("Wynik operacji: 2 * 5 + 3 * 4 - 8 to: " + x);
        x = 2 * ((5 + 3) * 4 - 8);
        System.out.println("Wynik operacji: 2 * ((5 + 3) * 4 - 8) to: " + x);
    }
}

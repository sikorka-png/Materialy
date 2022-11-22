package bity.zmienne;

/**
 * Zadeklaruj i zainicjuj dowolnymi znakami dwie zmienne typu char nadając im nazwy:
 * -	charValue,
 * -	charvalue.
 * Zanim skompilujesz program zastanów się, czy rzeczywiście się on skompiluje?
 * Przypuszczenia zapisz w komentarzu blokowym i sprawdź czy były poprawne.
 * Następnie odejmij jedną zmienną od drugiej, a wynik wyświetl na ekranie.
 */
public class Zad_01 {
    public static void main(String[] args) {
        char charValue = 'b';
        char charvalue = 'a';
		/*
		Java jest jezykiem programowania, ktory jest case sensitive, wiec powyzszy program sie
		skompiluje i poprawnie wykona.

		Printuje wartości ASCII!
		*/
        System.out.println(charValue - charvalue);
    }
}

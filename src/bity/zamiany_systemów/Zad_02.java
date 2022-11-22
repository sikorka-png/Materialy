package bity.zamiany_systemów;

/**
 * Wybierz dowolną liczbę z przedziału [0 - 2147483647] i zamień ją na wartość w systemie:
 * -dwójkowym
 * -ósemkowym
 * -szesnastkowym
 * Na przykładzie tej liczby, przedstaw przypisanie jej do zmiennej typu int w każdym z powyższych systemów.
 */
public class Zad_02 {
    public static void main(String[] args) {
        int decimal = 231;
        int binary = 0b11100111;
        int octal = 0347;
        int hex = 0xE7;
        System.out.println("Decimal " + decimal);
        System.out.println("Binary " + binary);
        System.out.println("Octal " + octal);
        System.out.println("Hex " + hex);
    }
}

package bity.zamiany_systemów;

/**
 * Zadeklaruj i zainicjuj dwie zmienne typu int z których pierwsza będzie miała wartość 25.
 * Następnie wylicz wartość drugiej zmiennej tak aby rezultatem alternatywy obu zmiennych była wartość 29.
 */
public class Zad_08 {
    public static void main(String[] args) {
        // 29 = 11101
        int int25 = 0b11001;
        int intX = 0b100;

        System.out.println("int25=" + int25);
        System.out.println("intX = " + intX);
        System.out.println("int25 & intX = " + (int25|intX));
    }
}

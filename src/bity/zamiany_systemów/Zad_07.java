package bity.zamiany_systemów;

/**
 * Zadeklaruj i zainicjuj dwie zmienne typu int z których pierwsza będzie miała wartość 12.
 * Następnie wylicz wartość drugiej zmiennej tak aby rezultatem koniunkcji obu zmiennych była wartość 8
 */
public class Zad_07 {
    public static void main(String[] args) {
        // 8 = 1000
        int int12 = 0b1100; //12
        int intX = 0b1000;

        System.out.println("int12 = " + int12);
        System.out.println("intX = " + intX);
        System.out.println("int12 & intX = " + (int12&intX));
    }
}

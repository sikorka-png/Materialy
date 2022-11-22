package bity.zamiany_systemów;

/**
 * Zamień następujące liczby w systemach podanych w indeksie dolnym na system dziesiętny.
 * -001100012
 * -000101102
 * -010110002
 * -11012
 * -558
 * -208
 * -628
 * -6716
 * -CC16
 * -A916
 */
public class Zad_03 {
    public static void main(String[] args) {
        System.out.println("001100012 decimal " + 0b00110001);
        System.out.println("00010110 decimal " + 0b00010110);
        System.out.println("01011000 decimal " + 0b01011000);
        System.out.println("1101 decimal " + 0b1101);
        System.out.println("55 decimal " + 055);
        System.out.println("20 decimal " + 020);
        System.out.println("62 decimal " + 062);
        System.out.println("67 decimal " + 0x67);
        System.out.println("CC decimal " + 0xCC);
        System.out.println("A9 decimal " + 0xA9);
    }
}

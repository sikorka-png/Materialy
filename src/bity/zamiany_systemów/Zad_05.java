package bity.zamiany_systemów;

/**
 * Dana jest wartość 165. Utwórz program wyświetlający na ekranie tę wartość z wykorzystaniem literału:
 * -binarnego (system dwójkowy),
 * -oktalnego (system ósemkowy),
 * -heksadecymalnego (system szesnastkowy).
 */
public class Zad_05 {
    public static void main(String[] args) {
        int myInt = 165;
        int myInt2 = 0b10100101;
        int myInt8 = 0245;
        int myInt16 = 0xa5;

        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt8);
        System.out.println(myInt16);
    }
}

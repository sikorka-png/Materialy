package pętle.fori;

/**
 * Napisz program, który wykorzystując pętle utworzy trójkąt składający się z literału: *.
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Zad_03 {
    public static void main(String[] args) {
        int ascii = 42;
        char symbol = (char) (ascii);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

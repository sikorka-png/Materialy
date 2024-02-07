package pętle.fori;

/**
 * Korzystając z pętli stwórz mozaikę:
 * 11111111111
 * 12222222221
 * 12333333321
 * 12344444321
 * 12345554321
 * 12345654321
 * 12345554321
 * 12344444321
 * 12333333321
 * 12222222221
 * 11111111111
 */
public class Zad_12 {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                if ((i > 1 && j <= i && i < 7) || (i >= 7 && j < 13 - i)) {
                    System.out.print(j);
                } else if (j >= 12 - i && i < 7) {
                    System.out.print(12 - j);
                } else {
                    if (i < 7) {
                        System.out.print(i);
                    } else {
                        if (i >= i * 2 - j) {
                            System.out.print(12 - j);
                        } else {
                            System.out.print(12 - i);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

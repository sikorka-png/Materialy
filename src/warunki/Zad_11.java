package warunki;

/**
 * Dane są cztery zmienne typu int o wartościach W, X, Y, Z. Utwórz program, który obliczy sumę wszystkich wartości.
 * Jeżeli wartość sumy będzie większa od A należy wyświetlić tylko wartości, których 5 bit jest jedynką.
 * W przeciwnym przypadku należy wyświetlić tylko te liczby, których koniunkcja bitowa z wartością A4 będzie wartością mniejszą od 5.
 */
public class Zad_11 {
    public static void main(String[] args) {
        int W = 1;
        int X = 5;
        int Y = 2;
        int Z = 2;
        int A = 0xA;
        int sum = W + X + Y + Z;

        if (sum > A) {
            if ((W & 0b010000) == 0b010000) {
                System.out.println(W);
            }
            if ((X & 0b010000) == 0b010000) {
                System.out.println(X);
            }
            if ((Y & 0b010000) == 0b010000) {
                System.out.println(Y);
            }
            if ((Z & 0b010000) == 0b010000) {
                System.out.println(Z);
            }
        } else {
            //switch() {}
            if ((W & 0xA4) < 5) {
                System.out.println(W);
            }
            if ((X & 0xA4) < 5) {
                System.out.println(X);
            }
            if ((Y & 0xA4) < 5) {
                System.out.println(Y);
            }
            if ((Z & 0xA4) < 5) {
                System.out.println(Z);
            }
        }
    }
}

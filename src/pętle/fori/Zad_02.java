package pętle.fori;

/**
 * Dana jest zmienna int wrt. Napisz program,
 * który wyświetlał wartości będące wynikiem mnożenia kolejnej wartości zmiennej pętli i zmiennej wrt.
 */
public class Zad_02 {
    public static void main(String[] args) {
        int wrt = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * wrt);
        }
    }
}

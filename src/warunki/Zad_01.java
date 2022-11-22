package warunki;

/**
 * Napisz program, który sprawdzi czy wprowadzona w poprzednim zadaniu wartość należy do poniższych przedziałów.
 * -A = [0,∞)
 * -B = (−∞, 1]
 * -C = [0, 1]
 */
public class Zad_01 {
    public static void main(String[] args) {
        int x = 48;
        if (x <= 1) {
            System.out.println("B");
            if (x >= 0) {
                System.out.println("C");
            }
        }
        if (x >= 0) {
            System.out.println("A");
        }
    }
}

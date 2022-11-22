package pętle.fori;

/**
 * Mamy zmienną int o wartości 1212501072 w wartości tej zostały zakodowane 4 litery w taki sposób,
 * że na każdych 8 bitach zmiennej int została zakodowana jedna litera w systemie ASCII napisz program,
 * który odkoduje wiadomość.
 */
public class Zad_08 {
    public static void main(String[] args) {
        int wrt = 1212501072;

        for (int i = 0, mask = 0b11111111, shift = 8 * 3; i < 4; i++, shift -= 8) {
            int subResutl = wrt >> shift;
            subResutl &= mask;
            char resutl = (char) subResutl;
            System.out.println(resutl);
        }
    }
}

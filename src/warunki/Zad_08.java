package warunki;

/**
 * Zadeklaruj zmienną typu byte i zainicjuj wartością 170. Następnie wykorzystując operatory bitowe sprawdź:
 * -czy wartość ta jest parzysta,
 * -czy wszystkie bity na parzystych pozycjach mają wartość 1.
 * Wykorzystaj operator ternarny, aby zbudować odpowiedź wyświetlaną na konsoli.
 * Zadanie zrealizuj nie wykorzystując pętli.
 */
public class Zad_08 {
    public static void main(String[] args) {
        byte b = (byte) 170;
        System.out.println(
                ((b & 0b00000001) == 0b00000001) ? "Liczba nieparzysta":"Liczba parzysta"
        );
        System.out.println(
                ((b & 0b10101010) == 0b10101010) ? "Wszystkie bity parzryste maja wartosc 1":"Nie wszystkie bity maja wartosc 1"
        );
    }
}

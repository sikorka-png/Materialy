package warunki;

/**
 * Wynikiem działania polecenia Math.random() jest pseudolosowa wartość z zakresu 0 do 1.
 * Utwórz program, który wypełni wszystkie 8 bitów zmiennej byte kolejnymi wynikami losowań.
 * Przyjmij, że jeżeli wylosowana wartość jest mniejsza niż 0.5 należy wstawić wartość 1 a w przeciwnym wypadku 0.
 * Wartość wyniku wyświetl na ekranie.
 */
public class Zad_10 {
    public static void main(String[] args) {
        byte myByte = 0b00000000;
        byte value = 1;
        for (int i = 0; i < 8; i++) {
            double random = Math.random();
            if (random < 0.5) {
                myByte = (byte) (myByte | value);
                value *= 2;
            }
        }
        System.out.println(myByte);
    }
}

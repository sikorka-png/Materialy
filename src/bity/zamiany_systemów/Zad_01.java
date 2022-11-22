package bity.zamiany_systemów;

/**
 * Napisz program w którym znajdą się:
 * -deklaracje zmiennych wszystkich typów prostych
 * -ich inicjalizacje, odpowFiadającymi im literałami
 * program powinien wypisywać wartość każdej zmiennej w osobnej linii.
 */
public class Zad_01 {
    public static void main(String[] args) {

        System.out.println("Integer");
        int myInt = 5; // decimal-form literal
        int myInt2 = 0b101; // binary-form literal
        int myInt8 = 05; // octal-form literal
        int myInt16 = 0x5; // hex-form literal

        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt8);
        System.out.println(myInt16);

        System.out.println(Integer.BYTES + " wielkosc w bajtach");
        System.out.println(Integer.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Integer.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nByte");
        byte myByte = 5;

        System.out.println(myByte);

        System.out.println(Byte.BYTES + " wielkosc w bajtach");
        System.out.println(Byte.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Byte.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nShort");
        byte myShort = 5;

        System.out.println(myShort);

        System.out.println(Short.BYTES + " wielkosc w bajtach");
        System.out.println(Short.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Short.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nLong");
        long myLong = 5l;

        System.out.println(myLong);

        System.out.println(Long.BYTES + " wielkosc w bajtach");
        System.out.println(Long.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Long.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nCharacter");
        char myChar = 'A';
        char myCharU = '\u0041'; //uninode
        char myCharUD = 65; //ascii

        System.out.println(myChar);
        System.out.println(myCharU);
        System.out.println(myCharUD);

        System.out.println(Character.BYTES + " wielkosc w bajtach");
        System.out.println(Character.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Character.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nFloating-point single precision");
        float myFloat = 2.5f;

        System.out.println(myFloat);

        System.out.println(Float.BYTES + " wielkosc w bajtach");
        System.out.println(Float.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Float.MIN_VALUE + " minimalna wartosc");


        System.out.println("\nFloating-point double precision");
        double myDouble = 2.5;

        System.out.println(myDouble);

        System.out.println(Double.BYTES + " wielkosc w bajtach");
        System.out.println(Double.MAX_VALUE+ " maksymalna wartosc");
        System.out.println(Double.MIN_VALUE + " minimalna wartosc");

        System.out.println("\nBoolean");
        boolean myBooleanT = true;
        boolean myBooleanF = false;

        System.out.println(myBooleanT);
        System.out.println(myBooleanF);
    }
}

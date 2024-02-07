import java.util.Scanner;

public class Tmp4 {
    public static void main(String[] args) {
        int board = 0b0000_0000_0000_0000_0000_0000_0000_0000;
        boolean end = false;
        boolean cross = true;

        int freeFields = 9;

        while (!end) {
            for (int i = 0; i <= 16; i += 2) {
                int field = (board >> i) & 0b11;
                if (field == 0) {
                    System.out.print(" ");
                } else if (field == 1) {
                    System.out.print("o");
                } else {
                    System.out.print("x");
                }
                if (i != 4 && i != 10 && i != 16) {
                    System.out.print("\u2502");
                } else {
                    if (i != 16) {
                        System.out.println();
                        System.out.print("\u2501\u2501\u2501\u2501\u2501");
                        System.out.println();
                    }
                }
            }
            System.out.println();

            //-------------------------------------------------------

            int firstField;
            int secondField;
            int thirdField;
            boolean areNotFree;
            boolean areEqual;
            for (int i = 0; i <= 12; i += 6) {
                firstField = board >> i & 0b11;
                secondField = board >> (i + 2) & 0b11;
                thirdField = board >> (i + 4) & 0b11;

                areNotFree = firstField != 0b00 && secondField != 0b00 && thirdField != 0b00;
                areEqual = firstField == secondField && secondField == thirdField;
                if (areEqual && areNotFree) {
                    end = true;
                    break;
                }
            }
            for (int i = 0; i <= 4; i += 2) {
                firstField = board >> i & 0b11;
                secondField = board >> (i + 6) & 0b11;
                thirdField = board >> (i + 12) & 0b11;

                areNotFree = firstField != 0b00 && secondField != 0b00 && thirdField != 0b00;
                areEqual = firstField == secondField && secondField == thirdField;
                if (areEqual && areNotFree) {
                    end = true;
                    break;
                }
            }
            for (int i = 0; i <= 2; i += 2) {
                firstField = board >> i * 2 & 0b11;
                secondField = board >> 8 & 0b11;
                thirdField = board >> 16 - 2 * i & 0b11;

                areNotFree = firstField != 0b00 && secondField != 0b00 && thirdField != 0b00;
                areEqual = firstField == secondField && secondField == thirdField;
                if (areEqual && areNotFree) {
                    end = true;
                }
            }



            //-------------------------------------------------------

            if (!end) {
                if (freeFields > 0) {
                    freeFields--;
                } else {
                    System.out.println("Remis :(");
                    end = true;
                }
            }

            if (!end) {
                System.out.println("Enter field position");
                int position = new Scanner(System.in).nextInt();
                int tmp;
                if (cross) {
                    tmp = (board >> 2 * position) | 0b10;
                    board = board | tmp << 2 * position;
                    cross = false;
                } else {
                    tmp = (board >> 2 * position) | 0b01;
                    board = board | tmp << 2 * position;
                    cross = true;
                }
            } else {
                if (!cross) {
                    System.out.println("x WINS");
                } else {
                    System.out.println("o WINS");
                }
            }

        }

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Tmp {
    public static void main(String[] args) {
//        start();
        start(2, new int[][]{{'a', 3}, {'b', 5}}, new int[]{6}, new int[]{3});
    }

    public static void start(int players, int[][] pawns, int[] fieldsToMove, int[] pawnToMove) {
        int[] points = {0, 0, 0, 0};
        String[][] map = getStartingMap();
        for (int[] ints : pawns) {
            String pawn = (char) ints[0] + "";
            switch (pawn) {
                case "a" -> {
                    moveFromHomeA(map);
                    movePawn(map, ints[1], points, false, 0);
                }
                case "b" -> {
                    moveFromHomeB(map);
                    movePawn(map, ints[1], points, false, 10);
                }
                case "c" -> {
                    moveFromHomeC(map);
                    movePawn(map, ints[1], points, false, 20);
                }
                case "d" -> {
                    moveFromHomeD(map);
                    movePawn(map, ints[1], points, false, 30);
                }
            }
        }

        int[] cords = getMapFields(pawnToMove[0]);
        char player = map[cords[0]][cords[1]].charAt(0);

        int counter = 0;
        if (fieldsToMove[0] == 6) counter++;
        movePawn(map, fieldsToMove[0], points, false, pawnToMove[0]);

        if (fieldsToMove[0] != 6) {
            counter = 0;
            player++;
            if (player == 97 + players) {
                player = 'a';
            }
        }

        player = play(map, players, player, false, counter, points);
        System.out.println("Wygrał player: " + player);
    }

    public static void start() {
        String[][] map = getStartingMap();
        System.out.println("Podaj ilość graczy:");
        int playerCount = new Scanner(System.in).nextInt();

        char player = (char) ((int) (Math.random() * playerCount + 97));
        boolean end = false;
        int counter = 0;
        int[] points = {0, 0, 0, 0};

        player = play(map, playerCount, player, end, counter, points);
        System.out.println("Wygrał player: " + player);
    }

    private static char play(String[][] map, int playerCount, char player, boolean end, int counter, int[] points) {
        while (!end) {
            printMap(map);
            System.out.println("Tura gracza " + player);

            int fieldsToMove = (int) (Math.random() * 6 + 1);
            System.out.println("wylosowano: " + fieldsToMove);

            if (fieldsToMove == 6) {
                counter++;
                System.out.println("Czy chcesz wyjsc z domku T/N:");
                String answer = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);
                if (answer.equals("t")) {
                    switch (player) {
                        case 'a' -> moveFromHomeA(map);
                        case 'b' -> moveFromHomeB(map);
                        case 'c' -> moveFromHomeC(map);
                        default -> moveFromHomeD(map);
                    }
                } else {
                    movePawn(map, fieldsToMove, points, true, -1);
                }
            } else {
                movePawn(map, fieldsToMove, points, true, -1);
            }

            if (points[0] == 4 || points[1] == 4 || points[2] == 4 || points[3] == 4) {
                end = true;
            }

            if ((fieldsToMove != 6 || counter == 3) && !end) {
                counter = 0;
                player++;
                if (player == 97 + playerCount) {
                    player = 'a';
                }
            }
        }
        return player;
    }

    private static void movePawn(String[][] map, int fieldsToMove, int[] points, boolean write, int additional) {
        int pawnField = additional;
        if (write) {
            System.out.println("podaj numer pola na ktorym stoi pionek ktory nalezy przesunac :");
            System.out.println("(podaj -1 jesli nie masz pionkow na planszy)");
            pawnField = new Scanner(System.in).nextInt();
        }
        if (pawnField != -1) {
            int[] pawnCords = getMapFields(pawnField);
            String pawn = map[pawnCords[0]][pawnCords[1]];
            switch (pawn.substring(0, 1)) {
                case "a" -> {
                    if (pawnField + fieldsToMove >= 40) {
                        points[0]++;
                        removePawn(map, pawnCords, pawn);
                    } else {
                        int[] nextField = getMapFields(pawnField + fieldsToMove);
                        String mapField = map[nextField[0]][nextField[1]];
                        moveToNextField(map, pawnCords, nextField, pawn, mapField);
                    }
                }
                case "b" -> {
                    if (pawnField + fieldsToMove >= 10 && pawnField < 10) {
                        points[1]++;
                        removePawn(map, pawnCords, pawn);
                    } else {
                        moveSpecific(map, fieldsToMove, pawnField, pawnCords, pawn);
                    }
                }
                case "c" -> {
                    if (pawnField + fieldsToMove >= 20 && pawnField < 20) {
                        points[2]++;
                        removePawn(map, pawnCords, pawn);
                    } else {
                        moveSpecific(map, fieldsToMove, pawnField, pawnCords, pawn);
                    }
                }
                case "d" -> {
                    if (pawnField + fieldsToMove >= 30 && pawnField < 30) {
                        points[3]++;
                        removePawn(map, pawnCords, pawn);
                    } else {
                        moveSpecific(map, fieldsToMove, pawnField, pawnCords, pawn);
                    }
                }
            }
        }
    }

    private static void moveSpecific(String[][] map, int fieldsToMove, int pawnField, int[] pawnCords, String pawn) {
        int[] nextField = null;
        if (pawnField + fieldsToMove >= 40) {
            nextField = getMapFields(pawnField + fieldsToMove - 40);
        } else {
            nextField = getMapFields(pawnField + fieldsToMove);
        }
        String mapField = map[nextField[0]][nextField[1]];
        moveToNextField(map, pawnCords, nextField, pawn, mapField);
    }

    private static void removePawn(String[][] map, int[] pawnCords, String pawn) {
        if (pawn.length() > 1) {
            map[pawnCords[0]][pawnCords[1]] = pawn.substring(0, 1);
        } else {
            map[pawnCords[0]][pawnCords[1]] = "x";
        }
    }


    private static void moveToNextField(String[][] map, int[] pawnCords, int[] nextField, String pawn, String mapField) {
        removePawn(map, pawnCords, pawn);
        if (mapField.equals(pawn)) {
            map[nextField[0]][nextField[1]] = pawn + pawn;
        } else if (!mapField.equals("x")) {
            if (mapField.length() > 1) {
                beat(mapField, map);
            }
            beat(mapField, map);
            map[nextField[0]][nextField[1]] = pawn.substring(0, 1);
        } else {
            map[nextField[0]][nextField[1]] = pawn.substring(0, 1);
        }
    }


    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getMapFields(int xy) {
        int[][] mapFields = new int[][]{
                {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 7, 7, 7, 7, 8, 9, 10, 11, 11, 11, 10, 9, 8, 7, 7, 7, 7, 7, 6, 5, 5, 5, 5, 5, 4, 3, 2, 1, 1},
                {7, 7, 7, 7, 7, 8, 9, 10, 11, 11, 11, 10, 9, 8, 7, 7, 7, 7, 7, 6, 5, 5, 5, 5, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 6}
        };
        return new int[]{mapFields[0][xy], mapFields[1][xy]};
    }

    public static void moveFromHomeA(String[][] map) {
        if (map[1][10].equals("a")) {
            map[1][10] = " ";
        } else if (map[1][11].equals("a")) {
            map[1][11] = " ";
        } else if (map[2][10].equals("a")) {
            map[2][10] = " ";
        } else {
            map[2][11] = " ";
        }

        if (map[1][7].equals("x")) {
            map[1][7] = "a";
        } else if (map[1][7].equals("a")) {
            map[1][7] = "aa";
        } else {
            beat(map[1][7], map);
            map[1][7] = "a";
        }
    }

    public static void moveFromHomeB(String[][] map) {
        if (map[10][10].equals("b")) {
            map[10][10] = " ";
        } else if (map[10][11].equals("b")) {
            map[10][11] = " ";
        } else if (map[11][10].equals("b")) {
            map[11][10] = " ";
        } else {
            map[11][11] = " ";
        }

        if (map[7][11].equals("x")) {
            map[7][11] = "b";
        } else if (map[7][11].equals("b")) {
            map[7][11] = "bb";
        } else {
            beat(map[7][11], map);
            map[7][11] = "b";
        }
    }

    public static void moveFromHomeC(String[][] map) {
        if (map[10][1].equals("c")) {
            map[10][1] = " ";
        } else if (map[10][2].equals("c")) {
            map[10][2] = " ";
        } else if (map[11][1].equals("c")) {
            map[11][1] = " ";
        } else {
            map[11][2] = " ";
        }

        if (map[11][5].equals("x")) {
            map[11][5] = "c";
        } else if (map[11][5].equals("c")) {
            map[11][5] = "cc";
        } else {
            beat(map[11][5], map);
            map[11][5] = "c";
        }
    }

    public static void moveFromHomeD(String[][] map) {
        if (map[1][1].equals("d")) {
            map[1][1] = " ";
        } else if (map[1][2].equals("d")) {
            map[1][2] = " ";
        } else if (map[2][1].equals("d")) {
            map[2][1] = " ";
        } else {
            map[2][2] = " ";
        }

        if (map[5][1].equals("x")) {
            map[5][1] = "d";
        } else if (map[5][1].equals("d")) {
            map[5][1] = "dd";
        } else {
            beat(map[5][1], map);
            map[5][1] = "d";
        }
    }

    public static void beat(String pawn, String[][] map) {
        switch (pawn) {
            case "a" -> enterHomeA(map);
            case "b" -> enterHomeB(map);
            case "c" -> enterHomeC(map);
            default -> enterHomeD(map);
        }
    }

    public static void enterHomeA(String[][] map) {
        if (map[1][10].equals(" ")) {
            map[1][10] = "a";
        } else if (map[1][11].equals(" ")) {
            map[1][11] = "a";
        } else if (map[2][10].equals(" ")) {
            map[2][10] = "a";
        } else {
            map[2][11] = "a";
        }
    }

    public static void enterHomeB(String[][] map) {
        if (map[10][10].equals(" ")) {
            map[10][10] = "b";
        } else if (map[10][11].equals(" ")) {
            map[10][11] = "b";
        } else if (map[11][10].equals(" ")) {
            map[11][10] = "b";
        } else {
            map[11][11] = "b";
        }
    }

    public static void enterHomeC(String[][] map) {
        if (map[10][1].equals(" ")) {
            map[10][1] = "c";
        } else if (map[10][2].equals(" ")) {
            map[10][2] = "c";
        } else if (map[11][1].equals(" ")) {
            map[11][1] = "c";
        } else {
            map[11][2] = "c";
        }
    }

    public static void enterHomeD(String[][] map) {
        if (map[1][1].equals(" ")) {
            map[1][1] = "d";
        } else if (map[1][2].equals(" ")) {
            map[1][2] = "d";
        } else if (map[2][1].equals(" ")) {
            map[2][1] = "d";
        } else {
            map[2][2] = "d";
        }
    }

    public static String[][] getStartingMap() {
        return new String[][]{
                {"  ", " ", " ", " ", " ", " ", " ", "0", " ", " ", " ", " ", " "},
                {"  ", "d", "d", " ", " ", "x", "x", "x", " ", " ", "a", "a", " "},
                {"  ", "d", "d", " ", " ", "x", " ", "x", " ", " ", "a", "a", " "},
                {"  ", " ", " ", " ", " ", "x", " ", "x", " ", " ", " ", " ", " "},
                {"  ", " ", " ", " ", " ", "x", " ", "x", " ", " ", " ", " ", " "},
                {"30", "x", "x", "x", "x", "x", " ", "x", "x", "x", "x", "x", " "},
                {"  ", "x", " ", " ", " ", " ", " ", " ", " ", " ", " ", "x", " "},
                {"  ", "x", "x", "x", "x", "x", " ", "x", "x", "x", "x", "x", "10"},
                {"  ", " ", " ", " ", " ", "x", " ", "x", " ", " ", " ", " ", " "},
                {"  ", " ", " ", " ", " ", "x", " ", "x", " ", " ", " ", " ", " "},
                {"  ", "c", "c", " ", " ", "x", " ", "x", " ", " ", "b", "b", " "},
                {"  ", "c", "c", " ", " ", "x", "x", "x", " ", " ", "b", "b", " "},
                {"  ", " ", " ", " ", " ", "20", " ", " ", " ", " ", " ", " ", " "}
        };
    }
}

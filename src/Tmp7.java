public class Tmp7 {
    public static void main(String[] args) {
        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
        };

        try{
            fun(arr, 0, 0);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("dzialam");

        try{
            fun(arr, 0, 0);
        } catch (Exception ex) {
            System.out.println(ex);
        }

//        new XX('c');
    }

    public static int fun(int[][] tab, int i, int j){
        if (i == 0 && j == 0) {
            System.out.println("H" + tab[i][j]);
            return tab[i][j] + fun(tab, i + 1, j + 1);
        } else {
            return 0;
        }
    }
}

class XX {
    public XX(int i) {
        this(i + 1f);
    }

    public XX(char r) {
    }

    public XX(float f) {
        System.out.println("F");
    }

    public XX(double d) {
        System.out.println("D");
    }
}

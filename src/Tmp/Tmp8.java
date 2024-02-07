package Tmp;

public class Tmp8 {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        try {
            fun(mat, 0, 0);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        A a = new A(15);
        new A(10);
        new A(5);

        B.make().show();
    }

    public static void fun(int[] tab, int i, int j) {
        for (int k = 0; k < i; k++) {
            System.out.println("[" + tab[k] + ", ");
        }
        System.out.println();
    }

    public static int fun(int[][] tab, int i, int j) {
        if (i == 0 && j == 0) {
            System.out.println("H" + tab[i][j]);
            return tab[i][j] + fun(tab, i + 1, j + 1);
        } else {
            return 0;
        }
    }
}

class A {
    int wrtI;
    A next;

    private A(){
        System.out.println("G" + wrtI);
        B.make().add(this);
    }

    public A(int wrtI){
        this();
        this.wrtI = wrtI;
        System.out.println("F" + wrtI);
    }

    public A(A objA) {
        this(objA.wrtI = 1);
        System.out.println("E" + wrtI);
    }

    public String toString() {
        return "D" + wrtI;
    }
}

class B {
    private static B struct;
    public static B make() {
        System.out.println("C");
        if (struct == null)
            struct = new B();
        return struct;
    }

    private A head;
    private B() {
        head = null;
        System.out.println("B");
    }

    public void add(A obj){
        if (head == null) {
            head = obj;
        } else {
            A tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = obj;
        }
        System.out.println("A");
    }

    public void show() {
        A tmp = head;
        while (tmp != null){
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }

}

public class Tmp3 {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        try {
            fun(mat, 0, 0);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        XX a = new XX(15);
        new XX(10);
        new XX(5);


        B.make().show();
    }

    private static void fun(int[] tab, int i, int j) {
        for (int k = 0; k < i; k++) {
            System.out.print("[" + tab[k] + ", ");
        }
        System.out.println();
    }

    private static int fun(int[][] tab, int i, int j) {
        if (i == 0 && j == 0) {
            System.out.println("hi" + tab[i][j]);
            return tab[i][j] = fun(tab, i - 1, j + 1);
        } else {
            return 0;
        }
    }

}

class A {
    int wrt;
    A next;

    private A() {
        System.out.println("A" + wrt);
        B.make().add(this);
    }

    public A(int wrt) {
        this();
        this.wrt = wrt;
        System.out.println("B" + wrt);
    }

    public A(A objA) {
        this(objA.wrt - 1);
        System.out.println();
    }

    public String toString() {
        return "D" + wrt;
    }
}

class B {
    private static B struct;
    public static B make() {
        System.out.println("C");
        if (struct == null) {
            struct = new B();
        }
        return struct;
    }

    private A head;
    private B() {
        head = null;
        System.out.println("B");
    }

    public void add(A obj) {
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

public class Tmp6 {
    public static void main(String[] args) {
        new Z();
        float f = 5F;

        X x = new X();
        try {
            x.napiszCos();
        } catch(Exception e) {
            e.printStackTrace();
        }




        boolean wesola = CzyWesoła_v2(7, new boolean[1001]);
        System.out.println(wesola);
    }

    public static boolean CzyWesoła(int liczba, boolean[] arr) {
        int wynik = 0;
        while (liczba > 0) {
            int cyfra = liczba % 10;
            wynik += cyfra * cyfra;
            liczba /= 10;
        }

        if (wynik == 1) return true;
        else if (arr[wynik]) return false;
        else {
            arr[wynik] = true;
            return CzyWesoła(wynik, arr);
        }
    }

    public static boolean CzyWesoła_v2(int liczba, boolean[] arr) {
        int tmp = liczba;
        while (true){
            int wynik = 0;
            while (tmp > 0) {
                int cyfra = tmp % 10;
                wynik += cyfra * cyfra;
                tmp /= 10;
            }
            if (wynik == 1) return true;
            if (arr[wynik]) return false;
            arr[wynik] = true;
            tmp = wynik;
        }
    }
}

class X {
    public X x;

    public X() {
        System.out.println("X");
        x = new X(5);
    }

    private X(int a) {

    }

    public void napiszCos() throws Exception {
        if (true) {
            throw new Exception();
        }
        System.out.println("lala");
    }
}

class Y extends X {
    public Y(int a) {
        super();
        System.out.println(a);
    }
}

class Z extends Y{
    public Z() {
        super(5);
        System.out.println("Z");
    }
}

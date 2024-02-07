public class Tmp5 {
    public static void main(String[] args) {
        char c = '1';
        if (c <= '9') {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

    }
}

class Kot {

}

class AAA {

    public static void main(String[] args) {
        String[] txt = {"Ala"};
        new AAA().change(txt);
        System.out.println(txt[0]);
    }

    void change(String[] s) {
        s[0] = s[0] + " ma kota ";
    }

}
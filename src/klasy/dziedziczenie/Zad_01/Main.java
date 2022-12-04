package klasy.dziedziczenie.Zad_01;

public class Main {
    public static void main(String[] args) {
        Telefon myTel = new Telefon("GSM 900 Phase 1", "Red");
        Komorka myKom = new Komorka("GSM 900 Phase 2", "Blue");
        Smartfon mySmart = new Smartfon("GSM 900 Phase 3", "Green");

        System.out.println("call telefon");
        myTel.zadzwon("123-456-789");
        System.out.println("show telefon");
        myTel.wyswietlHistoriePolaczen();

        System.out.println("call Komorka");
        myKom.zadzwon("123-456-789");
        myKom.zadzwon("098-765-432");
        System.out.println("show Komorka");
        myKom.wyswietlHistoriePolaczen();

        mySmart.getFriends()[0] = new Osoba("Bob", "Ross", "123-456-789");
        System.out.println("call Smartfon");
        mySmart.zadzwon("123-456-789");
        mySmart.zadzwon("098-765-432");
        System.out.println("show Smartfon");
        mySmart.wyswietlHistoriePolaczen();
    }
}
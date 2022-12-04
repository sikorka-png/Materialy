package klasy.dziedziczenie.Zad_01;

public class Telefon {
    private String interfejsKomunikacyjny;
    private String color;

    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println(numer);
    }

    public String getInterfejsKomunikacyjny() {
        return interfejsKomunikacyjny;
    }

    public String getColor() {
        return color;
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}

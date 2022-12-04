package klasy.proste_klasy.Zad_07;

public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        System.out.println("Pole podstawy wynosi: " + this.promien * this.promien * Math.PI);
        System.out.println("Objętość sześcianu wynosi: " + this.promien * this.promien * Math.PI * this.wysokosc);
    }
}

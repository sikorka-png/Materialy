package klasy.proste_klasy.Zad_01;

public class Rect {
    Point lewyGorny;
    Point prawyDolny;

    public Rect(Point p1, Point p2) {
        this.prawyDolny = p1;
        this.lewyGorny = p2;
    }

    public void countField() {
        double pole = Math.abs((prawyDolny.x - lewyGorny.x) * (lewyGorny.y - prawyDolny.y));
        System.out.println("Pole wynosi: " + pole);
    }

    public void countDiagonal() {
        System.out.println("Przekątna wynosi: ");
    }
}
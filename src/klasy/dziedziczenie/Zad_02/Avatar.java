package klasy.dziedziczenie.Zad_02;

public class Avatar {
    private char characterName, side;
    private double capacity;
    private Stuff hand;
    private Stuff[] bagpack;

    public Stuff getHand() {
        return hand;
    }


    double attack() {
        if (hand instanceof Weapon) {
            return ((Weapon) hand).baseAttack;
        } else {
            System.out.println("To nie jest bron!");
            return 0;
        }

    }
}
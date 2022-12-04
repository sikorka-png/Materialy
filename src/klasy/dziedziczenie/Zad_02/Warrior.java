package klasy.dziedziczenie.Zad_02;

public class Warrior extends Avatar {

    double attack() {
        if (Warrior.this.getHand() instanceof Weapon) {
            return this.getHand().getBaseAttack() * this.getHand().getBaseAttack();
        } else {
            System.out.println("To nie jest bron!");
            return 0;
        }
    }

}

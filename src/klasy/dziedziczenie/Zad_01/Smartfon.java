package klasy.dziedziczenie.Zad_01;

public class Smartfon extends Komorka {

    private Osoba[] friends = new Osoba[10];

    public Smartfon(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    public void wyswietlHistoriePolaczen() {
        if (lastCallTabFull) {

            for (int i = lastCallIndex; i >= 0; i--) {
                System.out.println(checkIfFriend(lastCallTab[i]));
            }

            for (int i = lastCallTab.length - 1; i >= lastCallIndex + 1; i--) {
                System.out.println(checkIfFriend(lastCallTab[i]));
            }

        } else {
            for (int i = lastCallTab.length - 1; i >= 0; i--) {
                if (lastCallTab[i] != null)
                    System.out.println(checkIfFriend(lastCallTab[i]));
            }
        }
        System.out.println();

    }

    private String checkIfFriend(String number) {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                if (this.friends[i].getNumber().equals(number)) {
                    number = this.friends[i].toString();
                }
            }
        }
        return number;
    }

    public Osoba[] getFriends() {
        return friends;
    }
}
package heroicGame.Character;

public class Troll extends Character {
    public Troll(String name) {
        super(name, 99, 99);
    }

    @Override
    public void fight() {
        System.out.println("massue");
    }
}


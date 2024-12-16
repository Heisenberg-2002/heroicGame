package heroicGame.Character;

public class Barbarian extends Character {
    public Barbarian(String name) {
        super(name, 20, 20);
    }

    @Override
    public void fight() {
        System.out.println("massue");
    }
}

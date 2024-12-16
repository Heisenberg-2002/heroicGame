package heroicGame.Character;

public class Knight extends Character {
    public Knight(String name) {
        super(name, 10, 8);
    }

    @Override
    public void fight() {
        System.out.println("épée");
    }
}

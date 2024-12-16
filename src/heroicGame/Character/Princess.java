package heroicGame.Character;

public class Princess extends Character {
    public Princess(String name) {
        super(name, 12, 6);
    }

    @Override
    public void fight() {
        System.out.println("épée");
    }
}

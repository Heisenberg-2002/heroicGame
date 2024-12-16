package heroicGame.Character;
public class Dwarf extends Character {
    public Dwarf(String name) {
        super(name, 15, 25);
    }

    @Override
    public void fight() {
        System.out.println("massue");
    }
}

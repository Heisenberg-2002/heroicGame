package heroicGame;

import heroicGame.Character.*;

public class HeroicFantasyGame {
    public static void main(String[] args) {
        heroicGame.Character.Character knight = new Knight("Arthur");
        heroicGame.Character.Character princess = new Princess("Guinevere");
        heroicGame.Character.Character magician = new Magician("Merlin");
        heroicGame.Character.Character troll = new Troll("Gragnar");
        heroicGame.Character.Character barbarian = new Barbarian("Conan");
        heroicGame.Character.Character dwarf = new Dwarf("Gimli");

        // Test des combats
        knight.fight();  // épée
        princess.fight(); // épée
        magician.fight(); // épée
        troll.fight(); // massue
        barbarian.fight(); // massue
        dwarf.fight(); // massue

        // Test du levelUp
        knight.levelUp();
        System.out.println(knight.getName() + " : PV=" + knight.getHealthPoints() + ", PF=" + knight.getStrengthPoints());
    }
}
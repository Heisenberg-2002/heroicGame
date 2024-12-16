package heroicGame.Character;

public class Magician extends Character {
        public Magician(String name) {
            super(name, 15, 3);
        }

        @Override
        public void fight() {
            System.out.println("épée");
        }
    }

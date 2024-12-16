package heroicGame.Character;

public abstract class Character {
    private String name;
    private int healthPoints;
    private int strengthPoints;

    public Character(String name, int healthPoints, int strengthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void levelUp() {
        this.healthPoints++;
        this.strengthPoints++;
    }

    // Méthode de combat abstraite, redéfinie par les sous-classes
    public abstract void fight();
}
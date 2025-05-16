abstract class Character {
    int health;

    Character(int health) {
        this.health = health;
    }

    abstract void attack(Character enemy);
    abstract void defend(int damage);

    int getHealth() {
        return health;
    }
}

// Fighter class
class Fighter extends Character {
    Fighter() {
        super(100); // Set initial health
    }

    @Override
    void attack(Character enemy) {
        System.out.println("Fighter attacks!");
        enemy.defend(20);
    }

    @Override
    void defend(int damage) {
        health -= damage;
        System.out.println("Fighter takes " + damage + " damage.");
    }
}

// Wizard class
class Wizard extends Character {
    Wizard() {
        super(80);
    }

    @Override
    void attack(Character enemy) {
        System.out.println("Wizard casts a spell!");
        enemy.defend(25);
    }

    @Override
    void defend(int damage) {
        health -= damage;
        System.out.println("Wizard takes " + damage + " damage.");
    }
}

// Main class
public class GameDefender {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Wizard wizard = new Wizard();

        fighter.attack(wizard);
        wizard.attack(fighter);

        System.out.println("\nFighter Health: " + fighter.getHealth());
        System.out.println("Wizard Health: " + wizard.getHealth());
    }
}

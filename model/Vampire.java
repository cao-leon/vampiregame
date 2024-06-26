package model;

import java.util.Random;

/**
 * Repräsentiert einen Vampir mit verschiedenen Attributen und Fähigkeiten.
 */
public class Vampire {

    // Attribute
    private String name;
    private int age;
    private int grandness;
    private int hunger;
    private int energy;
    private boolean finallyDead;

    /**
     * Konstruktor für die Klasse Vampire.
     * @param name Der Name des Vampirs.
     * @param age Das Alter des Vampirs.
     */
    public Vampire(String name, int age) {
        this.name = name;
        this.age = age;
        this.grandness = 0;
        this.hunger = 0;
        this.energy = 10;
        this.finallyDead = false;
    }

    // Getter
    /**
     * Getter-Methoden für alle Attribute.
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGreatness() {
        return grandness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isFinallyDead() {
        return finallyDead;
    }

    // Setter
    /**
     * Setter-Methoden für alle Attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGreatness(int grandness) {
        this.grandness = grandness;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setFinallyDead(boolean finallyDead) {
        this.finallyDead = finallyDead;
    }

    // Weitere Methoden
    /**
     * Der Vampir greift einen Menschen an.
     * @param human Der Mensch, der angegriffen wird.
     */
    public void attackHuman(Human human) {
        Random random = new Random();
        if (random.nextInt(100) < 60) {
            System.out.println("Der Mensch ist ruhiggestellt.");
        } else {
            System.out.println("Der Vampir konnte den Menschen nicht ruhigstellen.");
        }
    }

    /**
     * Der Vampir trinkt Blut.
     * @param amount Die Menge an Blut, die getrunken wird.
     */
    public void drinkBlood(double amount) {
        System.out.println("Der Vampir trinkt " + amount + " Liter Blut.");
        // Logik zum Verwandeln des Menschen in einen Vampir hinzufügen
    }

    /**
     * Der Vampir nimmt Schaden.
     * @param damage Der erlittene Schaden.
     */
    public void takeDamage(int damage) {
        Random random = new Random();
        if (random.nextInt(100) < 50) {
            System.out.println("Der Vampir hat aufgrund seiner Transparenz keinen Schaden genommen.");
        } else {
            this.energy -= damage;
            System.out.println("Der Vampir hat " + damage + " Schaden genommen.");
            if (this.energy <= 0) {
                this.finallyDead = true;
                System.out.println("Der Vampir ist endgültig tot.");
            }
        }
    }

    /**
     * Der Vampir greift einen Vampirjäger an.
     * @param vh Der Vampirjäger, der angegriffen wird.
     */
    public void attack(VampireHunter vh) {
        Random random = new Random();
        int damage = random.nextInt(6);
        if (random.nextInt(100) < 50) {
            damage *= 2;
            System.out.println("Doppelte Kraft aktiviert!");
        }
        System.out.println("Der Vampir verursacht " + damage + " Schaden am Vampirjäger.");
    }

    /**
     * Der Vampir versucht zu fliehen.
     */
    public void flee() {
        Random random = new Random();
        if (random.nextInt(100) < 60) {
            System.out.println("Der Vampir ist erfolgreich geflohen.");
        } else {
            System.out.println("Der Vampir konnte nicht fliehen.");
        }
    }
}
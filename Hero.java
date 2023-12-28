package OOP.Sem1;

public abstract class Hero {
    protected int health, armor, maxHealth;
    int [] damage;
    String name;

    public Hero(int health, int armor, int maxHealth, int [] damage, String name){
        this.health = health;
        this.armor = armor;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.name = name;
    }

}

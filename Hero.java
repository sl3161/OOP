package OOP.Sem1;

import java.util.ArrayList;

public abstract class Hero {
protected int health, armor, maxHealth;
protected Vector2 position;
    int [] damage;
    String name;

    public Hero(int health, int armor, int maxHealth, int [] damage, String name, int x, int y){
        this.health = health;
        this.armor = armor;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.name = name;
        this.position = new Vector2(x, y);
    }
    
    public void PrintDistanceToEnemy (ArrayList<Hero> enemies){
        enemies.forEach(n ->System.out.print(position.RangeEnemy(n.position)+ ", "));
    }
}

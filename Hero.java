package OOP.Sem1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero implements Interface {
protected int init;    
protected int health, armor, maxhealth;
public Random damage = new Random();
protected Vector2 position;
    int  mindamage;
    int maxdamage;
    String name;
    

    public Hero(int health, int armor, int maxhealth, int mindamage, int maxdamage, String name, int x, int y){
        this.health = health;
        this.armor = armor;
        this.maxhealth = maxhealth;
        this.mindamage = mindamage;
        this.maxdamage = maxdamage;
        this.name = name;
        this.position = new Vector2(x, y);
    }
    public String getType (){
        return this.toString().split(" ")[0];
    }
    public int GetInit (){
        return init;
    }
    public int getHp (){
        return health;
    }
    public Vector2 getCoords (){
        return position;
    }
    public void GetDamage (int damage){
        if (this.armor-damage>0) this.health = this.health-damage+1;
        else if (this.armor-damage==0) this.health = this.health-damage+1;
        else if (this.armor-damage<0) this.health = this.health-damage-1;  
        if (this.health<0) this.health = 0;  
        if (this.health > maxhealth) this.health = maxhealth;
        }
    public Hero GetClosestOp (ArrayList<Hero> enemies){
        float min = 13;
        Hero closestHero = null ;
        for (Hero hero : enemies) {
            if (hero.health > 0 ){
                if (min > this.position.RangeEnemy(hero.position)){
                   min = position.RangeEnemy(hero.position);  
                   closestHero = hero;
                }
            }    
        }
        return closestHero;
    }    
   @Override
   public void step ( ArrayList <Hero> commandEnemies, ArrayList<Hero> myCommand ){
// System.out.println("Не определено");
}

}

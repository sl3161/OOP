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
        return "Hero";
    }
    public int GetInit (){
        return init;
    }
    public void attack(Hero target) {
        int damage = this.damage.nextInt(this.mindamage,this.maxdamage);
        target.GetDamage(damage);
        // System.out.println(this.toString()+ "  атаковал  " + target);
    }

    public void moveToEnemy ( Hero enemy, ArrayList <Hero> command){
        if (enemy.position.y>this.position.y ) {                                                //условие направления шага в зависимости от того чья координата больше - врага и героя, если они равны ход по этой координате не совершается 
            
            if (this.position.checkCell(command, this.position.x, this.position.y+1)==false){
                                                                                                //сделать ход по y не получилось
            // System.out.println(this.toString()+" по у не получилось сделать ход");
            }
            else {
                this.position.y+=1;
                // System.out.println(this.toString()+ " сделал ход по у ");                        //сделали ход по у, вышли из метода 
                // System.out.println("_____________________________________________");
                return;
            }
        }
        else if (enemy.position.y<this.position.y ) {
            if (this.position.checkCell(command, this.position.x, this.position.y-1)==false){             
            }
            else {
                this.position.y-=1;
                // System.out.println(this.toString()+ " сделал ход по у ");
                return;
                }    
        }
        if (enemy.position.x>this.position.x ) {                                                      //если не вышли из метода , значит по у не получился ход и ходим по х
            if (this.position.checkCell(command, this.position.x+1, this.position.y)==false){         //сделать ход по x не получилось
                // System.out.println(this.toString()+" по х не получилось сделать ход");
             return;
            }
            else {
                this.position.x+=1;   
                // System.out.println(this.toString()+ " сделал ход по х ");                              //сделали ход по x, вышли из метода 
                return;
            }
        }
        else if (enemy.position.x<this.position.x )  {
            if (this.position.checkCell(command, this.position.x-1, this.position.y)==false){             
            // System.out.println(this.toString()+" по х не получилось сделать ход");
            return;
            }
            else {
                // System.out.println(this.toString()+ " сделал ход по х ");
                this.position.x-=1;
                return;
                }    
        }
        
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

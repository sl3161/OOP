package OOP.Sem1;

import java.util.ArrayList;

public abstract class Mag extends Hero {
    public Mag(String name, int health, int armor,int maxhealth, int mindamage, int x, int y, int maxdamage){
        super (health,
            armor,
            maxhealth,
            mindamage,
            maxdamage,
            name, x, y);
            this.position = new Vector2(x, y);
            init = 2;   
    }
    public void hili(Hero target) {
        
        int damage = this.damage.nextInt(this.mindamage,this.maxdamage);
        target.GetDamage(damage);
        
    }
    public Hero getFriend (ArrayList<Hero> myCommand){
        Hero friend = this;
        int min = 0;
        for (Hero hero : myCommand) {
            if (hero.health>0 && hero.health<hero.maxhealth && !hero.equals(this) && hero.maxhealth-hero.health>min ){
            min = hero.maxhealth-hero.health; 
            friend = hero;
            }
            
        }
        return friend;
    } 
    @Override
    public  void step (ArrayList<Hero> commandEnemies, ArrayList<Hero> myCommand ){
        if (this.health> 0) {
            Hero target = getFriend(myCommand);
            if (target == null) return;
            hili(target);
            // System.out.println(this.toString()+ "  лечил  " + target);
            
         }
    }

    public String toString() {
        // TODO Auto-generated method stub
        return (" Здоровье: "+ health+"/"+maxhealth + " "+ " иициатива "+ init+ " лечение " + mindamage+ "/"+ maxdamage +" "+ "броня: "+ armor+" "+"координаты х,у " + position.x + " ," + position.y);
    
}

}

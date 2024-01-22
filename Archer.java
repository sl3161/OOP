package OOP.Sem1;

import java.util.ArrayList;

public abstract class Archer extends Hero {
private int stockOfArrows = 3;
    public Archer(String name, int health, int armor,int maxhealth, int mindamage, int x, int y, int stockOfArrows, int maxdamage){
        super (health,
            armor,
            maxhealth,
            mindamage,
            maxdamage,
            name, x, y);
            this.position = new Vector2(x, y);
            stockOfArrows = 3;
            init = 3;   
    }
    
    public void attack(Hero target) {
        int damage = this.damage.nextInt(this.mindamage,this.maxdamage);
        target.GetDamage(damage);
        //System.out.println(this.toString()+" стрелял в "+target.toString());
    }
    @Override
    public  void step (ArrayList<Hero> commandEnemies, ArrayList<Hero> myCommand ){
        if (this.health> 0 && this.stockOfArrows>0) {
            Hero target = GetClosestOp(commandEnemies);
            if ( target == null) return;
            attack(target);
            if (target.health < 0 ) target.health = 0;
            if (this.stockOfArrows>0) this.stockOfArrows-=1;
            // System.out.println(this.toString()+ "  атаковал  " + target);
            
         }
    }
    public void setstock(int n){
        this.stockOfArrows = n;
    }
    public int getstock(){
        return stockOfArrows;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Здоровье: "+health+"/"+ maxhealth+" "+ "инициатива "+ init+ " " +"броня: "+ armor+" макс повреждение"+" "+ maxdamage+" "+"координаты х,у " + position.x + " ," + position.y);
    }
    

    
}

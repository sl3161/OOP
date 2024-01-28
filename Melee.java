package OOP.Sem1;

import java.util.ArrayList;

public abstract class Melee extends Hero {
    public Melee(String name, int health, int armor,int maxhealth, int mindamage, int x, int y, int maxdamagy){
        super (100,
        5,
        100,
        10,20, name, x, y);
        this.position = new Vector2(x, y);
        init = 1;
            
    }
    @Override
    public  void step (ArrayList<Hero> commandEnemies,ArrayList<Hero> myCommand){
        Hero target = GetClosestOp(commandEnemies);
        if ( target == null) return;
        if (this.health> 0 && this.position.RangeEnemy(target.position )<2 ) {
            attack(target);
            
         }
        if (this.health>0 && this.position.RangeEnemy(target.position)>=2 ) {
            
            moveToEnemy(target, myCommand);
         }
    }
   
    @Override
    public String getType (){
        return "Melee";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Здоровье: "+health+"/"+ maxhealth+"инициатива "+ init+ " "+"броня: "+ armor+" макс повреждение"+" "+ maxdamage+" "+"координаты х,у " + position.x + " ," + position.y);
    }
}

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
        
    

     public void attack(Hero target) {
        int damage = this.damage.nextInt(this.mindamage,this.maxdamage);
        target.GetDamage(damage);
    }
    @Override
    public  void step (ArrayList<Hero> commandEnemies,ArrayList<Hero> myCommand){
        Hero target = GetClosestOp(commandEnemies);
        if ( target == null) return;
        if (this.health> 0 && this.position.RangeEnemy(target.position )<2 ) {
            attack(target);
            // System.out.println(this.toString()+ "  атаковал  " + target);
         }
        if (this.health>0 && this.position.RangeEnemy(target.position)>=2 ) {
            
            moveToEnemy(target, myCommand);
         }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Здоровье: "+health+"/"+ maxhealth+"инициатива "+ init+ " "+"броня: "+ armor+" макс повреждение"+" "+ maxdamage+" "+"координаты х,у " + position.x + " ," + position.y);
    }
}

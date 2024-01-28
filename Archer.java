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
    
    @Override
    public  void step (ArrayList<Hero> commandEnemies, ArrayList<Hero> myCommand ){
        if (this.health> 0) {
            Hero target = GetClosestOp(commandEnemies);
            if (this.stockOfArrows>0){      //проверяем есть ли стрелы
            if ( target == null) return;
            attack(target);                  //если есто - атакуем
            if (target.health < 0 ) target.health = 0;     //здоровье противника после атаки ушло ниже 0 - делаем 0
            if (this.stockOfArrows>0) this.stockOfArrows-=1;   //запас стрел - 1
            }
            else {                                   //если стрел нет - реализуем метод движения к противнику и атаки при приближении
                    if ( target == null) return;
                    this.maxdamage=mindamage+1;      //при этом уменьшаем силу атаки
                    if (this.health > 0 && this.position.RangeEnemy(target.position )<2 ) {   //если уже близко к врагу - атакуем
                     attack(target);
                    //  System.out.println(this.toString()+ "  атаковал  " + target);
                    }
                     if (this.position.RangeEnemy(target.position)>=2 ) {    //если далеко - движемся к врагу
                
                     moveToEnemy(target, myCommand);
                     }
                 }
            
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
        return ("Здоровье: "+health+"/"+ maxhealth+" "+ "инициатива "+ init+ " " +"броня: "+ armor+" макс повреждение"+" "+ maxdamage+" "+"запас стрел " + stockOfArrows);
    }
    

    
}

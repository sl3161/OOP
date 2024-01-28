package OOP.Sem1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Mag extends Hero {
    private int mana;
    private boolean flag = false;
    protected Random chance = new Random();
    public Mag(String name, int health, int armor,int maxhealth, int mindamage, int x, int y, int maxdamage){
        super (health,
            armor,
            maxhealth,
            mindamage,
            maxdamage,
            name, x, y);
            this.position = new Vector2(x, y);
            init = 2; 
            mana = 10;  
    }
    private void rest(){                                          //метод восстановления маны
        mana = 10;
    }
    private boolean meleeDied ( ArrayList <Hero> myCommand){      //метод провери на наличие живой пехоты
        for (Hero hero: myCommand) {
            if ( hero.getType().equals("Melee")&& hero.getHp()>0) return false;
            
        }
        return true;
    }
    private Hero targetVoscr ( ArrayList <Hero> myCommand){     //метод выбора пехотинца для воскрешения
        Hero diedMelee = null;
        for (Hero hero: myCommand) {
            if (hero.getType().equals("Melee")&& hero.getHp()==0) diedMelee = hero ;
            
        }
        return diedMelee;
    
    }
    public void hili(Hero target) {                            //метод лечения
        
        int damage = this.damage.nextInt(this.mindamage,this.maxdamage);
        target.GetDamage(damage);
        this.mana -=1;
        
    }
    public Hero getFriend (ArrayList<Hero> myCommand){         //выбор члена ксвоей команды для лечения
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

    private void voscr (Hero target_voscr){             //метод воскрешения
        target_voscr.health = target_voscr.maxhealth;
    }
    @Override
    public  void step (ArrayList<Hero> commandEnemies, ArrayList<Hero> myCommand ){
        
        if (this.health> 0){
           if (meleeDied(myCommand)){                 //проверка на наличие живой пехоты в своей команде
           int ch = chance.nextInt(1,4);  //если все мертвы шанс на воскрешение

              if (flag == true||ch==2){        //если установлен флаг на восствновление маны ( то есть в прошлом шаге выпал шанс на воскрешение пехотинца) или выпал шанс в этом шаге )
                  if (mana == 10 ){            // если мана полная то воскрешаем и флаг пополнения маны убираем
                  Hero target_voscr = targetVoscr(myCommand);  
                  voscr(target_voscr);
                  flag = false;
                  mana = 5;                   //после воскрешения мана уменьшается в 2 раза
                //   System.out.println(this.toString()+ "  воскресил  " + target_voscr); 
                  }
                  else{                      //если мана не полная ход пропускается для восстановления маны          
                  rest();
                  flag = true;
                    // System.out.println(this.toString()+ " восполнил ману ");
                    return;
                  }
              }
              else if (flag==false && ch!=2){           //если флаг на восттановление маны не установлен и шанс на воскрешение не выпал то лечим 
                Hero target = getFriend(myCommand);
                if (target == null) return;             //если лечить некого 
                hili(target);
                // System.out.println(this.toString()+ "  лечил  " + target); 
              }
            }
            else {
                Hero target = getFriend(myCommand);       //если есть живые пехотинцы уходим сюда и лечим
                if (target == null) return;
                hili(target);
                // System.out.println(this.toString()+ "  лечил  " + target);
            }
                                 
        }
        else return;     //если маг мерт пропускаем ход 
}

public String toString() {
    // TODO Auto-generated method stub
    return (" Здоровье: "+ health+"/"+maxhealth + " "+ " иициатива "+ init+ " лечение " + mindamage+ "/"+ maxdamage +" "+ "броня: "+ armor+" "+"координаты х,у " + position.x + " ," + position.y);
}
} 

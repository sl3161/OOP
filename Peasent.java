package OOP.Sem1;

import java.util.ArrayList;

public class Peasent extends Hero {
    public Peasent(String name, int x, int y){
        super (100,
            0,
            100,
            0,0, name, x, y);
            init = 0;
    }
   
    public void getArraw (Hero target){

        if ((((Archer)target).getstock()) < 3 && target !=null) ((Archer)target).setstock(((Archer)target).getstock()+1);
        else return;
    }
   
    public Hero GetEmptyArcher (ArrayList<Hero> myCommand){
        int minStock;
        ArrayList<Archer> archers = new ArrayList<>(); 
        Archer emptyArcher = null;
        for (Hero hero : myCommand) {
            if (hero.health>0 && hero instanceof Archer ){  
            archers.add((Archer)hero);
            } 
         if (!archers.isEmpty()) {  
         minStock = archers.get(0).getstock(); 
         emptyArcher = archers.get(0);     
         for (Archer item : archers) {
             if (item.getstock()<minStock && item.getstock()>=0 ){
                minStock=item.getstock();
                emptyArcher = item;
            }
         } 
        }  
        }
        return emptyArcher;
    }  
    @Override
    public  void step (ArrayList<Hero> commandEnemies, ArrayList<Hero> myCommand ){
        if (this.health> 0 ) {
            Hero target = GetEmptyArcher(myCommand);
            if (target == null) return;
            else getArraw(target); 
            
            // System.out.println(this.toString()+"  атаковал  " + target);
         }
    } 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Крестьянин  "+ name+" "+"Здоровье: "+health+"/"+ "инициатива "+ init+" "+maxhealth+" "+"броня: "+ armor+" "+"координаты х,у " + position.x + " ," + position.y);
    }
}

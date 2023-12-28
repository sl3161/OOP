package OOP.Sem1;

public class Monk extends Hero {
    
        public Monk(String name, int x,int y){
            super (50,
                1,
                50,
                new int []{-35,-30}, name, x, y);
                rangeMaxDamage = 4;
                
        }
         int rangeMaxDamage;
        @Override
       
        public String toString() {
            // TODO Auto-generated method stub
            return ("Monk  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor+" " + position.x + " " + position.y);
        
}
}

package OOP.Sem1;

public class Crossbower extends Hero {
    
        public Crossbower(String name){
            super (75,
                5,
                100,
                new int []{20,30}, name);
                rangeMaxDamage = 4;
                
        }
        int rangeMaxDamage;
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return ("Crossbower  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor);
        }
}
package OOP.Sem1;

public class Crossbower extends Archer {
    
        public Crossbower(String name, int x, int y){
            super (name, 90,
                5,
                90,
                5,
                x, y, 3, 10 );
                
               
        }
        
    
        
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return ("Арбалетчик  " + name+" "+ super.toString());
        }
    }

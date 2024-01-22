package OOP.Sem1;


public class Wizard extends Mag {
    
        public Wizard(String name, int x,int y){
            super (name, 120, 0, 120, -7, x, y, -1);      
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return ("Волшебник " + name + " " + super.toString());
        
}
}

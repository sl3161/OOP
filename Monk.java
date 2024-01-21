package OOP.Sem1;

public class Monk extends Mag {
    
        public Monk(String name, int x,int y){
            super (name, 130, 0, 130, -30, x, y, -10);      
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return (" Монах " + name + " " + super.toString());
        
}
}

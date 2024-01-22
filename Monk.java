package OOP.Sem1;

public class Monk extends Mag {
    
        public Monk(String name, int x,int y){
            super (name, 130, 0, 130, -7, x, y, -1);      
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return ("Монах " + name + " " + super.toString());
        
}
}

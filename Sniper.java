package OOP.Sem1;


public class Sniper  extends Archer{
    public Sniper(String name, int x, int y){
        super (name, 100,
            5,
            100,
            5,
            x, y, 3, 13 );
            
           
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (" Лучник  " + name+" "+ super.toString());
    }
}

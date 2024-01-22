package OOP.Sem1;

public class Pikeman extends Melee {
    public Pikeman(String name, int x, int y){
        super (name,120,10,120,6,x,y,14);   
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Копейщик  "+ name+" "+ super.toString());
    }
}

package OOP.Sem1;

public class Pikeman extends Melee {
    public Pikeman(String name, int x, int y){
        super (name,120,10,120,12,x,y,20);   
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (" Копейщик  "+ name+" "+ super.toString());
    }
}

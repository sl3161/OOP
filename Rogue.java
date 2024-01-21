package OOP.Sem1;

public class Rogue extends Melee {
    
    public Rogue(String name, int x, int y){
        super (name, 150, 7, 150, 10, x, y, 16);
            this.position = new Vector2(x, y);
            init = 2;
    }
    protected int rangeMaxDamage;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (" Разбойник  "+ name +" "+ super.toString());
    }
}

package OOP.Sem1;

public class Rogue extends Hero {
    
    public Rogue(String name, int x, int y){
        super (100,
            5,
            100,
            new int []{20,30}, name, x, y);
            this.position = new Vector2(x, y);
            rangeMaxDamage = 4;
    }
    protected int rangeMaxDamage;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Rogue  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor+" " + position.x + " " + position.y);
    }
}

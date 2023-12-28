package OOP.Sem1;

public class Pikeman extends Hero {
    public Pikeman(String name, int x, int y){
        super (100,
        5,
        100,
        new int []{20,30}, name, x, y);
        this.position = new Vector2(x, y);
        rangeMaxDamage = 4;
            
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Pikeman  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor+" " + position.x + " " + position.y);
    }
}

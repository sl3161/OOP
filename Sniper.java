package OOP.Sem1;

public class Sniper  extends Hero{
    public Sniper(String name, int x, int y){
        super (75,
            5,
            100,
            new int []{20,30}, name, x, y);
        rangeMaxDamage =4;    
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Crossbower  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor+" макс повреждение"+" "+ rangeMaxDamage+" " + position.x + " " + position.y);
    }
}

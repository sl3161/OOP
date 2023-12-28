package OOP.Sem1;

public class Peasent extends Hero {
    public Peasent(String name, int x, int y){
        super (100,
            0,
            100,
            new int []{0,0}, name, x, y);
            
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Crossbower  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor+" " + position.x + " " + position.y);
    }
}

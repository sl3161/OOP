package OOP.Sem1;

public class Rogue extends Hero {
    public Rogue(String name){
        super (100,
            5,
            100,
            new int []{20,30}, name);
            
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Rogue  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor);
    }
}

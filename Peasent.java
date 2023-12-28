package OOP.Sem1;

public class Peasent extends Hero {
    public Peasent(String name){
        super (100,
            0,
            100,
            new int []{0,0}, name);
            
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Crossbower  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor);
    }
}

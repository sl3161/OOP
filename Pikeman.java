package OOP.Sem1;

public class Pikeman extends Hero {
    public Pikeman(String name){
        super (100,
            5,
            100,
            new int []{20,30}, name);
            
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Pikeman  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor);
    }
}

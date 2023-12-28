package OOP.Sem1;

public class Wizard  extends Hero{
    public Wizard(String name){
        super (50,
            1,
            50,
            new int []{-35,-30}, name);
            
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Wizard  "+ name+" "+"Здоровье: "+health+"/"+maxHealth+" "+"броня: "+ armor);
    
}
}

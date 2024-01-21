package OOP.Sem1;

public class Peasent extends Hero {
    public Peasent(String name, int x, int y){
        super (100,
            0,
            100,
            0,0, name, x, y);
            init = 0;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (" Крестьянин  "+ name+" "+"Здоровье: "+health+"/"+ "инициатива "+ init+" "+maxhealth+" "+"броня: "+ armor+" "+"координаты х,у " + position.x + " ," + position.y);
    }
}

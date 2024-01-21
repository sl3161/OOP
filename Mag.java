package OOP.Sem1;

public abstract class Mag extends Hero {
    public Mag(String name, int health, int armor,int maxhealth, int mindamage, int x, int y, int maxdamage){
        super (health,
            armor,
            maxhealth,
            mindamage,
            maxdamage,
            name, x, y);
            this.position = new Vector2(x, y);
            init = 2;   
    }
    public String toString() {
        // TODO Auto-generated method stub
        return (" Здоровье: "+ health+"/"+maxhealth + " "+ " иициатива "+ init+ " лечение " + mindamage+ "/"+ maxdamage +" "+ "броня: "+ armor+" "+"координаты х,у " + position.x + " ," + position.y);
    
}

}

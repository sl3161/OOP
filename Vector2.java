package OOP.Sem1;

public class Vector2 {
int x,y;

public Vector2 ( int x, int y){
    this.x = x;
    this.y = y;
}
public float RangeEnemy ( Vector2 posEnemy){
     double distance = Math.sqrt(Math.pow(posEnemy.x-x, 2)+Math.pow(posEnemy.y-y, 2)) ;
     return (float)distance;  
}
    
}

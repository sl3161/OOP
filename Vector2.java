package OOP.Sem1;

import java.util.ArrayList;

public class Vector2 {
int x,y;

public Vector2 ( int x, int y){
    this.x = x;
    this.y = y;
}
public float RangeEnemy ( Vector2 posEnemy){
     double distance = Math.sqrt(Math.pow(posEnemy.x-x, 2)+ Math.pow(posEnemy.y-y, 2)) ;
     return (float)distance;  
}

public boolean checkCell(ArrayList<Hero> command,int x, int y) {
for (Hero item : command) {
    if (item.position.x == x && item.position.y == y){
        // System.out.println("Клетка "+ x +","+ y + "  занята "+ item.toString());
        return false;
    }
    
}  
// System.out.println("Клетка свободна");
   return true;
}
    
}

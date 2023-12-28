package OOP.Sem1;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
    heroWhite = GenerateCommand(0);
    heroBlack = GenerateCommand(3);
    heroWhite.forEach(n->System.out.println(n.toString()));
    System.out.println("_______________________________________");
    heroBlack.forEach(n->System.out.println(n.toString()));
    }

    static ArrayList<Hero> heroWhite = new ArrayList<>();
    static ArrayList<Hero> heroBlack = new ArrayList<>();
   
    static ArrayList<Hero> GenerateCommand ( int n){
        ArrayList<Hero> command = new ArrayList<>();
        Random random = new Random();
        int randNum;
        for (int i = 1; i < 10; i++) {
           randNum = random.nextInt(1,5)+n;
           switch (randNum) {
            case 1:
                command.add(new Crossbower(GetName()));
                break;
            case 2:
                command.add ( new Monk(GetName())) ;  
                break; 
            case 3:
                command.add ( new Pikeman(GetName())) ;  
                break;
            case 4:
                command.add ( new Peasent(GetName())) ;  
                break;
            case 5:
                command.add ( new Rogue(GetName())) ;  
                break; 
            case 6:
                command.add ( new Sniper(GetName())) ;  
                break;    
            case 7:
                command.add ( new Wizard(GetName())) ;  
                break;                      
           }
        }
        return command;
    }
    static String GetName ( ){
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length-1)].name();
    }
}

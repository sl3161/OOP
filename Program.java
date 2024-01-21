package OOP.Sem1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
    heroWhite = GenerateCommand(0,0);
    heroBlack = GenerateCommand(3,9);
    ArrayList <Hero> allHero = new ArrayList<>();
    allHero.addAll(heroBlack);
    allHero.addAll(heroWhite);
    heroBlack.forEach(n->System.out.println(n));
    System.out.println("============================================================");
    heroWhite.forEach(n->System.out.println(n));
    System.out.println("============================================================");
    // allHero.sort(new Comparator<Hero>() {
    //     @Override
    //     public int compare(Hero o1, Hero o2) {
    //         return o2.GetInit()-o1.GetInit();
    //     }
    // });
    allHero.sort((o2,o1)->o1.GetInit() - o2.GetInit());
    //allHero.forEach(n->System.out.println(n));
    for (Hero hero: allHero) {
        if (heroBlack.contains(hero)) hero.step(heroWhite, heroBlack);
        else hero.step(heroBlack, heroWhite);
    }
    }
    
    // heroWhite.get(0).PrintDistanceToEnemy(heroBlack);
    // System.out.println("____________");
    // System.out.print(heroWhite.get(0).GetClosestOp(heroWhite));
    // System.out.println("____________");
    // System.out.print(heroWhite.get(0).GetClosestOp(heroBlack));
    // System.out.println("====================================");
    // heroWhite.get(0).PrintDistanceToEnemy(heroWhite);
    // heroBlack.forEach(n->System.out.println(n.toString()+n.position.RangeEnemy(heroWhite.get(0).position)));
    // heroWhite.forEach(n->System.out.println(n.toString()));
    // System.out.println("====================================================================");
    // heroWhite.forEach ( n->n.step (heroBlack));
    // heroBlack.forEach( n-> System.out.println( n.toString()));
    // }
    
    static ArrayList<Hero> heroWhite = new ArrayList<>();
    static ArrayList<Hero> heroBlack = new ArrayList<>();
   
    static ArrayList<Hero> GenerateCommand ( int n, int y){
        ArrayList<Hero> command = new ArrayList<>();
        Random random = new Random();
        int randNum;
        for (int i = 0; i < 10; i++) {
           randNum = random.nextInt(1,5)+n;

           switch (randNum) {
            case 1:
                command.add(new Crossbower(GetName(), i, y));
                break;
            case 2:
                command.add ( new Monk (GetName(), i, y)) ;  
                break; 
            case 3:
                command.add ( new Pikeman(GetName(), i, y)) ;  
                break;
            case 4:
                command.add ( new Peasent(GetName(), i, y)) ;  
                break;
            case 5:
                command.add ( new Rogue(GetName(), i,y)) ;  
                break; 
            case 6:
                command.add ( new Sniper(GetName(), i,y)) ;  
                break;    
            case 7:
                command.add ( new Wizard(GetName(), i,y)) ;  
                break;                      
           }
        }
        return command;
    }
    static String GetName ( ){
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length-1)].name();
    }
    public void Step (Hero hero) {};
}

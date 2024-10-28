import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Elements: fire>life>rock>elec>water>fire
        Stack<card> fightDeck = new Stack<>();
        Enemy.initEnemies();
        Stack<card> deck = new Stack<>();
        ArrayList<card> hand = new ArrayList<>();
        Encounter currentRoom;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void intro(){
        System.out.println("Hello and welcome to the game!");
        System.out.println("You have decided to explore the Dungeon of Death, but are ill prepared for its dangers");
        System.out.println("You have a basic moveset, but will have to loot better spells and equipment as you go on");
        System.out.println("Let's begin");
    }

    public static void drawHand(ArrayList<card> hand, Stack<card> deck, int drawNum){
        for(int x = 0;x<drawNum;x++){
            hand.add(deck.pop());
        }
    }
    public static void clearHand(ArrayList<card> hand){
        while(hand.size()>0){
            hand.remove(0);
        }
    }
    public static void deckShuffle(Stack<card> fightDeck, Stack<card> drawDeck){
        fightDeck = (Stack<card>)drawDeck.clone();
        Collections.shuffle(fightDeck);
    }
    public static Encounter encounterMaker(int diff, String element){
        /*int enemyNum = (int)((Math.random()*3)+1);
        if(diff<3){
            enemyNum = diff;
        }
        Enemy one;
        Enemy two;
        Enemy three;
        if(enemyNum == 1) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get("");
            three = Enemy.enemies.get("");
        }
        else if(diff%enemyNum == 0&&enemyNum == 2) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + diff / enemyNum);
            three = Enemy.enemies.get("");

        }
        else if(diff%enemyNum == 0&&enemyNum == 3) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + diff / enemyNum);
            three = Enemy.enemies.get(element + diff / enemyNum);

        }
        else if(enemyNum == 2 && diff%enemyNum == 1){
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get("");

        }
        else if(enemyNum == 3 && diff%enemyNum == 1){
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get(element + (diff / enemyNum));


        }
        else{
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get(element + (diff / enemyNum)+1);

        }*/
        Enemy one = Enemy.enemies.get(element + diff);
        Enemy two = Enemy.enemies.get("");
        Enemy three = Enemy.enemies.get("");
        Encounter encounter = new Encounter(diff, one, two, three, element);
        return encounter;
    }
    public static void printCardChoice(ArrayList<card> hand){
        System.out.println("press 1 to choose your first card, 2 for the second, etc");
        for(int x = 0;x<hand.size();x++){
            System.out.println(hand.get(x).getName());
        }
    }
    public static card chooseCard(int x, ArrayList<card> hand){
        return hand.get(x-1);
    }
    public static void printInfo(Enemy enemy, player player){
        System.out.println(enemy.toString());
        System.out.println(player.toString());
    }
    public static void combat(Encounter battle, player player, ArrayList<card> hand, Stack<card> drawDeck, Stack<card> fightDeck){
        while(player.getHealth()>0){
            card card;
            battle = encounterMaker(player.getLevel(), Encounter.getRandomElement());
            System.out.println("You have encountered a wild "+battle.get1().getName());
            printInfo(battle.get1(), player);
            printCardChoice(hand);
            card = chooseCard(scanner.nextInt(), hand);
            
        }
    }
}
